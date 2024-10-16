package springBootMVCShopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import springBootMVCShopping.sevice.IdcheckService;

@Controller
@RequestMapping("login")
public class LoginController {
	@Autowired
	IdcheckService idcheckService;
	// spring 방식
	@PostMapping("userIdCheck")
	public @ResponseBody Integer userIdCheck(String userId) {
		// html, jsp파일경로(x)
		return idcheckService.execute(userId);
		
	}
}
