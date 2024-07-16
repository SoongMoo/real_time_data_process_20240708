package r_20240716;

public class Ex05_Employee {
	// 직원번호
	String empNum; 
	// 직원이름
	String empName;
	// 직원주소
	String empAddr;
	// 직원 연락처
	String emPhone;
	// 성별
	char empGender;
	public Ex05_Employee() {}
	public Ex05_Employee(String empNum, String empName) {
		this(empNum, empName,"서울", "010-1234-5678", 'M');
	}
	public Ex05_Employee(String empAddr, String empPhone, char empGender) {
		this("123456", "이숭무", empAddr, empPhone, empGender);
		// this메서드 : 생성자내에서 다른 생성자를 실행 시킬때 사용
	}
	public Ex05_Employee(String empNum, String empName,
			String empAddr, String empPhone, char empGender) {
		this.empNum = empNum;
		this.empName = empName;
		this.empAddr = empAddr;
		this.emPhone = empPhone;
		this.empGender = empGender;
	}
}
