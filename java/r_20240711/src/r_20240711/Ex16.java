package r_20240711;

public class Ex16 {
	public static void main(String[] args) {
		// 3. 
		int [][] i1 = new int [2][3];
		i1[0][0] = 10;
		i1[0][1] = 20;
		i1[0][2] = 30;
		i1[1][0] = 40;
		i1[1][1] = 50;
		i1[1][2] = 60;
		for(int rowIdx = 0; rowIdx < i1.length; rowIdx++) {
			for(int colIdx = 0 ; colIdx < i1[rowIdx].length ; colIdx++) {
				i1[rowIdx][colIdx] = (colIdx + 1) * 100;
			}
		}
		for(int [] row : i1) {
			for(int val : row) {
				System.out.println(val);
			}
		}
	}
}
