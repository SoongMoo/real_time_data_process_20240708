package jspMVCMisoShopping.service.employee;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import jspMVCMisoShopping.model.dao.EmployeeDAO;
import jspMVCMisoShopping.model.dto.AuthInfoDTO;
import jspMVCMisoShopping.model.dto.EmployeeDTO;

public class EmployeeDetailService {
	public void execute(HttpServletRequest request) {
		String empNum = request.getParameter("num");
		EmployeeDAO dao = new EmployeeDAO();
		if(empNum == null) {
			HttpSession session = request.getSession();
			AuthInfoDTO auth = (AuthInfoDTO)session.getAttribute("auth");
			String empId = auth.getUserId();
			empNum = dao.empNumSelect(empId);
		}
		EmployeeDTO dto = dao.selectOne(empNum);
		request.setAttribute("dto", dto);
	}
}
