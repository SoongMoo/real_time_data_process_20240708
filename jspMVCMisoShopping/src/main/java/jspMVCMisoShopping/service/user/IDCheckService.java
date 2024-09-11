package jspMVCMisoShopping.service.user;

import javax.servlet.http.HttpServletRequest;

import jspMVCMisoShopping.model.dao.UserDAO;
import jspMVCMisoShopping.model.dto.AuthInfoDTO;

public class IDCheckService {
	public void execute(HttpServletRequest request) {
		String userId = request.getParameter("userId");
		UserDAO dao = new UserDAO(); 
		AuthInfoDTO dto = dao.loginSelect(userId);
		request.setAttribute("auth", dto);
		request.setAttribute("userId", userId);
	}
}
