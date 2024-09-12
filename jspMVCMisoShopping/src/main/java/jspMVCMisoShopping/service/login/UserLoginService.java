package jspMVCMisoShopping.service.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import jspMVCMisoShopping.model.dao.UserDAO;
import jspMVCMisoShopping.model.dto.AuthInfoDTO;

public class UserLoginService {
	public int execute(HttpServletRequest request ) {
		int i = 0;
		String userId = request.getParameter("userId");
		String userPw = request.getParameter("userPw");
		UserDAO dao = new UserDAO();
		AuthInfoDTO auth = dao.loginSelect(userId);
		HttpSession session = request.getSession();
		if(auth != null) {
			System.out.println("아이디가 존재함");
			if(userPw.equals(auth.getUserPw())) {
				System.out.println("비밀번호가 같다");
				session.setAttribute("auth", auth);
				i = 1;
			}else {
				System.out.println("비밀번호가 다르다.");
				request.setAttribute("errPw", "비밀번호가 틀렸습니다.");
			}
		}else {
			System.out.println("아이디가 존재하지 않습니다.");
			request.setAttribute("errId", "아이디가 존재하지 않습니다.");
		}
		return i;
	}
}
