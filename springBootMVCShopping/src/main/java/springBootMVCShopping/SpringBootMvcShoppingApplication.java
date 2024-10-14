package springBootMVCShopping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@SpringBootApplication
@Controller
public class SpringBootMvcShoppingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMvcShoppingApplication.class, args);
	}
	@RequestMapping("/")
	public String index() {
		return "thymeleaf/index";
	}
}
