package springBootMVCShopping.service.item;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.servlet.http.HttpSession;
import springBootMVCShopping.command.CartCommand;
import springBootMVCShopping.domain.AuthInfoDTO;
import springBootMVCShopping.domain.CartDTO;
import springBootMVCShopping.mapper.CartMapper;
import springBootMVCShopping.mapper.MemberMapper;

@Service
public class CartInsertService {
	@Autowired
	MemberMapper memberMapper;
	@Autowired
	CartMapper cartMapper;
	public String execute(CartCommand cartCommand, HttpSession session) {
		AuthInfoDTO auth = (AuthInfoDTO)session.getAttribute("auth");
		String memberNum = null;
		try {
			memberNum = memberMapper.memberNumSelect(auth.getUserId());
		}catch(Exception e) {
			e.printStackTrace();
			return "000";  // session이 없다
		}
		if(memberNum == null) {
			return "900";
		}else {
			CartDTO dto = new CartDTO();
			dto.setCartQty(cartCommand.getQty());
			dto.setGoodsNum(cartCommand.getGoodsNum());
			dto.setMemberNum(memberNum);
			cartMapper.cartMerge(dto);
			return "200";
		}
		
	}
}
