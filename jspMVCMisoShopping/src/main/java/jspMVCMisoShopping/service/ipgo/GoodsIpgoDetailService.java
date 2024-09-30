package jspMVCMisoShopping.service.ipgo;

import javax.servlet.http.HttpServletRequest;

import jspMVCMisoShopping.model.dao.GoodsIpgoDAO;
import jspMVCMisoShopping.model.dto.GoodsIpgoDTO;

public class GoodsIpgoDetailService {
	public void execute(HttpServletRequest request) {
		String ipgoNum = request.getParameter("ipgoNum");
		String num = request.getParameter("num");
		
		GoodsIpgoDAO dao = new GoodsIpgoDAO();
		GoodsIpgoDTO dto = dao.selectIpgoGoods(ipgoNum, num);
		request.setAttribute("dto", dto);
	}
}
