package springBootMVCShopping.service.memberJoin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import springBootMVCShopping.command.UserCommand;
import springBootMVCShopping.domain.MemberDTO;
import springBootMVCShopping.mapper.UserMapper;
import springBootMVCShopping.service.EmailSendService;
import springBootMVCShopping.service.SMSMassageService;

@Service
public class MemberJoinService {
	@Autowired
	UserMapper userMapper;
	@Autowired
	EmailSendService emailSendService;
	@Autowired
	SMSMassageService sMSMassageService;
	@Autowired
	PasswordEncoder passwordEncoder;
	public void execute(UserCommand userCommand) {
		MemberDTO dto = new MemberDTO();
		dto.setGender(userCommand.getGender());
		dto.setMemberAddr(userCommand.getMemberAddr());
		dto.setMemberAddrDetail(userCommand.getMemberAddrDetail());
		dto.setMemberBirth(userCommand.getMemberBirth());
		dto.setMemberEmail(userCommand.getMemberEmail());
		dto.setMemberId(userCommand.getMemberId());
		dto.setMemberName(userCommand.getMemberName());
		dto.setMemberPhone1(userCommand.getMemberPhone1());
		dto.setMemberPhone2(userCommand.getMemberPhone2());
		dto.setMemberPost(userCommand.getMemberPost());
		dto.setMemberPw(passwordEncoder.encode(userCommand.getMemberPw()));
		int i = userMapper.userInsert(dto);
		if(i > 0) {
			String contents = "<html><body>"; 
				   contents += dto.getMemberName() + "님 가입을 환영합니다.";
				   contents +="가입을 완료하시려면";
				   contents +="<a href='http://localhost:8080/userConfirm?chk="
				            +dto.getMemberEmail()+"'>여기</a>를클릭하세요.";
				   contents +="</body></html>";
			String subject = "환영 인사입니다.";
			String fromEmail = "soongmoostudent@gmail.com";
			String toEmail = dto.getMemberEmail();
			emailSendService.mailSend(fromEmail, toEmail, subject, contents);
			/*
			contents =  "안녕하세요 미소쇼핑몰 관리자입니다.";
			contents += dto.getMemberName() + "님 가입을 환영합니다.";
			contents += "이메일에서 회원가입인증이 필요합니다.";
			sMSMassageService.smsSend(dto.getMemberPhone1(),
					"010-7146-1970", contents);
			*/
		}
		
		
	}
}
