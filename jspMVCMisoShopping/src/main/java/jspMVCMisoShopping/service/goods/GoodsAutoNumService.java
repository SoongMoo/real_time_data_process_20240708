package jspMVCMisoShopping.service.goods;

import javax.servlet.http.HttpServletRequest;

import jspMVCMisoShopping.model.dao.GoodsDAO;

public class GoodsAutoNumService {
	public void execute(HttpServletRequest request) {
		GoodsDAO dao = new GoodsDAO();
		String goodsNum  = dao.goodsAutoNum();
		request.setAttribute("goodsNum", goodsNum);
	}
}
