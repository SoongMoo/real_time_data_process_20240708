package r_20240708;

public class Ex06 {
	public static void main(String[] args) {
		// 문자열에서 +연산자는 연결연산자
		String str1, str2; 
		str1 = "Hello";
		str2 = "Java";
		System.out.println(str1 + str2);
		int i, j;
		i = 10;
		j = 20;
		System.out.println(str1 + i + j);
		System.out.println(str1 + (i + j));
		// 숫자와 문자가 만나면 숫자는 문자로 자동형변환이 된다.
		System.out.println(str1 + " " +str2);
	}
}
