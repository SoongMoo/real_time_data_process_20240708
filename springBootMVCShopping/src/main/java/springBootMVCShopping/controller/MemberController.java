package springBootMVCShopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import springBootMVCShopping.command.MemberCommand;
import springBootMVCShopping.sevice.AutoNumService;
import springBootMVCShopping.sevice.member.MemberWriteService;

@Controller
@RequestMapping("member") //공통주소 처리
public class MemberController {
	@Autowired
	MemberWriteService memberWriteService;
	@Autowired
	AutoNumService autoNumService;
	@GetMapping("memberList")
	public String list() {
		return "thymeleaf/member/memberList";
		//return "member/memberList";
	}
	@GetMapping("memberWrite")
	public String write(Model model) {
		autoNumService.execute(model, "mem_", "member_num", 5, "members");
		return "thymeleaf/member/memberForm";
		//return "member/memberForm";
	}
	@PostMapping("memberRegist")
	public String write(MemberCommand memberCommand, Model model) {
		if(!memberCommand.isMemberPwEqualMemberPwCon()) {
			model.addAttribute("errPw","비밀번호가 일치하지 않아요. ");
			return "thymeleaf/member/memberForm";
		}
		memberWriteService.execute(memberCommand);
		
		return "redirect:memberList";
	}
}
