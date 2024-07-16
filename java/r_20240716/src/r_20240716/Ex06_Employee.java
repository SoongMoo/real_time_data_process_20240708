package r_20240716;

public class Ex06_Employee {
	String empNum; 
	String empName;
	String empAddr;
	String emPhone;
	char empGender;
	public Ex06_Employee() {}
	public Ex06_Employee(String empAddr, String emPhone, char empGender) {
		this.empAddr  = empAddr;
		this.emPhone = emPhone;
		this.empGender = empGender;
	}
	public Ex06_Employee(String empNum,String empName ) {
		this("서울", "010-1234-3214", 'M');
		this.empNum = empNum;
		this.empName = empName;
	}
	
}
