package j20240827;

public class Ex05 {
	public static void main(String[] args) {
		// + : 문자열에서는 연결연산자이다.
		String str1 = "hello";
		String str2 = " java";
		String result = str1 + str2;
		System.out.println(result);
		int i = 10;
		int j = 20;
		System.out.println(result + i + j); //i,j는 문자열로 자동형변환이 된다.
		System.out.println(i + j + result);  
		// 연산자 +의 연산방향은 왼쪽에서 오른쪽이므로 
		// 먼저 숫자가 연산된후 문자열과 연산되다.
	}
}
