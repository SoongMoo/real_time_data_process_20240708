package springBootMVCShopping.service.purchase;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import jakarta.servlet.http.HttpSession;
import springBootMVCShopping.command.PurchaseCommand;
import springBootMVCShopping.domain.AuthInfoDTO;
import springBootMVCShopping.domain.PurchaseDTO;
import springBootMVCShopping.mapper.CartMapper;
import springBootMVCShopping.mapper.MemberMapper;
import springBootMVCShopping.repository.PurchaseRepository;

@Service
public class GoodsOrderService {
	@Autowired
	MemberMapper memberMapper;
	@Autowired
	PurchaseRepository purchaseRepository;
	@Autowired
	CartMapper cartMapper;
	public String execute(PurchaseCommand purchaseCommand,HttpSession session
			, Model model) {
		AuthInfoDTO auth = (AuthInfoDTO)session.getAttribute("auth");
		String memberNum = memberMapper.memberNumSelect(auth.getUserId());
		String purchaseNum = purchaseRepository.selectPurchaseNum();
		System.out.println("purchaseNum : " + purchaseNum);
		/// 구매
		PurchaseDTO dto = new PurchaseDTO();
		BeanUtils.copyProperties(purchaseCommand, dto);
		dto.setPurchaseNum(purchaseNum);
		dto.setPurchasePrice(purchaseCommand.getTotalPaymentPrice());
		dto.setMemberNum(memberNum);
		purchaseRepository.purchaseInsert(dto);
		// 구매리스트
		String goodsNums[] = purchaseCommand.getGoodsNums().split("-");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("purchaseNum", purchaseNum);
		map.put("memberNum", memberNum);
		map.put("goodsNums", goodsNums);
		purchaseRepository.purchaseListInsert(map);
		/// 구매리스트에 넣은 제품을 장바구니에서 삭제
		cartMapper.goodsNumsDelete(map);
		return purchaseNum;
	}
}






