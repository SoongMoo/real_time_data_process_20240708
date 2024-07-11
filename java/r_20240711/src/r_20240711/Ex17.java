package r_20240711;

public class Ex17 {

	public static void main(String[] args) {
		//4.
		int [][] i1 = new int[2][];
		int [] ii1 = {1,2,3};
		int [] ii2 = {4,5};
		int [] ii3 = {6,7,8,9};
		i1[0] = ii1;
		i1[1] = ii2;
		i1[2] = ii3;
		for(int rowIdx = 0 ; rowIdx < i1.length ; rowIdx++) {
			for(int colIdx = 0; colIdx < i1[rowIdx].length; colIdx++) {
				System.out.println(i1[rowIdx][colIdx]);
			}
		}
	}

}
