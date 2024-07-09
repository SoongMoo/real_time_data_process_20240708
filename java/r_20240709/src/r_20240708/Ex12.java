package r_20240708;

public class Ex12 {
	public static void main(String[] args) {
		// 4년마다 윤년이지만 100년마다는 윤년이 아니다.
		// 400마다는 윤년이 된다.
		// 4배수 : year % 4 == 0
		// 100 배수 : year % 100 == 0
		// 400배수 : year % 400 == 0
		int year = 2200; // true:윤년 / false : 평년
		boolean result;
		result = year % 4 == 0 && year % 100 != 0 || year % 400 ==0;
		System.out.println(result);
		String str;
		str = result ? "윤년" : "평년"; // 조건 연산자
		System.out.println(str);
		str = year % 4 == 0 && year % 100 != 0 || year % 400 ==0
				? "윤년" : "평년"; 
		System.out.println(str);
		int num = 10;
		result = num % 2 == 0; // 짝수
		
		num = result ? 10 + 5 : 10 - 5;
		System.out.println(num);
		
	}
}
