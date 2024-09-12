package jspMVCMisoShopping.service.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import jspMVCMisoShopping.model.dao.MemberDAO;
import jspMVCMisoShopping.model.dto.AuthInfoDTO;

public class MemberDropService {
	public int execute(HttpServletRequest request) {
		String memberPw = request.getParameter("memberPw");
		HttpSession session = request.getSession();
		AuthInfoDTO auth = (AuthInfoDTO)session.getAttribute("auth");
		if(!memberPw.equals(auth.getUserPw())) {
			request.setAttribute("errPw", "비밀번호가 틀렸습니다.");
			return 0;
		}else {
			MemberDAO dao = new MemberDAO();
			String memberNum = dao.memberNumSelect(auth.getUserId());
			dao.memberDelete(memberNum);
			return 1;
		}
	}
}
