package springBootMVCShopping.controller;

import java.io.IOException;
import java.io.PrintWriter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import springBootMVCShopping.command.LoginCommand;
import springBootMVCShopping.service.IdcheckService;
import springBootMVCShopping.service.login.UserLoginService;

@Controller
@RequestMapping("login")
public class LoginController {
	@Autowired
	IdcheckService idcheckService;
	@Autowired
	UserLoginService userLoginService;
	// spring 방식
	@PostMapping("userIdCheck")
	public @ResponseBody Integer userIdCheck(String userId) {
		// html, jsp파일경로(x)
		return idcheckService.execute(userId);
		
	}
	@PostMapping("login")
	public String login(@Validated LoginCommand loginCommand
			,BindingResult result
			,HttpSession session
			,HttpServletResponse response) {
		userLoginService.execute(loginCommand, session, result, response);
		if(result.hasErrors()) {
			return "thymeleaf/index";
		}
		return "redirect:/";
	}
	@GetMapping("logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	@GetMapping("item.login")
	public String item() {
		return "thymeleaf/login";
	}
	@PostMapping("item.login")
	public void item(LoginCommand loginCommand,BindingResult result
			,HttpSession session, HttpServletResponse response) {
		userLoginService.execute(loginCommand, session, result, response);
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = null;
		try {
			out = response.getWriter();
		} catch (IOException e) {
			e.printStackTrace();
		}
		String str = "<script language='javascript'>";
			   str+= " opener.location.reload();";
			   str+= " window.self.close();";
		       str+= " </script>"; 
		out.print(str);
		out.close();
	}
	
}






