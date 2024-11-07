package springBootMVCShopping;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer{
	@Autowired
	InteceptorConfig inteceptorConfig;
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		//로그인 하지 않아도 되는 페이지 저장
		List<String> excludeList = new ArrayList<String>();
		excludeList.add("/help/**/*");
		excludeList.add("/login/**/*");
		excludeList.add("/static/**/*");
		excludeList.add("/register/**/*");
		excludeList.add("/checkRest/**/*");
		excludeList.add("/corner/**/*");
		excludeList.add("/review/**/*");
		excludeList.add("/payment/**/*");
		registry.addInterceptor(inteceptorConfig)
				.addPathPatterns("/**/*")// 모두차단
				.excludePathPatterns(excludeList);// 허용할 주소
	}
}







