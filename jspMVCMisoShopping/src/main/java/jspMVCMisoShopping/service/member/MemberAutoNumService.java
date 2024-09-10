package jspMVCMisoShopping.service.member;

import javax.servlet.http.HttpServletRequest;

import jspMVCMisoShopping.model.dao.MemberDAO;

public class MemberAutoNumService {
	public void execute(HttpServletRequest request) {
		MemberDAO dao = new MemberDAO();
		String num = dao.memberAutoNum();
		request.setAttribute("memberNum", num);
	}
}
