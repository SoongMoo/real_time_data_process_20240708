package j20240827;

public class Ex02 {
	public static void main(String[] args) {
		// 연산자
		// 사직연산자 : + , - , * , / , % : 나머지 
		int i = 10;
		int j = 3;
		int result = i % j; // 10 % 3
		System.out.println(result);
		result = (int)i / j;//몫
		System.out.println(result);
		// 증감연산자 : ++, --
		i = 1;
		i = i + 1; // 1
		System.out.println(i); 
		i = i + 1; // 
		System.out.println(i);
		i++; // 증가 연산자 // 2
		// 1과 2의 공식은 같다.
		i = i - 1;
		i--; // i = i - 1
		System.out.println(i);
		result = i++; // 후행 : result = i, i = i + 1
		System.out.println(result);
		System.out.println(i);
		result = ++i; // 선행 : i = i + 1, result = i
		System.out.println(result);
		System.out.println(i);
		System.out.println(i++);
		/* System.out.println(i);
		 * i = i + 1; 
		 */
		System.out.println(++i);
		/* i = i + 1
		 * System.out.println(i);
		 */
	}
}
