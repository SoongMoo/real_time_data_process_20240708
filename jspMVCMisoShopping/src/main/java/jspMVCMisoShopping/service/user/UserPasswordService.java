package jspMVCMisoShopping.service.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import jspMVCMisoShopping.model.dao.MemberDAO;
import jspMVCMisoShopping.model.dto.AuthInfoDTO;

public class UserPasswordService {
	public String execute(HttpServletRequest request) {
		String oldPw = request.getParameter("oldPw");
		String newPw = request.getParameter("newPw");
		HttpSession session = request.getSession();
		AuthInfoDTO auth = (AuthInfoDTO)session.getAttribute("auth");
		if(auth.getUserPw().equals(oldPw)) {
			MemberDAO dao = new MemberDAO(); 
			dao.memberPwUpdate(newPw, auth.getUserId(), auth.getGrade());
			auth.setUserPw(newPw);
			return auth.getGrade();
		}else {
			request.setAttribute("errPw", "비밀번호가 틀렸습니다.");
			return null;
		}
	}
}