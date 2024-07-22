package r_20240722;

public class ArrayEx04 {
	public static void main(String[] args) {
		// 2차원 배열 선언
		// 1. 
		String str1 [][] = {{"이숭무","이상범","이장범"},{"김찬중","이상희"}};
		// 2. 
		String str2[][] = 
			new String[][] {{"이숭무","이상범","이장범"},{"김찬중","이상희"}};
		// 3.
		String str3[][] = new String [2][3];
		// 4. 
		String str4[][] = new String [2][];
		str4[0] =new String[3];
		str4[1] =new String[2];
		//5. 
		String str5[][];
		str5 = new String[][] {{"이숭무","이상범","이장범"},{"김찬중","이상희"}};
		str5 = new String [2][3];
		str5 = new String [2][];
	}
}