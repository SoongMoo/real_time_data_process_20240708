package jspMVCMisoShopping.service.member;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import jspMVCMisoShopping.model.dao.MemberDAO;
import jspMVCMisoShopping.model.dto.MemberDTO;

public class MemberListService {
	public void execute(HttpServletRequest request) {
		MemberDAO dao = new MemberDAO();
		List<MemberDTO> list = dao.memberSelectAll();
		request.setAttribute("list", list);
	}
}
