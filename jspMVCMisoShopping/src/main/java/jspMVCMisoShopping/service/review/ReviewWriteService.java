package jspMVCMisoShopping.service.review;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import jspMVCMisoShopping.model.dao.ReviewDAO;
import jspMVCMisoShopping.model.dto.ReviewDTO;
import jspMVCMisoShopping.service.MemberAuthService;

public class ReviewWriteService extends MemberAuthService {
	public ReviewWriteService(HttpServletRequest request) {
		super(request);
	}
	public void execute(HttpServletRequest request) {
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		String goodsNum = request.getParameter("goodsNum");
		String purchaseNum = request.getParameter("purchaseNum");
		String reviewContent = request.getParameter("reviewContent");
		String memberId = auth.getUserId();
		ReviewDTO dto = new ReviewDTO();
		dto.setGoodsNum(goodsNum);
		dto.setPurchaseNum(purchaseNum);
		dto.setReviewContent(reviewContent);
		dto.setMemberId(memberId);
		
		ReviewDAO dao = new ReviewDAO();
		dao.reviewInsert(dto);
		
		
	}
}
