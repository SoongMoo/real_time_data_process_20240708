package r_20240718_Array;

public class ArrayEx04 {
	public static void main(String[] args) {
		// 2차원배열은 1차원배열의 집합   // 0 1 2
		int i [][] = new int[2][3]; //[][][]  : 0
                                    //[][][]  : 1
		i[0][0] = 10;
		i[0][1] = 20;
		i[0][2] = 30;
		i[1][0] = 40;
		i[1][1] = 50;
		i[1][2] = 60;
		System.out.println(i[0][0]);
		System.out.println(i[0][1]);
		System.out.println(i[0][2]);
		System.out.println(i[1][0]);
		System.out.println(i[1][1]);
		System.out.println(i[1][2]);
	}
}
