package jspMVCMisoShopping.service.inquire;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import jspMVCMisoShopping.model.dao.InquireDAO;
import jspMVCMisoShopping.model.dto.InquireDTO;
import jspMVCMisoShopping.service.MemberAuthService;

public class InquireWriteProService extends MemberAuthService{
	public InquireWriteProService(HttpServletRequest request) {
		super(request);
	}
	public void execute(HttpServletRequest request) {
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		String goodsNum = request.getParameter("goodsNum");
		String queryType = request.getParameter("queryType");
		String inquireSubject = request.getParameter("inquireSubject");
		String inquireContent = request.getParameter("inquireContent");
		
		InquireDTO dto =  new InquireDTO();	
		dto.setGoodsNum(goodsNum);
		dto.setInquireContent(inquireContent);
		dto.setInquireKind(queryType);
		dto.setInquireSubject(inquireSubject);
		dto.setMemberNum(memberNum);
	
		InquireDAO dao = new InquireDAO();
		dao.inquireInsert(dto);
	}
}





