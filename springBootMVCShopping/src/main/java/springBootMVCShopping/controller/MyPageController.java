package springBootMVCShopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.servlet.http.HttpSession;
import springBootMVCShopping.command.MemberCommand;
import springBootMVCShopping.sevice.myPage.EmployeeInfoService;
import springBootMVCShopping.sevice.myPage.MemberDropService;
import springBootMVCShopping.sevice.myPage.MemberMyInfoService;
import springBootMVCShopping.sevice.myPage.MemberMyUpdateService;
import springBootMVCShopping.sevice.myPage.MemberPwUpdateService;

@Controller
@RequestMapping("myPage")
public class MyPageController {
	@Autowired
	MemberMyInfoService memberMyInfoService;
	@Autowired
	MemberMyUpdateService memberMyUpdateService;
	@Autowired
	MemberPwUpdateService memberPwUpdateService ;
	@Autowired
	MemberDropService memberDropService ;
	@Autowired
	EmployeeInfoService employeeInfoService;
	@GetMapping("memberMyPage")
	public String memMyPage(HttpSession session,Model model) {
		memberMyInfoService.execute(session, model);
		return "thymeleaf/myPage/memberMyPage";
	}
	@GetMapping("memberUpdate")
	public String memberUpdate(HttpSession session,Model model) {
		memberMyInfoService.execute(session, model);
		return "thymeleaf/myPage/myModify";
	}
	@PostMapping("memberModify")
	public String memberModify(MemberCommand memberCommand
			, HttpSession session) {
		memberMyUpdateService.execute(memberCommand, session);
		return "redirect:memberMyPage";
	}
	@RequestMapping(value="memberPwModify" ,method = RequestMethod.GET)
	public String memberPwModify() {
		return  "thymeleaf/myPage/myNewPw";
	}
	@RequestMapping(value="memberPwPro" ,method = RequestMethod.POST)
	public String newPw(
			String oldPw, String newPw,HttpSession session
			) {
		memberPwUpdateService.execute(oldPw, newPw, session);
		return "redirect:memberMyPage";
	}
	@GetMapping("memberDrop")
	public String memberDrop() {
		return "thymeleaf/myPage/memberDrop";
	}
	@PostMapping("memberDropOk")
	public String memberDropOk(String memberPw, HttpSession session) {
		memberDropService.execute(memberPw, session);
		return "redirect:/login/logout";
	}
	@GetMapping("employeeMyPage")
	public String empPage(HttpSession session, Model model) {
		employeeInfoService.execute(session, model );
		return "thymeleaf/myPage/employeeInfo";
	}
	
}








