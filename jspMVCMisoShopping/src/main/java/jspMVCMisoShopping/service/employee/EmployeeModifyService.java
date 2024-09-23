package jspMVCMisoShopping.service.employee;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import jspMVCMisoShopping.model.dao.EmployeeDAO;
import jspMVCMisoShopping.model.dto.AuthInfoDTO;
import jspMVCMisoShopping.model.dto.EmployeeDTO;

public class EmployeeModifyService {
	public int execute(HttpServletRequest request) {
		try {
			// 한글 깨짐 방지
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
		}
		String empNum = request.getParameter("empNum");
		String empName = request.getParameter("empName");
		String empAddr = request.getParameter("empAddr");
		String empAddrDetail = request.getParameter("empAddrDetail");
		String empPost = request.getParameter("empPost");
		String empPhone = request.getParameter("empPhone");
		String empJumin = request.getParameter("empJumin");
		String empEmail = request.getParameter("empEmail");
		String empEnterDate = request.getParameter("empHireDate");

		EmployeeDTO dto = new EmployeeDTO();
		dto.setEmpAddr(empAddr);
		dto.setEmpAddrDetail(empAddrDetail);
		dto.setEmpEmail(empEmail);
		dto.setEmpJumin(empJumin);
		dto.setEmpName(empName);
		dto.setEmpNum(empNum);
		dto.setEmpPhone(empPhone);
		dto.setEmpPost(empPost);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date empDate = null;
		try {
			empDate = sdf.parse(empEnterDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dto.setEmpHireDate(empDate);
		EmployeeDAO dao = new EmployeeDAO();
		
		HttpSession session = request.getSession();
		AuthInfoDTO auth = (AuthInfoDTO) session.getAttribute("auth");
		int i = 0;
		if (auth != null) {
			if (auth.getUserPw().equals(request.getParameter("empPw"))) {
				dao.employeeUpdate(dto);
				i = 1;
			} else {
				request.setAttribute("errPw", "비밀번호가 틀렸습니다.");
			}
		}else {
			dao.employeeUpdate(dto);
			i = 1;
		}
		return i;
	}
}
