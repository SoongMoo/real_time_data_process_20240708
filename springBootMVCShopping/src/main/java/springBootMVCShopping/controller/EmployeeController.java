package springBootMVCShopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springBootMVCShopping.command.EmployeeCommand;
import springBootMVCShopping.command.MemberCommand;
import springBootMVCShopping.sevice.AutoNumService;
import springBootMVCShopping.sevice.employee.EmployeeDeleteService;
import springBootMVCShopping.sevice.employee.EmployeeDetailService;
import springBootMVCShopping.sevice.employee.EmployeeInsertService;
import springBootMVCShopping.sevice.employee.EmployeeListService;
import springBootMVCShopping.sevice.employee.EmployeeUpdateService;
import springBootMVCShopping.sevice.employee.EmployeesDeleteService;

@Controller
@RequestMapping("employee")
public class EmployeeController {
	@Autowired
	AutoNumService autoNumService;
	@Autowired
	EmployeeInsertService employeeInsertService;
	@Autowired
	EmployeeListService employeeListService;
	@Autowired
	EmployeesDeleteService employeesDeleteService;
	@Autowired
	EmployeeDetailService employeeDetailService;
	@RequestMapping(value="employeeList", method=RequestMethod.GET)
	//페이징과 검색을 위한 코드를 추가하겠습니다.
	public String empList(
			@RequestParam(value="page", required = false, defaultValue = "1" ) int page,
			@RequestParam(value="searchWord" , required = false) String searchWord,
			Model model) {
		//직원 목록을 가져오도록 해보자.
		employeeListService.execute(searchWord, page,model);
		return "thymeleaf/employee/employeeList";
	}
	@GetMapping("empRegist")
	public String form(Model model ) {
		String autoNum = autoNumService.execute("emp_", "emp_num", 5, "employees");
		EmployeeCommand  employeeCommand = new EmployeeCommand();
		employeeCommand.setEmpNum(autoNum);
		model.addAttribute("employeeCommand", employeeCommand);
		return "thymeleaf/employee/employeeForm";
	}
	@RequestMapping(value="empRegist", method=RequestMethod.POST)
	// html에 있는 값을 command로 받아와야 한다.
	// html에서 넘어온 값에 대해 유효성 검사를 합니다.
	public String form(@Validated EmployeeCommand employeeCommand,BindingResult result , Model model ) {
		// 정상적으로 저장되었다면 직원목록페이지로 이동
		if(result.hasErrors()) {
			// 오류가 있다면 employeeForm페이지가 열리게 합니다.
			return "thymeleaf/employee/employeeForm";
		}
		// 모두 입력을 했다면 비밀번호확인 검사
		if (!employeeCommand.isEmpPwEqualsEmpPwCon()) {
			System.out.println("비밀번호 확인이 다릅니다.");
			//틀렸으면 다시 employeeForm페이지가 열리게 합니다.
			return "thymeleaf/employee/employeeForm";
		}
		//모든 오류가 없으면 디비에 저장
		employeeInsertService.execute(employeeCommand);
		return "redirect:employeeList";
	}
	
	@PostMapping("empsDelete")
	public String membersDelete( 
			@RequestParam(value="empDels") String empsDel []) {
		employeesDeleteService.execute(empsDel);
		return "redirect:employeeList";
	}
	@RequestMapping(value="employeeDetail",method=RequestMethod.GET)
	public String employeeDetail(@RequestParam(value = "empNum") String empNum, Model model) {
		employeeDetailService.execute(empNum, model);
		return "thymeleaf/employee/empDetail";
	}
	@RequestMapping(value = "empModify", method = RequestMethod.GET)
	public String employeeUpdate(@RequestParam(value = "empNum") String empNum, Model model) {
		employeeDetailService.execute(empNum, model);
		return "thymeleaf/employee/employeeUpdate";
	}
	//데이터를 디비에 저장하기 위해 service를 만들어 줍니다.
	@Autowired
	EmployeeUpdateService employeeUpdateService;
	@RequestMapping(value = "empModify", method = RequestMethod.POST)
	public String employeeUpdate(@Validated EmployeeCommand employeeCommand, BindingResult result) {
		// 유효성 검사하기 위해서 validated를 해줍니다.그리고 BindingResult 을 추합니다.
		// 오류 체크를 합니다.
		if (result.hasErrors()) {
			/// 오류가 있으면 현 페이지가 열리게 합니다.
			return "thymeleaf/employee/employeeUpdate";
		}
		employeeUpdateService.execute(employeeCommand);
		//수정하고 직원상세페이지로 
		return "redirect:employeeDetail?empNum=" + employeeCommand.getEmpNum();
	}
	// 디비에서 삭제하기 위해 service를 만들어 줍니다.
	@Autowired
	EmployeeDeleteService employeeDeleteService;
	@GetMapping("empDelete")
	public String employeeDelete(@RequestParam(value = "empNum") String empNum) {
		// service를 실행 시켜줍니다.
		employeeDeleteService.execute(empNum);
		//직원 정보를 삭제한 후 직원목록 페이지로 이동합니다.
		return "redirect:employeeList";
		//인사담당자가 직원을 등록하는 것부터 직원 리스트 그리고 직원 수정 또한 직원 삭제 까지 봤습니다.
		//다음시간에는 직원 개인이 자신의 정보를 수정할 수 있고 비밀번호도 수정할 수 있도록 해 보겠습니다.
	}
}







