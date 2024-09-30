package jspMVCMisoShopping.service.delivery;

import javax.servlet.http.HttpServletRequest;

import jspMVCMisoShopping.model.dao.DeliveryDAO;

public class DeliveryModifyService {
	public void execute(HttpServletRequest request) {
		String purchaseNum = request.getParameter("purchaseNum");
		DeliveryDAO dao = new DeliveryDAO();
		dao.deliveryStatusUpdate(purchaseNum);
	}
}
