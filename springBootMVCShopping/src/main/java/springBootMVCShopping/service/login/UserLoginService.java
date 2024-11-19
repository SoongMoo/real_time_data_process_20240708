package springBootMVCShopping.service.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import springBootMVCShopping.command.LoginCommand;
import springBootMVCShopping.domain.AuthInfoDTO;
import springBootMVCShopping.mapper.LoginMapper;

@Service
public class UserLoginService {
	@Autowired
	LoginMapper loginMapper;
	@Autowired 
	PasswordEncoder passwordEncoder;
	public void execute(LoginCommand loginCommand
			,HttpSession session, BindingResult result,HttpServletResponse response) {
		AuthInfoDTO auth = loginMapper.loginSelectOne(loginCommand.getUserId());
		if(auth != null) {
			System.out.println("아이디가 존재합니다.");
			if(passwordEncoder.matches(loginCommand.getUserPw()
					, auth.getUserPw())) {
				System.out.println("비밀번호가 일치합니다.");
				session.setAttribute("auth", auth);
				if(loginCommand.isIdStore()) {
					Cookie cookie = new Cookie("idStore", loginCommand.getUserId());
					cookie.setPath("/");
					cookie.setMaxAge(60*60*24*30);
					response.addCookie(cookie);
				}else {
					Cookie cookie = new Cookie("idStore", "");
					cookie.setPath("/");
					cookie.setMaxAge(0);
					response.addCookie(cookie);
				}
				if(loginCommand.isAutoLogin()) {
					Cookie cookie = new Cookie("autoLogin", loginCommand.getUserId());
					cookie.setPath("/");
					cookie.setMaxAge(60*60*24*30);
					response.addCookie(cookie);
				}
			}else {
				result.rejectValue("userPw", "loginCommand.userPw"
						, "비밀번호가 틀렸습니다.");
				System.out.println("비밀번호가 일치하지 않는다.");
			}
		}else {
			result.rejectValue("userId", "loginCommand.userId"
					, "아이디가 존재하지 않습니다.");
			System.out.println("아이디가 존재하지 않습니다.");
		}
		
	}
}
