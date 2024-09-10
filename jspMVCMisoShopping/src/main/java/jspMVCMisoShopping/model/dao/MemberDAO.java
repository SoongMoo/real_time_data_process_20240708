package jspMVCMisoShopping.model.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import jspMVCMisoShopping.model.dto.MemberDTO;

public class MemberDAO {
	String jdbcDriver;
	String jdbcURL;
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	String sql;	
	public MemberDAO() {
		jdbcDriver = "oracle.jdbc.driver.OracleDriver";
		jdbcURL ="jdbc:oracle:thin:@localhost:1521:xe";
	}
	public Connection getConnection() {
		Connection co = null;
		try {
			Class.forName(jdbcDriver);
			co = DriverManager.getConnection(jdbcURL, "miso", "1234");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return co;
	}
	public void close() {
		if(rs != null) try {rs.close();}catch(Exception e) {}
		if(pstmt != null) try {pstmt.close();}catch(Exception e) {}
		if(con != null) try {con.close();}catch(Exception e) {}
	}
	public MemberDTO memberSelectOne(String memberNum) {
		MemberDTO dto = null;
		con = getConnection();
		sql = " select MEMBER_NUM, MEMBER_NAME, MEMBER_ID,MEMBER_PW"
				+ "   ,MEMBER_ADDR, MEMBER_ADDR_DETAIL,MEMBER_POST"
				+ "   ,MEMBER_REGIST, GENDER, MEMBER_PHONE1,MEMBER_PHONE2"
				+ "   ,MEMBER_EMAIL,MEMBER_BIRTH,MEMBER_POINT,MEMBER_EMAIL_CONF"
			+ " from members "
			+ " where MEMBER_NUM = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, memberNum);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				dto = new MemberDTO();
				dto.setMemberAddr(rs.getString("MEMBER_ADDR"));
				dto.setMemberAddrDetail(rs.getString("MEMBER_ADDR_DETAIL"));
				dto.setMemberEmail(rs.getString("MEMBER_EMAIL"));
				dto.setGender(rs.getString("GENDER"));
				dto.setMemberId(rs.getString("MEMBER_ID"));
				dto.setMemberName(rs.getString("MEMBER_NAME"));
				dto.setMemberNum(rs.getString("MEMBER_NUM"));
				dto.setMemberPhone1(rs.getString("MEMBER_PHONE1"));
				dto.setMemberPhone2(rs.getString("MEMBER_PHONE2"));
				dto.setMemberPost(rs.getString("MEMBER_post"));
				dto.setMemberPw(rs.getString("MEMBER_PW"));
				dto.setMemberBirth(rs.getDate("MEMBER_BIRTH"));
				dto.setMemberRegist(rs.getDate("MEMBER_REGIST"));
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {close();}
		return dto;
	}
	public String memberAutoNum() {
		con = getConnection();
		sql = " select concat('mem_' ,nvl(substr(max(member_num),5),100000) + 1) from members"; 
		// mem_100001
		String memberNum= null;
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			rs.next();
			memberNum = rs.getString(1);
			System.out.println("회원번호 : " + memberNum);
		}catch (Exception e) {
			e.printStackTrace();
		}finally {close();}
		return memberNum;
	}
	
	public void memberWrite(MemberDTO dto) {
		con = getConnection();
		sql = " insert into members ( MEMBER_NUM, MEMBER_NAME, MEMBER_ID, MEMBER_PW"
				+ "					 , MEMBER_ADDR, MEMBER_ADDR_DETAIL, MEMBER_POST"
				+ "                  , MEMBER_REGIST, GENDER,MEMBER_PHONE1, MEMBER_PHONE2"
				+ "                  , MEMBER_EMAIL, MEMBER_BIRTH, MEMBER_POINT)"
			+ " values (?,?,?,?,?,?,?,sysdate,?,?,?,?,?,?)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getMemberNum());
			pstmt.setString(2, dto.getMemberName());
			pstmt.setString(3, dto.getMemberId());
			pstmt.setString(4, dto.getMemberPw());
			pstmt.setString(5, dto.getMemberAddr());
			pstmt.setString(6, dto.getMemberAddrDetail());
			pstmt.setString(7, dto.getMemberPost());
			pstmt.setString(8, dto.getGender());
			pstmt.setString(9, dto.getMemberPhone1());
			pstmt.setString(10, dto.getMemberPhone2());
			pstmt.setString(11, dto.getMemberEmail());
			pstmt.setDate(12, new Date(dto.getMemberBirth().getTime()));
			pstmt.setInt(13, 0);
			int i = pstmt.executeUpdate();
			System.out.println(i+"개가 삽입되었습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close();
		}
		
	}	
	public List<MemberDTO> memberSelectAll() {
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		con = getConnection();
		sql = " select MEMBER_NUM, MEMBER_NAME, MEMBER_ID,MEMBER_PW"
				+ "   ,MEMBER_ADDR, MEMBER_ADDR_DETAIL,MEMBER_POST"
				+ "   ,MEMBER_REGIST, GENDER, MEMBER_PHONE1,MEMBER_PHONE2"
				+ "   ,MEMBER_EMAIL,MEMBER_BIRTH,MEMBER_POINT,MEMBER_EMAIL_CONF"
			+ " from members ";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				MemberDTO dto = new MemberDTO();
				dto.setMemberAddr(rs.getString("MEMBER_ADDR"));
				dto.setMemberAddrDetail(rs.getString("MEMBER_ADDR_DETAIL"));
				dto.setMemberBirth(rs.getDate("MEMBER_BIRTH"));
				dto.setMemberEmail(rs.getString("MEMBER_EMAIL"));
				dto.setGender(rs.getString("GENDER"));
				dto.setMemberId(rs.getString("MEMBER_ID"));
				dto.setMemberName(rs.getString("MEMBER_NAME"));
				dto.setMemberNum(rs.getString("MEMBER_NUM"));
				dto.setMemberPhone1(rs.getString("MEMBER_PHONE1"));
				dto.setMemberPhone2(rs.getString("MEMBER_PHONE2"));
				dto.setMemberPost(rs.getString("MEMBER_post"));
				dto.setMemberPw(rs.getString("MEMBER_PW"));
				dto.setMemberRegist(rs.getDate("MEMBER_REGIST"));
				list.add(dto);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return list;
	}	
}
