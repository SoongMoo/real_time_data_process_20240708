package jspMVCMisoShopping.service.item;

import javax.servlet.http.HttpServletRequest;

import jspMVCMisoShopping.model.dao.ItemDAO;
import jspMVCMisoShopping.service.MemberAuthService;

public class CartQtyDownService extends MemberAuthService {
	public CartQtyDownService(HttpServletRequest request) {
		super(request);
	}
	public void execute(HttpServletRequest request) {
		String goodsNum = request.getParameter("goodsNum");
		ItemDAO dao = new ItemDAO();
		dao.itemQtyDownUpdate(goodsNum,memberNum);
	}
}
