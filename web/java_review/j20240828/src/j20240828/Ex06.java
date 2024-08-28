package j20240828;

public class Ex06 {

	public static void main(String[] args) {
		int i = 10;
		int i1 = 20;
		String str1 = "이숭무";
		String str2 = "이상범";
		int [] studentNums =  {1,2,3};
		String [] studentNames = {"이숭무","이상범","김찬중"};
		double [] studentHeights = {100.5,120.5,130.5};
		System.out.println (studentNums[0] + studentNames[0] + studentHeights[0]);
		Student student1 = new Student(); // 1번학생 객체
		student1.studentNum = 1;
		student1.studentName = "이숭무";
		student1.studentHeight = 100.5;
		System.out.println(student1.studentNum + 
				student1.studentName + student1.studentHeight);
		Student student2 = new Student();// 2번학생 객체
		Student student3 = new Student();// 3번학생 객체
		
	}

}
