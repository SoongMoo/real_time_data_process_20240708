package r_20240711;

public class Ex15 {

	public static void main(String[] args) {
		//2. 
		int [][] i1 = {{1,2,3},{4,5,6},{7,8,9}};
		//                 0       1      2 : 행
		//              0 1 2 3   0 1   0 1 2  : 열
		int [][] i2 = {{1,2,3,4},{5,6},{7,8,9}};
		System.out.println(i2.length); // 
		System.out.println(i2[0].length); // 4
		System.out.println(i2[1].length); // 2
		System.out.println(i2[2].length); // 3
		for(int row[] : i2) {
			for(int val : row ) {
				System.out.println(val);
			}
		}
		for(int rowIdx =0 ; rowIdx < i2.length ; rowIdx++) {
			for(int colIdx = 0;colIdx < i2[rowIdx].length ; colIdx++) {
				System.out.println(i2[rowIdx][colIdx]);
			}
		}
	}

}
