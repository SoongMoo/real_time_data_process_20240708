package jspMVCMisoShopping.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import jspMVCMisoShopping.model.dao.MemberDAO;
import jspMVCMisoShopping.model.dto.AuthInfoDTO;

public class MemberAuthService {
	protected HttpSession session ;
	protected AuthInfoDTO auth;
	protected MemberDAO memDao ;
	protected String memberNum ;
	protected MemberAuthService(HttpServletRequest request) {
		session = request.getSession();
		auth = (AuthInfoDTO)session.getAttribute("auth");
		memDao = new MemberDAO();
		try {
			memberNum = memDao.memberNumSelect(auth.getUserId());
		}catch (Exception e) {}
	}
}
