package r_20240716;

public class Ex11 {

	public static void main(String[] args) {
		// Ex11_Student.serialNum = 100000;
		Ex11_Student student1 = new Ex11_Student(
				Ex11_Student.serialNum++ , "이숭무", 4, "성남");
		Ex11_Student student2 = new Ex11_Student(
				Ex11_Student.serialNum++, "이상범", 4, "서울");
		// ...
		Ex11_Student student_n = new Ex11_Student(
				Ex11_Student.serialNum++, "이상범", 4, "서울");
		student1.print();
		student2.print();
		student_n.print();
	}

}
