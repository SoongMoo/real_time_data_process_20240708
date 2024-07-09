package r_20240708;

public class Ex02 {
	public static void main(String[] args) {
		// 정수형리터널
		byte b;  // 1byte
		b = -128;
		System.out.println(b);
		b = 127;
		System.out.println(b);
		short s; // 2byte
		s = -32768;
		System.out.println(s);
		s = 32767;
		System.out.println(s);
		int i = -2100000000; // 4byte
		System.out.println(i);
		i = 2100000000;
		System.out.println(i);
		long l = -2200000000l; // 8byte
		System.out.println(l);
		l = 320000;
		System.out.println(l);
		/// 실수 리터널
		float f = 0.12345678901234567890f;
		System.out.println(f); // 4byte
		double d= 0.12345678901234567890;
		System.out.println(d); // 8byte
		// 논리형
		boolean bl = true;
		bl= false;
		// 문자 , 정수
		char ch = 'A';
		ch = 65;  
		// 문자열
		String str = "이숭무";
		System.out.println("이숭무");
	}
}
