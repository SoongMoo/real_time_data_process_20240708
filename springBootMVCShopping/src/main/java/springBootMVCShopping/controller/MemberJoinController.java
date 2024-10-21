package springBootMVCShopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import springBootMVCShopping.command.UserCommand;
import springBootMVCShopping.sevice.memberJoin.MemberJoinService;

@Controller
@RequestMapping("register")
public class MemberJoinController {
	@Autowired
	MemberJoinService memberJoinService;
	
	@ModelAttribute
	public UserCommand userCommand() {
		return new UserCommand();
	}
	@RequestMapping("userAgree")
	public String agree() {
		return "thymeleaf/memberJoin/agree";
	}
	@GetMapping("userWrite")
	public String userWrite(/*Model model*/) {
		//model.addAttribute("userCommand", new UserCommand());
		return "thymeleaf/memberJoin/userForm";
	}
	@PostMapping("userWrite")
	// @Validated:유효성검사
	public String userWrite1(@Validated UserCommand userCommand
			,BindingResult result) {
		if(result.hasErrors()) {
			return "thymeleaf/memberJoin/userForm";
		}
		memberJoinService.execute(userCommand);
		return "thymeleaf/memberJoin/welcome";
	}
}




