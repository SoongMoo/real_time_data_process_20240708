package jspMVCMisoShopping.service.goods;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import jspMVCMisoShopping.model.dao.GoodsDAO;
import jspMVCMisoShopping.model.dao.ItemDAO;
import jspMVCMisoShopping.model.dao.MemberDAO;
import jspMVCMisoShopping.model.dto.AuthInfoDTO;
import jspMVCMisoShopping.model.dto.GoodsDTO;

public class GoodsDetailService {
	public void execute(HttpServletRequest request) {
		String goodsNum = request.getParameter("goodsNum");
		GoodsDAO dao = new GoodsDAO();
		GoodsDTO dto = dao.goodsSelectOne(goodsNum);
		request.setAttribute("dto", dto);
		
		// 제품 페이지에서 관심상품 등록되었는지 확인
		HttpSession session = request.getSession();
		AuthInfoDTO auth = (AuthInfoDTO)session.getAttribute("auth");
		if(auth != null) {
			MemberDAO memDao = new MemberDAO();
			String memberNum =  memDao.memberNumSelect(auth.getUserId());
			ItemDAO itemDao = new ItemDAO();
			int i = itemDao.wishSelectOne(memberNum, goodsNum);
			if(i == 1) request.setAttribute("isTrue", "있어요");
		}
	}
}








