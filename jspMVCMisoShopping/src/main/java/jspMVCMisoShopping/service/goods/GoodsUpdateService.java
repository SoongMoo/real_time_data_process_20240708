package jspMVCMisoShopping.service.goods;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import jspMVCMisoShopping.model.dao.EmployeeDAO;
import jspMVCMisoShopping.model.dao.GoodsDAO;
import jspMVCMisoShopping.model.dto.AuthInfoDTO;
import jspMVCMisoShopping.model.dto.GoodsDTO;

public class GoodsUpdateService {
	public void execute(HttpServletRequest request) {
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		String goodsNum = request.getParameter("goodsNum");
		String goodsName = request.getParameter("goodsName");
		String goodsPrice = request.getParameter("goodsPrice");
		String goodsContent = request.getParameter("goodsContent");
		
		HttpSession session = request.getSession();
		AuthInfoDTO auth = (AuthInfoDTO)session.getAttribute("auth");
		EmployeeDAO empDao = new EmployeeDAO();
		String empNum = empDao.empNumSelect(auth.getUserId());
		
		GoodsDTO dto = new GoodsDTO();
		dto.setGoodsNum(goodsNum);
		dto.setGoodsName(goodsName);
		dto.setGoodsPrice(Integer.parseInt(goodsPrice));
		dto.setGoodsContent(goodsContent);
		dto.setUpdateEmpNum(empNum);
		
		GoodsDAO dao = new GoodsDAO();
		dao.goodsUpdate(dto);
	}
}
