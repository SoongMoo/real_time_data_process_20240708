package bank.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AccountDAO {
	String jdbcURL;
	String jdbcDriver;
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	String sql;
	public AccountDAO() {
		jdbcURL = "jdbc:oracle:thin:@localhost:1521:xe";
		jdbcDriver = "oracle.jdbc.driver.OracleDriver";
	}
	public Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName(jdbcDriver);
			conn = DriverManager.getConnection( jdbcURL, "miso", "1234");
		}catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	public void accountInsert(AccountDTO dto) {
		con = getConnection();
		sql = " insert into account(accountNo, owner, balance) "
				+ " values(?,?,?)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, dto.getAccountNo());
			pstmt.setString(2, dto.getOwner());
			pstmt.setInt(3, dto.getBalance());
			int i = pstmt.executeUpdate();
			System.out.println(i + "개가 삽입되었습니다.");
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			close();
		}
	}
	public List<AccountDTO> accountAll() {
		List<AccountDTO> list = new ArrayList<AccountDTO>();
		con = getConnection();
		sql = "select accountNo, owner, balance from account";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				AccountDTO dto = new AccountDTO();
				dto.setAccountNo(rs.getInt("accountNo"));
				dto.setOwner(rs.getString("owner"));
				dto.setBalance(rs.getInt("balance"));
				list.add(dto);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return list;
	}
	public AccountDTO accountOne(int accountNo) {
		AccountDTO dto = null;
		con = getConnection();
		sql = " select accountNo, owner, balance from account "
			+ " where accountNo = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, accountNo);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				dto = new AccountDTO();
				dto.setAccountNo(rs.getInt("accountNo"));
				dto.setOwner(rs.getString("owner"));
				dto.setBalance(rs.getInt("balance"));
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return dto;
	}
	public void depositUpdate(AccountDTO dto) {
		con = getConnection();
		sql = " update account "
			+ " set balance = balance + ? "
			+ " where accountNo = ? ";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, dto.getBalance());
			pstmt.setInt(2, dto.getAccountNo());
			int i = pstmt.executeUpdate();
			System.out.println(i + "개가 수정되었습니다.");
		}catch (Exception e) {
			e.printStackTrace();
		}finally {close();}
	}
	public void close() {
		if(rs != null) try {rs.close();}catch(Exception e) {}
		if(pstmt != null) try {pstmt.close();}catch(Exception e) {}
		if(con != null) try {con.close();}catch(Exception e) {}
	}
}







