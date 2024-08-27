package j20240827;

public class Ex06 {

	public static void main(String[] args) {
		/* 사직연산자 : +, -, *, /, %
		 * 증가감연산자 : ++, --
		 * 연결연산자 : + : 문자열일 때
		 * 대입연산자 : +=, -=, *=, /=, %= 
		 *            html 엔티티코드
		 * 비교연산자 : >:gt ,<:lt , >=:gte , <=:lte , ==:eq , !=
		 * 논리연산자 : && , ||
		 */
		boolean t = true;
		boolean f = false;
		boolean result = t && f; /// true && false
		System.out.println(result); 
		result = t || f;         /// true || false
		System.out.println(result);
		// 논리연산을 하기 위해서는 부울타입인 결과가 오는 식과 같이 사용해야 한다.
		int eng = 50;
		int kor = 60;
		int mat = 70;
		// 각 과목이 모두 40점 이상이고 평균이 60이상이어야 true이다.
		result = eng >= 40 && kor >= 40 && mat >= 40 
				&& (eng + kor + mat ) / 3 >= 60;
		System.out.println(result);
		// 조건연산자: 삼항연산자.
		String str = result ? "합격입니다." : "불합격입니다."; 
		System.out.println(str);
		System.out.println(result ? "합격입니다." : "불합격입니다.");
		// 4년마다 윤년이지만 100년마다는 윤년이 아니다.
		// 400마다는 윤년이 된다.
		int year = 2200;
		result = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		System.out.println(result);
		
		str = result ? "윤년입니다":"평년입니다";
		System.out.println(str);
		
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("윤년입니다");
		}else {
			System.out.println("평년입니다");
		}
	}
}
