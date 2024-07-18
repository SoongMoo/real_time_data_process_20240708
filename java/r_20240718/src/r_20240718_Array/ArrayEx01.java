package r_20240718_Array;

public class ArrayEx01 {
	public static void main(String[] args) {
		// 변수 : 하나값만 가진다.
		// 배열 : 하나이상의 값을 저장하기 위해서 
		int i0 = 10;
		int i1 = 20;
		int i2 = 30;
		//                        i0 i1 i2
		int i [] = new int[3]; // [] [] []
		//                         0  1  2 : index
		i[1] = 20;
		System.out.println(i[1]);
		double d0 = 10.5;
		double d1 = 20.5;
		double d [] = new double[2]; // [ ][ ]
		//                               0  1
		d[0] = 10.5;
		System.out.println(d[0]);
		
		String str0 = "이숭무";
		String str[] = new String[1];
		str[0] = "이숭무";
	}
}
