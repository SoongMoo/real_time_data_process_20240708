package bank.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}	
	}
	public List<AccountDTO> accountAll() {
		List<AccountDTO> list = new ArrayList<AccountDTO>();
		con = getConnection();
		sql = "select accountNo , owner, balance from account";
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
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		
		return list;
	}
	public void close() {
		if(rs != null) try {rs.close();}catch(Exception e) {}
		if(pstmt != null) try {pstmt.close();}catch(Exception e) {}
		if(con != null) try {con.close();}catch(Exception e) {}
	}
	
}
