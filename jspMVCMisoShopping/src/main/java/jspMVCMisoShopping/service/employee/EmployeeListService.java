package jspMVCMisoShopping.service.employee;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import jspMVCMisoShopping.model.dao.EmployeeDAO;
import jspMVCMisoShopping.model.dto.EmployeeDTO;

public class EmployeeListService {
	public void execute(HttpServletRequest request) {
		EmployeeDAO dao = new EmployeeDAO();
		List<EmployeeDTO> list = dao.selectAll();
		request.setAttribute("dtos", list);
	}
}
