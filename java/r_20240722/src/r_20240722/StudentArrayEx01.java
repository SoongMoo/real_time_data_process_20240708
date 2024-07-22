package r_20240722;

public class StudentArrayEx01 {
	public static void main(String[] args) {
		int i1 = 10;
		int i2 = 20;
		int i3 = 30;
		int i[] = new int[3]; // 배열
		i[0] = 10; i[1] = 20; i[2] = 30;
		System.out.println(i[0]);
		Student stu1 = new Student(10001, "이숭무", 176.5, false, 3);
		Student stu2 = new Student(10002, "이상범", 177.5, false, 3);
		Student stu3 = new Student(10003, "이장범", 178.5, false, 3);
		Student [] stu = new Student[3]; // 객체 배열
		stu[0] = new Student(10001, "이숭무", 176.5, false, 3);
		stu[1] = new Student(10002, "이상범", 177.5, false, 3);
		stu[2] = new Student(10003, "이장범", 178.5, false, 3);
		System.out.println(stu[0].getStudentNum()); // 값 출력
		stu[0].setGender(true); // 값 수정
		System.out.println(stu[0].isGender()); // 값 출력
	}
}
