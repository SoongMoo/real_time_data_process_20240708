package r_20240718_Array;

public class ArrayEx07 {

	public static void main(String[] args) {
		int i1 [][] = new int[][] {{1,2,3},{4,5},{6,7,8,9}};
		//  0  1  2   
		// [1][2][3]      : 0       // i1[0].length  // 3
		// [4][5]         : 1       // i1[1].length  // 2
		// [6][7][8][9]   : 2       // i1[2].length  // 4
		System.out.println(i1[0][0]);
		System.out.println(i1[0][1]);
		System.out.println(i1[0][2]);
		System.out.println(i1[1][0]);
		System.out.println(i1[1][1]);
		System.out.println(i1[2][0]);
		System.out.println(i1[2][1]);
		System.out.println(i1[2][2]);
		System.out.println(i1[2][3]);
		for(int row = 0; row <= 2; row ++) {
			for(int col = 0; col < i1[row].length ; col++ )
				System.out.println(i1[row][0]);
		}
		for(int [] a : i1) {
			for(int val : a) {
				System.out.println(val);
			}
		}	
	}

}
