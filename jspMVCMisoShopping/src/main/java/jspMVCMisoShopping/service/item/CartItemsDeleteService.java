package jspMVCMisoShopping.service.item;

import javax.servlet.http.HttpServletRequest;

import jspMVCMisoShopping.model.dao.ItemDAO;
import jspMVCMisoShopping.service.MemberAuthService;

public class CartItemsDeleteService extends MemberAuthService{
	public CartItemsDeleteService(HttpServletRequest request) {
		super(request);
	}
	public void execute(HttpServletRequest request) {
		String goodsNums = request.getParameter("goodsNums");
		String goodsNumbers [] = goodsNums.split("-");
		ItemDAO dao = new ItemDAO();
		for(String goodNum : goodsNumbers)
			dao.itemDelete(goodNum, memberNum);
	}
}