package jspMVCMisoShopping.model.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jspMVCMisoShopping.model.dto.EmployeeDTO;

public class EmployeeDAO extends DataBaseInfo {
	public String empAutoNum() {
		String empNum = "";
		con = getConnection();
		sql = " select concat('emp_',nvl(substr(max(emp_num),5),100000) + 1) "
			+ " from employees ";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			rs.next();
			empNum = rs.getString(1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return empNum;
	}
	public void employeeInsert(EmployeeDTO dto) {
		con = getConnection();
		sql = "insert into employees("
				+ " emp_num, emp_name, emp_id, emp_pw,"
				+ " emp_addr, emp_addr_detail, emp_post,"
				+ " emp_phone, emp_email, EMP_HIRE_DATE,"
				+ " emp_jumin)"
			+ "values(?,?,?,?,?,?,?,?,?,?,?)";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getEmpNum());
			pstmt.setString(2, dto.getEmpName());
			pstmt.setString(3, dto.getEmpId() );
			pstmt.setString(4, dto.getEmpPw());
			pstmt.setString(5, dto.getEmpAddr());
			pstmt.setString(6, dto.getEmpAddrDetail());
			pstmt.setString(7, dto.getEmpPost());
			pstmt.setString(8, dto.getEmpPhone());
			pstmt.setString(9, dto.getEmpEmail());
			pstmt.setDate(10,  new java.sql.Date(dto.getEmpHireDate().getTime()));
			pstmt.setString(11,dto.getEmpJumin());
			int i = pstmt.executeUpdate();
			System.out.println(i + "개 행이(가) 삽입되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
	}
	public List<EmployeeDTO> selectAll(){
		List<EmployeeDTO> list = new ArrayList<EmployeeDTO>();
		con = getConnection();
		sql = "select emp_num, emp_name, emp_id, emp_pw,"
				+ "	 emp_addr, emp_addr_detail, emp_post,"
				+ "	 emp_phone, emp_email, EMP_HIRE_DATE,"
				+ "	 emp_jumin"
				+ " from employees";
		
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				EmployeeDTO dto = new EmployeeDTO();
				dto.setEmpAddr(rs.getString(5));
				dto.setEmpAddrDetail(rs.getString(6));
				dto.setEmpEmail(rs.getString("emp_email"));
				dto.setEmpHireDate(rs.getDate("EMP_HIRE_DATE"));
				dto.setEmpId(rs.getString(3));
				dto.setEmpJumin(rs.getString(11));
				dto.setEmpName(rs.getString(2));
				dto.setEmpNum(rs.getString(1));
				dto.setEmpPhone(rs.getString(8));
				dto.setEmpPost(rs.getString(7));
				dto.setEmpPw(rs.getString(4));
				list.add(dto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
		
		return list;
	}
	public EmployeeDTO selectOne(String empNum) {
		EmployeeDTO dto = new EmployeeDTO();
		con = getConnection();
		sql = "select emp_num, emp_name, emp_id, emp_pw,"
				+ "	 emp_addr, emp_addr_detail, emp_post,"
				+ "	 emp_phone, emp_email, EMP_HIRE_DATE,"
				+ "	 emp_jumin"
				+ " from employees"
				+ " where emp_num = ?";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, empNum);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				dto.setEmpAddr(rs.getString(5));
				dto.setEmpAddrDetail(rs.getString(6));
				dto.setEmpEmail(rs.getString("emp_email"));
				dto.setEmpHireDate(rs.getDate("EMP_HIRE_DATE"));
				dto.setEmpId(rs.getString(3));
				dto.setEmpJumin(rs.getString(11));
				dto.setEmpName(rs.getString(2));
				dto.setEmpNum(rs.getString(1));
				dto.setEmpPhone(rs.getString(8));
				dto.setEmpPost(rs.getString(7));
				dto.setEmpPw(rs.getString(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
		return dto;
	}
	
	public void employeeUpdate(EmployeeDTO dto) {
		con = getConnection();
		sql = "update employees "
				+ " set emp_name = ?, emp_Addr = ? , emp_Addr_Detail = ?,"
				+ "     emp_Post = ?, emp_Phone = ?, emp_Jumin = ?, "
				+ "     emp_Email = ?, EMP_HIRE_DATE = ?"
				+ " where emp_Num = ? ";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getEmpName());
			pstmt.setString(2, dto.getEmpAddr());
			pstmt.setString(3, dto.getEmpAddrDetail());
			pstmt.setString(4, dto.getEmpPost());
			pstmt.setString(5, dto.getEmpPhone());
			pstmt.setString(7, dto.getEmpEmail());
			pstmt.setDate(8, new java.sql.Date(dto.getEmpHireDate().getTime()));
			pstmt.setString(6,dto.getEmpJumin());
			pstmt.setString(9,dto.getEmpNum());
			int i = pstmt.executeUpdate();
			System.out.println(i + "개 행이(가) 수정되었습니다.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
	}
	public void employeeDelete(String empNum) {
		con = getConnection();
		sql = " delete from employees where emp_num = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, empNum);
			int i = pstmt.executeUpdate();
			System.out.println(i + "개 행이(가) 삭제되었습니다.");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public String getEmpNum(String empId) {
		String empNum = "";
		con = getConnection();
		sql = " select emp_num from employees "
			+ " where emp_id = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, empId);
			rs = pstmt.executeQuery();
			rs.next();
			empNum = rs.getString(1);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return empNum;
	}
	
	
	
	
	
}
