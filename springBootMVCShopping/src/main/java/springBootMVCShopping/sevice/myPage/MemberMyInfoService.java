package springBootMVCShopping.sevice.myPage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import jakarta.servlet.http.HttpSession;
import springBootMVCShopping.domain.AuthInfoDTO;
import springBootMVCShopping.domain.MemberDTO;
import springBootMVCShopping.mapper.MemberInfoMapper;

@Service
public class MemberMyInfoService {
	@Autowired
	MemberInfoMapper memberInfoMapper;
	public void execute(HttpSession session,Model model) {
		AuthInfoDTO auth = (AuthInfoDTO)session.getAttribute("auth");
		String memberId = auth.getUserId();
		MemberDTO dto = memberInfoMapper.memberSelsectOne(memberId);
		model.addAttribute("memberCommand", dto);
	}
}
