package jspMVCMisoShopping.service.delivery;

import javax.servlet.http.HttpServletRequest;

import jspMVCMisoShopping.model.dao.DeliveryDAO;

public class DeliveryDetailService {
	public void execute(HttpServletRequest request) {
		String purchaseNum = request.getParameter("purchaseNum");
		request.setAttribute("purchaseNum", purchaseNum);
		
		DeliveryDAO dao =  new DeliveryDAO();
		String deliveryNum = dao.deliveryNumSelectOne(purchaseNum);
		request.setAttribute("deliveryNum", deliveryNum);
	}
}
