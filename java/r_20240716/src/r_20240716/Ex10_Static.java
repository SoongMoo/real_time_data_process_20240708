package r_20240716;

public class Ex10_Static {
	static int num2 = 10; // 정적 변수 : 클래스 내에 있는 변수
	                      // 클래스 변수
	int num1; // 멤버    : 객체내에 있는 변수
	int result; // 멤버
	
	public static void add(int num1 , int num2) {
		System.out.println(num1 + num2);
	}
}
