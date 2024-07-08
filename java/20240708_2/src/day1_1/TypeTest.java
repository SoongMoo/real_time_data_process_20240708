package day1_1;

public class TypeTest {

	public static void main(String[] args) {
		// 정수형 데이터
		byte b = -128; // 선언
		System.out.println(b);
		b= 127;
		System.out.println(b);
		short sh = -32768;
		System.out.println(sh);
		sh = 32767;
		System.out.println(sh);
		//b = 32767;
		int i = -2100000000;
		System.out.println(i);
		i = 2100000000;
		System.out.println(i);
		long l = 1000000000000000L;
		System.out.println(l);
		l = 1000000;
		System.out.println(l);
		// 실수형 데이터
		float f = 10.6f;
		System.out.println(f);
		double d = 10.5;
		System.out.println(d);
		// 논리형
		boolean bl = true;
		System.out.println(bl);
		bl = false;
		System.out.println(bl);
		// 문자
		char ch = 'A';
		System.out.println(ch);
		ch = 65;
		System.out.println(ch);
		ch = '이';
		System.out.println(ch);
	}

}
