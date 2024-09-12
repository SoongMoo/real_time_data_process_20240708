package jspMVCMisoShopping.service.help;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import jspMVCMisoShopping.model.dao.FindDAO;

public class FindPwService {
	public void execute(HttpServletRequest request) {
		String userId = request.getParameter("userId");
		String userPhone = request.getParameter("userPhone");
		FindDAO dao = new FindDAO();
		String grade = dao.userSearch(userId, userPhone);
		if(grade != null ) {
			String newPw = UUID.randomUUID().toString().substring(0,8);
			dao.userPwUpdate(userId,newPw, grade);
			request.setAttribute("userId", userId);
			request.setAttribute("userPw", newPw);
		}
	}
}
