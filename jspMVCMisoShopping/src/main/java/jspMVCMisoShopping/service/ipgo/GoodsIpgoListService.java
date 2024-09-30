package jspMVCMisoShopping.service.ipgo;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import jspMVCMisoShopping.model.dao.GoodsIpgoDAO;
import jspMVCMisoShopping.model.dto.GoodsIpgoDTO;

public class GoodsIpgoListService {
	public void execute(HttpServletRequest request) {
		GoodsIpgoDAO dao = new GoodsIpgoDAO();
		List<GoodsIpgoDTO> list =  dao.selectAll();
		request.setAttribute("dtos", list);
	}
}
