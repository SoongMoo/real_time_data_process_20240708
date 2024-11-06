package springBootMVCShopping.service.help;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import springBootMVCShopping.mapper.FindMapper;

@Service
public class FindIdService {
	@Autowired
	FindMapper findMapper;
	public void execute(String userPhone,String userEmail,Model model) {
		String userId = findMapper.findId(userPhone, userEmail);
		model.addAttribute("userId", userId);
	}
}
