package springBootMVCShopping.service.item;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import jakarta.servlet.http.HttpSession;
import springBootMVCShopping.domain.AuthInfoDTO;
import springBootMVCShopping.domain.GoodsDTO;
import springBootMVCShopping.mapper.ItemMapper;
import springBootMVCShopping.mapper.MemberMapper;

@Service
public class GoodsWishListService {
	@Autowired
	MemberMapper memberMapper;
	@Autowired
	ItemMapper itemMapper;
	public void execute(HttpSession session, Model model) {
		AuthInfoDTO authInfo = (AuthInfoDTO)session.getAttribute("auth");
		String memberNum = memberMapper.memberNumSelect(authInfo.getUserId());
		List<GoodsDTO> list = itemMapper.wishSelectList(memberNum);
		model.addAttribute("list", list);
	}
}
