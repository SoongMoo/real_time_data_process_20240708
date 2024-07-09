package r_20240708;

public class Ex11 {
	public static void main(String[] args) {
		// +, - ,*, / , % : 산술연자
		// 문자열 + : 연결연산자
		// ++, -- : 증가감연산자 , 선행/후행
		// +=, -=, *=, /= , %= , = : 대입연산자
		// <, >, >= ,<= ,==, != : 비교연산자 : 관계연산자.
		// 논리연산자: &&, || : 결과는 논리값을 갖는다.
		//                    피연산자도 논리값이다.
		boolean i, j, result;
		i = true;
		j = false;
		result = i && j;
		System.out.println(result);
		result = i || j;
		System.out.println(result);
		result = true && true;
		// 논리 연산자를 사용하는 경우에는 비교연산자와 같이 사용
		int eng = 60;
		int kor = 70;
		int mat = 40;
		// 과목이 적어도 한 과목이 40미만이면 false
		// 평균이 60미만이어도 false이다 
		// 위 결과는 true인가 false인가?
		result = mat < 40 && eng < 40 && kor < 40 
				&& (mat + kor+ eng) /3 < 60;
		System.out.println(result);
	}
}
