package springBootMVCShopping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import springBootMVCShopping.command.LoginCommand;
import springBootMVCShopping.sevice.EmailSendService;

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@SpringBootApplication
@Controller
public class SpringBootMvcShoppingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMvcShoppingApplication.class, args);
	}
	@RequestMapping("/")
	public String index(LoginCommand logincommand) {
		return "thymeleaf/index";
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
	
	
	
	
	
	
	
	
}
