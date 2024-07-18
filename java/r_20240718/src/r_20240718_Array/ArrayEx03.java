package r_20240718_Array;

public class ArrayEx03 {
	public static void main(String [] args) {
		int [] i = {1,2,3,4,5};
		System.out.println(i[0]);
		System.out.println(i[1]);
		System.out.println(i[2]);
		System.out.println(i[3]);
		System.out.println(i[4]);
		for(int j = 0; j <= 4; j++) {
			System.out.println(i[j]);
		}
		System.out.println(i.length); // 5
		for(int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
		}
		for(int c : i) { // forEach
			System.out.println(c);
		}
		
	}
}
