package springBootMVCShopping.sevice.member;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import springBootMVCShopping.command.MemberCommand;
import springBootMVCShopping.domain.MemberDTO;
import springBootMVCShopping.mapper.MemberMapper;

@Service
public class MemberWriteService {
	@Autowired
	MemberMapper memberMapper;
	@Autowired
	PasswordEncoder passwordEncoder;
	public void execute(MemberCommand memberCommand) {
		MemberDTO dto = new MemberDTO();
		/*
		dto.setGender(memberCommand.getGender());
		dto.setMemberAddr(memberCommand.getMemberAddr());
		dto.setMemberAddrDetail(memberCommand.getMemberAddrDetail());
		dto.setMemberBirth(memberCommand.getMemberBirth());
		dto.setMemberEmail(memberCommand.getMemberEmail());
		dto.setMemberId(memberCommand.getMemberId().trim());
		dto.setMemberName(memberCommand.getMemberName().trim());
		dto.setMemberNum(memberCommand.getMemberNum());
		dto.setMemberPhone1(memberCommand.getMemberPhone1().trim());
		*/
		BeanUtils.copyProperties(memberCommand, dto);
		
		if(memberCommand.getMemberPhone2() != null) {
			dto.setMemberPhone2(memberCommand.getMemberPhone2().trim());
		}
		String encodePw = passwordEncoder.encode(memberCommand.getMemberPw());
		dto.setMemberPw(encodePw);
		
		dto.setMemberPost(memberCommand.getMemberPost());
		memberMapper.memberInsert(dto);
	}
}
