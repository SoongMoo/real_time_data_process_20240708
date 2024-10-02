package jspMVCMisoShopping.service.inquire;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import jspMVCMisoShopping.model.dao.InquireDAO;
import jspMVCMisoShopping.model.dto.InquireDTO;
import jspMVCMisoShopping.service.MemberAuthService;

public class InquireListService extends MemberAuthService{
	public InquireListService(HttpServletRequest request) {
		super(request);
	}

	public void execute(HttpServletRequest request) {
		String goodsNum = request.getParameter("goodsNum");
		InquireDAO dao = new InquireDAO();
		List<InquireDTO> list = dao.inquireSelectAll(goodsNum);
		request.setAttribute("list", list);
		request.setAttribute("newLine", "\n");
		if(auth != null) {
			request.setAttribute("memberNum", memberNum);
		}
	}
}
