package jspMVCMisoShopping.service.item;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import jspMVCMisoShopping.model.dao.ItemDAO;
import jspMVCMisoShopping.model.dao.MemberDAO;
import jspMVCMisoShopping.model.dto.AuthInfoDTO;
import jspMVCMisoShopping.model.dto.CartDTO;

public class CartMergeService  {
	public void execute(HttpServletRequest request) {
		String goodsNum = request.getParameter("goodsNum");
		String cartQty = request.getParameter("cartQty");
		
		HttpSession session = request.getSession();
		AuthInfoDTO  auth = (AuthInfoDTO)session.getAttribute("auth");
		MemberDAO memDao = new MemberDAO();
		String memberNum = memDao.memberNumSelect(auth.getUserId());
		
		CartDTO dto = new CartDTO();
		dto.setGoodsNum(goodsNum);
		dto.setCartQty(Integer.parseInt(cartQty));
		dto.setMemberNum(memberNum);
		
		ItemDAO dao = new ItemDAO();
		dao.cartMerge(dto);		
	}
}
