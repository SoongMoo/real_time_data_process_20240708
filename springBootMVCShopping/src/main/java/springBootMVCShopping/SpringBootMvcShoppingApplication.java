package springBootMVCShopping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import springBootMVCShopping.command.LoginCommand;
import springBootMVCShopping.service.CookiesService;
import springBootMVCShopping.service.EmailSendService;
import springBootMVCShopping.service.SMSMassageService;
import springBootMVCShopping.service.goods.MainGoodsListService;

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@SpringBootApplication
@Controller
public class SpringBootMvcShoppingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMvcShoppingApplication.class, args);
	}

	@Autowired
	MainGoodsListService mainGoodsListService;
	@GetMapping("/")
	public String index(LoginCommand loginCommand
			//,@RequestParam(value="page", required = false , defaultValue = "1") Integer page
			,Model model
			,HttpServletRequest request) {
		//mainGoodsListService.execute(page, model);
		cookiesService.execute(request, model, loginCommand);
		return "thymeleaf/index";
	}
	@Autowired
	CookiesService cookiesService;
	@PostMapping("/")
	public ModelAndView index(int page, Model model) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("jsonView");
		mainGoodsListService.execute(page, model);
		return mav;
	}
	
	@GetMapping("/mailling")
	public String mail() {
		return "thymeleaf/email";
	}
	@Autowired
	EmailSendService emailSendService;
	@PostMapping("/mailling")
	public String mail(String fromEmail
			,String toEmail, String subject
			,String contents) {
		emailSendService.mailSend(fromEmail, toEmail, subject, contents);
		return "redirect:/";
	}
	@GetMapping("smsSend")
	public String smsSend() {
		return "thymeleaf/sms";
	}
	@Autowired
	SMSMassageService sMSMassageService;
	@PostMapping("smsSend")
	public String smsSend(String userPhone
			,String message) {
		sMSMassageService.smsSend(userPhone, "010-7146-1970", message);
		return "redirect:/";
	}
	
	
	
	
	
	
	
	
}
