package j20240827;

public class Ex01 {

	public static void main(String[] args) {
		int i ; // 선언
		i = 10; // 대입
		double d = 20.5; // 초기화
		//리터널 자료형 : 
		/* 정수 : byte (-128 ~ 127, short ( -32768 ~ +32767), int, long : signed
		 * 실수 : float, double
		 * 문자(정수) : char(unsigned) : 0 ~ 65535 : 2byte : unicode
		 *            ASCII : 0 ~ 254 : 영어 
		 * 부울 : boolean : true/false
		 */
		boolean bl = true;
		char ch = '숭'; // 49709
		System.out.println(ch);
		System.out.println((int)ch);
		ch = 49709;
		System.out.println(ch);
		// 형변환 
		/* 자동형변환 :  작은형이 큰형이 되는 것을 말한다.
		 *   byte => short => int => long 
		 *             정수 => 실수
		 *                                => float => double
		 *  
		 *   byte나 short는 char로 자동형변환이 되지 못한다.
		 *   char는  음수값을 받지 못하므로.
		 *   
		 *   강제형변환 : 큰형이 작은형이 되는 것을 말한다.
		 *              overflow 가 발새하여 값이 달라질 수 있다.
		 */ 
		ch = 65534;
		byte b = (byte)ch; // 작은 형으로 바꿀때에는 자료형을 명시해줘야 한다.
		System.out.println(b);
	}
}
