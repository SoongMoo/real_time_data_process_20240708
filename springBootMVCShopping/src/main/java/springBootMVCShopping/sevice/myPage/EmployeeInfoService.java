package springBootMVCShopping.sevice.myPage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import jakarta.servlet.http.HttpSession;
import springBootMVCShopping.domain.AuthInfoDTO;
import springBootMVCShopping.domain.EmployeeDTO;
import springBootMVCShopping.mapper.EmployeeInfoMapper;

@Service
public class EmployeeInfoService {
	@Autowired
	EmployeeInfoMapper employeeInfoMapper; 
	public void execute(HttpSession session, Model model) {
		AuthInfoDTO auth = (AuthInfoDTO)session.getAttribute("auth");
		EmployeeDTO dto = employeeInfoMapper.employeeSelectOne(auth.getUserId());
		model.addAttribute("employeeCommand", dto);
	}
}
