package springBootMVCShopping.sevice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springBootMVCShopping.mapper.LoginMapper;

@Service
public class EmailCheckService {
	@Autowired
	LoginMapper loginMapper;
	public Integer execute(String userEmail) {
		return loginMapper.emailCheckSelectOne(userEmail);
	}
}
