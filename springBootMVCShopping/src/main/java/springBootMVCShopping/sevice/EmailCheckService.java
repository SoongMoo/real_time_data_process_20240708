package springBootMVCShopping.sevice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springBootMVCShopping.mapper.LoginMapper;
import springBootMVCShopping.mapper.MemberMapper;

@Service
public class EmailCheckService {
	@Autowired
	LoginMapper loginMapper;
	@Autowired
	MemberMapper memberMapper;
	public Integer execute(String userEmail) {
		return loginMapper.emailCheckSelectOne(userEmail);
	}
	public Integer update(String userEmail) {
		Integer i = loginMapper.emailCheckSelectOne(userEmail);
		// 1, null
		if(i != null) {
				i  = memberMapper.memberEmailCheckUpdate(userEmail);
				// 0, 1
		}
		return i;
	}
}
