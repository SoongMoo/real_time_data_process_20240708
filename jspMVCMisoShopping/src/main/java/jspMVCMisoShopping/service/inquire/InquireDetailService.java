package jspMVCMisoShopping.service.inquire;

import javax.servlet.http.HttpServletRequest;

import jspMVCMisoShopping.model.dao.InquireDAO;
import jspMVCMisoShopping.model.dto.InquireDTO;

public class InquireDetailService {
	public void execute(HttpServletRequest request) {
		String inquireNum = request.getParameter("inquireNum");
		InquireDAO dao = new InquireDAO();
		InquireDTO dto = new InquireDTO();
		dto.setInquireNum(Long.parseLong(inquireNum));
		dao.inquireSelectOne(dto);
		request.setAttribute("dto", dto);
	}
}
