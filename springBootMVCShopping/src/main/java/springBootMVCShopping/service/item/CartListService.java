package springBootMVCShopping.service.item;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import jakarta.servlet.http.HttpSession;
import springBootMVCShopping.domain.AuthInfoDTO;
import springBootMVCShopping.domain.GoodsCartDTO;
import springBootMVCShopping.domain.MemberDTO;
import springBootMVCShopping.mapper.CartMapper;
import springBootMVCShopping.mapper.MemberMapper;

@Service
public class CartListService {
	@Autowired
	MemberMapper memberMapper;
	@Autowired
	CartMapper cartMapper;
	public void execute(Model model, HttpSession session) {
		AuthInfoDTO auth = (AuthInfoDTO)session.getAttribute("auth");
		MemberDTO memDTO = memberMapper.memberSelectOne(auth.getUserId());
		
		List<GoodsCartDTO> list = cartMapper.cartSelectList(memDTO.getMemberNum());
		Integer totPri = 0;
		Integer totQty = 0;
		for(GoodsCartDTO dto : list) {
			totPri += dto.getTotalPrice();
			totQty += dto.getCartDTO().getCartQty();
		}
		model.addAttribute("list", list);
		model.addAttribute("totPri", totPri);
		model.addAttribute("totQty", totQty);
	}
}
