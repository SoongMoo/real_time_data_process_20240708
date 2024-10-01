package jspMVCMisoShopping.service.review;

import javax.servlet.http.HttpServletRequest;

import jspMVCMisoShopping.model.dao.ReviewDAO;

public class ReviewDeleteService {
	public void execute(HttpServletRequest request) {
		String reviewNum = request.getParameter("reviewNum");
		ReviewDAO dao = new ReviewDAO();
		dao.reviewDelete(reviewNum);
	}
}
