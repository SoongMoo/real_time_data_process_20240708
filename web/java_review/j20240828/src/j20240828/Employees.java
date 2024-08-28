package j20240828;

// 캡슐화
public class Employees {
	/// 멤버변수, 멤버필드, 
	String empNum;
	String enpName;
	int salary;
	double commiaaionPct;
	// Alt + shift + s  o 생성자
	public String getEmpNum() {
		return empNum;
	}
	public Employees(String empNum, String enpName, int salary, double commiaaionPct) {
		super();
		this.empNum = empNum;
		this.enpName = enpName;
		this.salary = salary;
		this.commiaaionPct = commiaaionPct;
	}
	// Alt + Shift + s  r :setter/getter
	public void setEmpNum(String empNum) {
		this.empNum = empNum;
	}
	public String getEnpName() {
		return enpName;
	}
	public void setEnpName(String enpName) {
		this.enpName = enpName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public double getCommiaaionPct() {
		return commiaaionPct;
	}
	public void setCommiaaionPct(double commiaaionPct) {
		this.commiaaionPct = commiaaionPct;
	}
}
