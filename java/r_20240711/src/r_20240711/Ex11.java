package r_20240711;

public class Ex11 {
	public static void main(String[] args) {
		// 가변 2차원 배열
		int i1[] = {1,2,3,4};
		int i2[] = {10,11};
		int i3[] = {11,21,31,41,51};
		int ii[][] = new int[3][];
		ii[0] = i1;
		ii[1] = i2;
		ii[2] = i3;
		System.out.println(ii[0][3]);
		System.out.println(ii[1][1]);
		System.out.println(ii[2][4]);
		//System.out.println(ii[1][2]);
		for(int [] row : ii) {
			for(int col : row) {
				System.out.println(col);
			}
		}
		System.out.println(ii[0].length); //4
		System.out.println(ii[1].length); //2
		System.out.println(ii[2].length); //5
		for(int row = 0; row < ii.length; row++) {
			for(int col = 0; col < ii[row].length ; col++) {
				System.out.println(ii[row][col]);
			}// ii[row].length : 각행의 크기를 가져온다.
		}
	}
}
