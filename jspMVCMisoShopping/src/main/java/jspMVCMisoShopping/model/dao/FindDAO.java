package jspMVCMisoShopping.model.dao;

import java.sql.SQLException;

public class FindDAO extends DataBaseInfo{
	public String findId(String userName,String userEmail) {
		String userId= null;
		con = getConnection();
		sql = " select member_id from members "
			+ " where member_name = ? and member_email = ? "
			+ " union "
			+ " select emp_id from employees "
			+ " where emp_name = ? and emp_email = ? ";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, userName);
			pstmt.setString(2, userEmail);
			pstmt.setString(3, userName);
			pstmt.setString(4, userEmail);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				userId = rs.getString(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return userId;
		// RecodeSet == ResultSet
	}
	public String userSearch(String userId,String userPhone) {
		String i = null;
		con = getConnection();
		sql = " select 'mem' from members"
			+ " where member_id  = ? and "
			+ " ( member_phone1 = ? or member_phone2 = ? ) "
			+ " union "
			+ " select 'emp' from employees "
			+ " where emp_id = ? and emp_phone = ?" ;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, userId);
			pstmt.setString(2, userPhone);
			pstmt.setString(3, userPhone);
			pstmt.setString(4, userId);
			pstmt.setString(5, userPhone);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				i = rs.getString(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return i;
	}
	public void userPwUpdate(String userId,String newPw, String grade) {
		con = getConnection();
		switch(grade) {
		case "mem":	sql = " update members "
				        + " set member_pw = ? "
				        + " where member_id = ? ";
				    break;
		case "emp": sql = " update employees "
					    + " set emp_pw = ? "
					    + " where emp_id = ? ";
					break;
		}
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, newPw);
			pstmt.setString(2, userId);
			int i = pstmt.executeUpdate();
			System.out.println("비밀번호가 변경되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {close();}
	}
	
	
	
	
	
	
	
	
	
	
	
}
