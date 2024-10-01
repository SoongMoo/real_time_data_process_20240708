package jspMVCMisoShopping.service.review;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import jspMVCMisoShopping.model.dao.ReviewDAO;
import jspMVCMisoShopping.model.dto.ReviewDTO;

public class ReviewListService {
	public void execute(HttpServletRequest request) {
		String goodsNum = request.getParameter("goodsNum");
		ReviewDAO dao = new ReviewDAO();
		List<ReviewDTO> list = dao.reviewSelectAll(goodsNum);
		request.setAttribute("list", list);
		request.setAttribute("newLine", "\n"); 
	}
}
