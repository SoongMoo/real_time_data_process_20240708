package r_20240708;

public class Ex03 {
	public static void main(String[] args) {
		// 형변환
		// 자동 / 강제
		short s= 10;
		int i = s; // 자동
		byte b = (byte)i; // 강제
		/*   1       2       4       8       4
		 * byte => short => int => long => float => double 
		 * 
		 * 정수 => 실수 : 자동
		 * 실수 => 정수 : 강제
 		 */
		float f = i;
		System.out.println(f);
		i = (int)f;
		System.out.println(i);
	}
}