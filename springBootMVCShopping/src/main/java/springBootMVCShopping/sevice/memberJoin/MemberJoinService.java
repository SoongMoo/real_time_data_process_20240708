package springBootMVCShopping.sevice.memberJoin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import springBootMVCShopping.command.UserCommand;
import springBootMVCShopping.domain.MemberDTO;
import springBootMVCShopping.mapper.UserMapper;

@Service
public class MemberJoinService {
	@Autowired
	UserMapper userMapper;
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
		userMapper.userInsert(dto);
	}
}
