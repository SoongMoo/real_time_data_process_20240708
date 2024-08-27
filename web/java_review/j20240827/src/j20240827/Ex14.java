package j20240827;

public class Ex14 {

	public static void main(String[] args) {
		// 배열의 초기값 
		int i [] = new int[4]; // 0 
		double d[] = new double[4]; //0.0
		boolean bl [] = new boolean[4]; // false
		String str [] = new String[4]; // null
		char ch [] = new char[4]; // blank
		for(int val : i) {
			System.out.println(val);
		}
		for(double val : d) {
			System.out.println(val);
		}
		for(boolean val : bl) {
			System.out.println(val);
		}
		for(String val : str) {
			System.out.println(val);
		}
		for(char val : ch) {
			System.out.println(val);
		}// 20240711 => 2차원
	}

}
