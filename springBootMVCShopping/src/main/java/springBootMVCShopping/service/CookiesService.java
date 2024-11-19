package springBootMVCShopping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import springBootMVCShopping.command.LoginCommand;
import springBootMVCShopping.domain.AuthInfoDTO;
import springBootMVCShopping.mapper.LoginMapper;

@Service
public class CookiesService {
	@Autowired
	LoginMapper loginMapper;
	public void execute(HttpServletRequest request, Model model, LoginCommand loginCommand) {
		Cookie [] cookies  = request.getCookies();
		if(cookies != null && cookies.length > 0) {
			for(Cookie cookie : cookies) {
				if(cookie.getName().equals("idStore")) {
					System.out.println("쿠키가 있나요???");
					loginCommand.setUserId(cookie.getValue());
					loginCommand.setIdStore(true);
					model.addAttribute("loginCommand", loginCommand);
				}
				if(cookie.getName().equals("autoLogin")) {
					AuthInfoDTO auth = loginMapper.loginSelectOne(cookie.getValue());
 					HttpSession session = request.getSession();
					session.setAttribute("auth", auth);
				}
			}
		}
	}
}
