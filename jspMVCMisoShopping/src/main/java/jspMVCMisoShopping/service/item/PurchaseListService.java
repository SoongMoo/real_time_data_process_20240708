package jspMVCMisoShopping.service.item;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import jspMVCMisoShopping.model.dao.ItemDAO;
import jspMVCMisoShopping.model.dto.PurchaseInfoDTO;
import jspMVCMisoShopping.service.MemberAuthService;

public class PurchaseListService extends MemberAuthService{
	public PurchaseListService(HttpServletRequest request) {
		super(request);
	}
	public void execute(HttpServletRequest request) {
		ItemDAO dao = new ItemDAO();
		List<PurchaseInfoDTO> list = dao.purchaseItemSelect(memberNum);
		System.out.println(list.size());
		request.setAttribute("list", list);
	}
}
