package day1_1;

public class TestClass {
	public static void main(String [] args) {
		System.out.println("Hello 이숭무");
		// -128 ~ 127
		byte 이숭무;// 선언
		이숭무 = 10; // 초기화
		System.out.println(이숭무);
		String 이장범; // 문자열 변수 선언
		이장범 = "이상범"; // 초기화
		System.out.println(이장범);
		//byte 20; 변수명이 숫자일 수 없다.
		이숭무 = 20; // 대입
		System.out.println(이숭무);
		byte a = 30; // 선언과 초기화
		System.out.println(a);
		
		String firstName = "이";
		System.out.println(firstName);
		//String firstName ;
		// 변수명은 한번만 선언한다.
		firstName = "숭";
		System.out.println(firstName);
		// 변수명은 대소문자를 구분한다.
		String firstname;
		firstname = "무";//초기화를 안하면 오류
		System.out.println(firstName);
		System.out.println(firstname);
	}
}
