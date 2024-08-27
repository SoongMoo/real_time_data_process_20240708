package j20240827;

public class Ex04 {

	public static void main(String[] args) {
		// 대입연산자 : +=, -=, *=, /=, %=
		int i = 10;
		i = i + 1; // 사직연산 
		i++;        // 증가연산
		i += 1;     // 대입연산
		// 같은 연산식이다.
		i = i + 3; // 1
		i += 3; // 2
		i = 10;
		// 1과 2식은 같은 식이다.
		int j = 3;
		i = i % j; // 3
		System.out.println(i);
		i = 10;
		i %= j;    // 4
		System.out.println(i);
		// 3과 4 식은 같은식이다.
	}

}
