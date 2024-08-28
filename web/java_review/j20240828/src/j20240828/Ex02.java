package j20240828;

public class Ex02 {
	public static void main(String[] args) {
		int i1 = 10;
		int i2 = 20;
		int i3 = 30;
		int [] ii1 = new int[] {10,20,30};
		int [] ii2 = new int[] {100,200,300};
		int [] ii3 = new int[] {1000,2000,3000};
		//                        0    1    2
		
		int [][] iii1 = 
				new int [][] {{10,20,30},{100,200,300},{1000,2000,3000}};
		//                         0            1              2
	    //                      0  1  2    0    1   2     0    1     2
		System.out.println(iii1[0][1]);
		iii1[1][1]= 400;
		System.out.println(iii1[1][1]);
		for( int [] array :   iii1) {
			for(int val : array) {
				System.out.println(val);
			}
		}
		for (int row = 0 ; row < iii1.length ; row++ ) {
			for(int col = 0 ; col < iii1[row].length ; col++) {
				iii1[row][col] = 10 * (row+1) * (col+1);
			}
		}
		
	}
}
