package jspMVCMisoShopping.service.item;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.inicis.std.util.SignatureUtil;

import jspMVCMisoShopping.model.dao.ItemDAO;
import jspMVCMisoShopping.model.dto.PurchaseDTO;

public class IniPayReqService {
	public void execute(HttpServletRequest request) throws Exception{
		String purchaseNum = request.getParameter("purchaseNum");
		ItemDAO  dao = new ItemDAO();
		PurchaseDTO dto =  dao.purchaseSelectOne(purchaseNum);
		String mid					= "INIpayTest";		                    // 상점아이디					
		String signKey			    = "SU5JTElURV9UUklQTEVERVNfS0VZU1RS";	// 웹 결제 signkey
		
		String mKey = SignatureUtil.hash(signKey, "SHA-256");

		String timestamp			= SignatureUtil.getTimestamp();			// util에 의해서 자동생성
		String orderNumber			= purchaseNum;	// 가맹점 주문번호(가맹점에서 직접 설정)
		String price				= String.valueOf(dto.getPurchasePrice());								// 상품가격(특수기호 제외, 가맹점에서 직접 설정)


		Map<String, String> signParam = new HashMap<String, String>();

		signParam.put("oid", orderNumber);
		signParam.put("price", price);
		signParam.put("timestamp", timestamp);

		String signature = SignatureUtil.makeSignature(signParam);	
		
		request.setAttribute("mid", mid);
		request.setAttribute("orderNumber", orderNumber);
		request.setAttribute("price", price);
		request.setAttribute("timestamp", timestamp);
		request.setAttribute("signature", signature);
		request.setAttribute("mKey", mKey);
		request.setAttribute("deliveryName", dto.getDeliveryName());
		request.setAttribute("purchaseName", dto.getPurchaseName());
		request.setAttribute("deliveryPhone", dto.getDeliveryPhone());
	}
}









