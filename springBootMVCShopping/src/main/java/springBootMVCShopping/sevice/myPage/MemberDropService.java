package springBootMVCShopping.sevice.myPage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import jakarta.servlet.http.HttpSession;
import springBootMVCShopping.domain.AuthInfoDTO;
import springBootMVCShopping.mapper.MemberInfoMapper;

@Service
public class MemberDropService {
	@Autowired
	MemberInfoMapper memberInfoMapper;
	@Autowired
	PasswordEncoder passwordEncoder;
	public void execute(String memberPw, HttpSession session) {
		AuthInfoDTO auth = (AuthInfoDTO)session.getAttribute("auth");
		if(passwordEncoder.matches(memberPw, auth.getUserPw())) {
			memberInfoMapper.memberDelete(auth.getUserId());
		}
		
	}
}
