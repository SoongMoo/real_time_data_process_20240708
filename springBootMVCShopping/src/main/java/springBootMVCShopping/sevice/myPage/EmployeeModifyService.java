package springBootMVCShopping.sevice.myPage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import jakarta.servlet.http.HttpSession;
import springBootMVCShopping.command.EmployeeCommand;
import springBootMVCShopping.domain.AuthInfoDTO;
import springBootMVCShopping.domain.EmployeeDTO;
import springBootMVCShopping.mapper.EmployeeInfoMapper;

@Service
public class EmployeeModifyService {
	@Autowired
	PasswordEncoder passwordEncoder;
	@Autowired
	EmployeeInfoMapper employeeInfoMapper;
	public void execute(EmployeeCommand employeeCommand, HttpSession session) {
		AuthInfoDTO auth = (AuthInfoDTO)session.getAttribute("auth");
		if(passwordEncoder.matches(employeeCommand.getEmpPw(), auth.getUserPw())) {
			EmployeeDTO dto = new EmployeeDTO();
			dto.setEmpAddr(employeeCommand.getEmpAddr());
			dto.setEmpAddrDetail(employeeCommand.getEmpAddrDetail());
			dto.setEmpEmail(employeeCommand.getEmpEmail());
			dto.setEmpNum(employeeCommand.getEmpNum());
			dto.setEmpPhone(employeeCommand.getEmpPhone());
			dto.setEmpPost(employeeCommand.getEmpPost());
			employeeInfoMapper.employeeUpdate(dto);
		}
		
	}
}
