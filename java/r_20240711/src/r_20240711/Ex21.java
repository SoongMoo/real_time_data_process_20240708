package r_20240711;

public class Ex21 {
	public static void main(String[] args) {
		/*
		 * 변수장점 : 값을 바꿀 수 있다
		 * 변수단점 : 하나의 값만 저장가능하다.
		 * 배열장점 : 하나이상의 값을 저장 할 수 있다.
		 * 배열단점 : 한 종류의 값만 저장 가능하다. 
		 * class : 여러 종류의 값을 저장하기 위해서 사용
		 */
		Student student = new Student();// 객체 생성
		student.name = "이숭무";
		student.studentNum = "d1234567";
		student.age = 30;
		student.height = 173.5;
		student.gender = true;
		int i = 10;
		System.out.println(i);
		System.out.println(student.name);
		System.out.println(student.height);
		
 	}
}
