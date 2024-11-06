package springBootMVCShopping.service.help;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import springBootMVCShopping.domain.AuthInfoDTO;
import springBootMVCShopping.domain.UserChangePasswordDTO;
import springBootMVCShopping.mapper.FindMapper;
import springBootMVCShopping.mapper.LoginMapper;
import springBootMVCShopping.service.EmailSendService;


@Service
public class FindPwService {
	@Autowired
	FindMapper findMapper;
	@Autowired
	PasswordEncoder passwordEncoder; // 암호화 시키고 
	@Autowired
	LoginMapper loginMapper;
	@Autowired
	EmailSendService emailSendService;
	public void execute(String userId, String userPhone, Model model) {
		String newPw = UUID.randomUUID().toString().substring(0, 8);
		UserChangePasswordDTO dto = new UserChangePasswordDTO();
		dto.setUserId(userId);
		dto.setUserPhone(userPhone);
		dto.setUserPw(passwordEncoder.encode(newPw));
		
		AuthInfoDTO auth = loginMapper.loginSelectOne(userId);
		
		if(auth.getGrade().equals("mem")) {
			dto.setTableName("members");
			dto.setPwColumName("member_pw");
			dto.setUserIdColumName("member_id");
			dto.setPhoneColumn("member_phone1");
		}else if(auth.getGrade().equals("emp")){
			dto.setTableName("employees");
			dto.setPwColumName("emp_pw");
			dto.setUserIdColumName("emp_id");
			dto.setPhoneColumn("emp_phone");
		}
		
		int i = findMapper.pwUpdate(dto);
		model.addAttribute("auth", auth);
		model.addAttribute("newPw", newPw);
		
		if(i > 0) {
			// 내용
			String html = "<html><body>";
				   html+= auth.getUserName()+"님의 임시 비밀번호는 "+newPw+"입니다.";
				   html+=  "</body></html>";
			String subject = auth.getUserName() + "님의 임시비밀번호입니다."; 
			String fromEmail = "soongmoostudent@gmail.com";
			String toEmail = auth.getUserEmail();
			emailSendService.mailSend(fromEmail, toEmail, subject, newPw);
		}
	}
}










