package r_20240716;

public class Ex12_Student {
	int studentId;
	String studentName;
	int grade;
	String address;
	public Ex12_Student() {}
	public Ex12_Student(int studentId,String studentName, 
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
