package jspMVCMisoShopping.model.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jspMVCMisoShopping.model.dto.InquireDTO;

public class InquireDAO extends DataBaseInfo {
	
	public void inquireDelete(String inquireNum) {
		con = getConnection();
		sql = " delete from inquire  where  inquire_Num = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, inquireNum);
			int i = pstmt.executeUpdate();
			System.out.println(i + "개가 삭제되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {close();}
	}
	
	public void inquireUpdate(InquireDTO dto) {
		con = getConnection();
		sql = " update inquire " 
		    + " set INQUIRE_SUBJECT = ?" 
			+ "    ,INQUIRE_CONTENTS = ?"
			+ "		, INQUIRE_KIND = ? " 
		    + " where inquire_Num = ? ";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getInquireSubject());
			pstmt.setString(2, dto.getInquireContent());
			pstmt.setString(3, dto.getInquireKind());
			pstmt.setLong(4, dto.getInquireNum());
			int i = pstmt.executeUpdate();
			System.out.println(i + "개가 수정되었습니다");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {close();}
	}
	public void inquireSelectOne(InquireDTO dto) {
		con = getConnection();
		sql = " select INQUIRE_NUM, MEMBER_NUM, GOODS_NUM, INQUIRE_SUBJECT"
			+ "       ,INQUIRE_CONTENTS, inquire_kind, inquire_date "
			+ "       ,inquire_answer, inquire_answer_date,emp_num" 
			+ " from inquire ";
		sql += " where INQUIRE_NUM = ?  ";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setLong(1, dto.getInquireNum());
			rs = pstmt.executeQuery();
			if(rs.next()) {
				dto.setEmpNum(rs.getString("emp_num"));
				dto.setGoodsNum(rs.getString("GOODS_NUM"));
				dto.setInquireAnswer(rs.getString("inquire_answer"));
				dto.setInquireContent(rs.getString("INQUIRE_CONTENTS"));
				dto.setInquireDate(rs.getDate("inquire_date"));
				dto.setInquireKind(rs.getString("inquire_kind"));
				dto.setInquireNum(rs.getLong("INQUIRE_NUM"));
				dto.setInquireSubject(rs.getString("INQUIRE_SUBJECT"));
				dto.setMemberNum(rs.getString("MEMBER_NUM"));
				dto.setInquireAnswerDate(rs.getDate("inquire_answer_date"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {close();}
	}
	public List<InquireDTO> inquireSelectAll(String goodsNum) {
		List<InquireDTO> list = new ArrayList<InquireDTO>();
		con = getConnection();
		sql = " select INQUIRE_NUM, MEMBER_NUM, GOODS_NUM, INQUIRE_SUBJECT"
			+ "       ,INQUIRE_CONTENTS, inquire_kind, inquire_date "
			+ "       ,inquire_answer, inquire_answer_date,emp_num" 
			+ " from inquire ";
		sql += " where goods_num = ?  ";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, goodsNum);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				InquireDTO dto = new InquireDTO();
				dto.setEmpNum(rs.getString("emp_num"));
				dto.setGoodsNum(rs.getString("GOODS_NUM"));
				dto.setInquireAnswer(rs.getString("inquire_answer"));
				dto.setInquireContent(rs.getString("INQUIRE_CONTENTS"));
				dto.setInquireDate(rs.getDate("inquire_date"));
				dto.setInquireKind(rs.getString("inquire_kind"));
				dto.setInquireNum(rs.getLong("INQUIRE_NUM"));
				dto.setInquireSubject(rs.getString("INQUIRE_SUBJECT"));
				dto.setMemberNum(rs.getString("MEMBER_NUM"));
				dto.setInquireAnswerDate(rs.getDate("inquire_answer_date"));
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {close();}
		return list;
	}
	public void inquireInsert(InquireDTO dto) {
		con = getConnection();
		sql = " insert into inquire(INQUIRE_NUM " 
			+ "            ,MEMBER_NUM,GOODS_NUM,INQUIRE_SUBJECT"
			+ "            ,INQUIRE_CONTENTS,inquire_Kind,inquire_Date) " 
			+ " values(review_seq.nextval, ?, ?, ?, ?, ?, sysdate)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getMemberNum());
			pstmt.setString(2, dto.getGoodsNum());
			pstmt.setString(3, dto.getInquireSubject());
			pstmt.setString(4, dto.getInquireContent());
			pstmt.setString(5, dto.getInquireKind());
			int i = pstmt.executeUpdate();
			System.out.println(i + "개가 삽입되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {close();}
	}
}
