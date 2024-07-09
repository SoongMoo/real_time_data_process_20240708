package r_20240708;

public class Ex08 {

	public static void main(String[] args) {
		// 증가감 연산자의 선행 / 후행
		int i = 1;
		i++; // i = i + 1;
		System.out.println(i);
		++i;
		System.out.println(i);
		System.out.println(i = i + 1);
		System.out.println(i++); // 후행
		System.out.println(i);
		// System.out.println(i)
		// i = i + 1
		System.out.println(++i); // 선행
		// i = i + 1 // 6
		// System.out.println(i)
		int result;
		result = i++; // result 값은
		// result = i
		// i = i + 1
		System.out.println(result); //6
		System.out.println(i); //7
		result = ++i;
		// i = i + 1;
		// result = 1;
		System.out.println(result);
		System.out.println(i);
	}

}
