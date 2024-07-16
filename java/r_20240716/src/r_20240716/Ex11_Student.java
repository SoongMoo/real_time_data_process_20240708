package r_20240716;

public class Ex11_Student {
	static int serialNum;
	static int num1;
	int studentId;
	String studentName;
	int grade;
	String address;
	
	static { // static블럭
		serialNum = 100001;
		// studentId = 1000;
		//um1 = 10000;
		setNum1();
	}
	public static void setNum1() {
		num1 = 10000;
		//studentId = 10000;
	}
	public Ex11_Student() {}
	public Ex11_Student(int studentId,String studentName, 
			int grade, String address) {
		 this.address = address;
		 this.grade = grade;
		 this.studentId = studentId;
		 this.studentName = studentName;
	}
	public void print() {
		System.out.println(studentId);
		System.out.println(studentName);
		System.out.println(grade);
		System.out.println(address);
	}
}
