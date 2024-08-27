package j20240827;

public class Ex12 {

	public static void main(String[] args) {
		int i1 [] = new int[4]; // [][][][] i1
		                        //  0 1 2 3
		i1[0] = 10;
		i1[1] = 20;
		i1[2] = 30;
		i1[3] = 40;
		// i1[4] = 50; java.lang.ArrayIndexOutOfBoundsException
		// for - Each
		for(int i : i1) {
			System.out.println(i);
		}
		for(int idx = 0; idx < i1.length ; idx++) {
			i1[idx] = (idx + 1) * 10;
		}
		for(int idx = 0; idx < i1.length ; idx++) {
			System.out.println(i1[idx]);
		}
	}
}





