package r_20240716;

public class Ex04_Employee {
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
	public Ex04_Employee() {}
	public Ex04_Employee(String empNum, String empName) {
		setData(empNum, empName,"서울", "010-1234-5678", 'M');
	}
	public Ex04_Employee(String empAddr, String empPhone, char empGender) {
		setData("123456", "이숭무", empAddr, empPhone, empGender);
	}
	public Ex04_Employee(String empNum, String empName,
			String empAddr, String empPhone, char empGender) {
		this.empNum = empNum;
		this.empName = empName;
		this.empAddr = empAddr;
		this.emPhone = empPhone;
		this.empGender = empGender;
	}
	public void setData(String empNum, String empName,
			String empAddr, String empPhone, char empGender) {
		this.empNum = empNum;
		this.empName = empName;
		this.empAddr = empAddr;
		this.emPhone = empPhone;
		this.empGender = empGender;
	}
}






