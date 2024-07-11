package r_20240711;

public class Ex10 {

	public static void main(String[] args) {
		int i1[] = {1,2,3,4};
		int i2[] = {10,20,30,40};
		int i3[] = {11,12,13,14};
		int ii [][] = new int[3][]; // 0 ~ 2
		ii[0] = i1;
		ii[1] = i2;
		ii[2] = i3;
		System.out.println(ii[1][2]);
		System.out.println(ii[2][3]);
		               //0  1  2  3
		int ii1 [][] = {{1 ,2 ,3 ,4}      // 0
					   ,{10,20,30,40}  // 1
					   ,{11,12,13,14}};// 2
		System.out.println(ii1[1][2]);
		                         //  0  1  2  3
		int ii2 [][] = new int[][] {{1 ,2 ,3 ,4}   // 0
								   ,{10,20,30,40}  // 1
								   ,{11,12,13,14}};// 2
		System.out.println(ii2[1][2]);						   
		int ii3 [][] = new int[2][3]; 
							/* [00][01][02]
							 * [10][11][12]
							 */
		ii3[0][0] = 1;
		ii3[0][1] = 3;
		ii3[1][2] = 100;
		
		/// 2차원배열 선언
		//1. 2차원에 1차원 대입
		int j [][] = new int [3][];
		//2.
		int j1[][] = {{1,2},{3,4}};
		//3. 
		int [][]j2 = new int[][] {{1,2},{3,4}};
		//4.       ///      행  열  : 열은 1 차원의 크기
		int [][]j3 = new int[2][3];
		System.out.println(j3.length); // 행의 크기
		System.out.println(j3[0].length); // 열의 크기
		for(int rowIdx = 0; rowIdx < j3.length ; rowIdx++) {
			for(int colIdx = 0 ; colIdx < j3[rowIdx].length ; colIdx++) {
				System.out.println(j3[rowIdx][colIdx]);
			}
		}
		for( int [] row  : j3) {
			for( int col  : row) {
				System.out.println(col);
			}
		}
		
		
		
	}

}
