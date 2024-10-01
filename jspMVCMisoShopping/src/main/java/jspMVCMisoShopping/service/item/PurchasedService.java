package jspMVCMisoShopping.service.item;

import javax.servlet.http.HttpServletRequest;

import jspMVCMisoShopping.model.dao.ItemDAO;

public class PurchasedService {
	public void execute(HttpServletRequest request) {
		String purchaseNum = request.getParameter("purchaseNum");
		ItemDAO dao = new ItemDAO();
		dao.purchaseStatusUpdate(purchaseNum);
	}
}