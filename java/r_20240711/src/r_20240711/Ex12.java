package r_20240711;

public class Ex12 {

	public static void main(String[] args) {
		// 1차원 배열 선언
		// 1. 
		int [] i = {1,2,3,4};
		// 2.
		int [] i1 = new int[] {1,2,3,4};
		// 3. 
		int [] i2 = new int[3];
		i2[0] = 1;
		i2[1] = 2;
		i2[2] = 3;
		// 4.
		int [] i3;
		i3 = new int[]{1,2,3,4,5};
		System.out.println(i3[0]);
		i3 = new int[4];
		i3[2] = 100;
		System.out.println(i3[2]);
	}

}
