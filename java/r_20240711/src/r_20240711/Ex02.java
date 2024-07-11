package r_20240711;

public class Ex02 {

	public static void main(String[] args) {
		// 변수:한번에 하나의 값을 저장한다.
		int i = 10;
		i = 20;
		System.out.println(i);
		int i0 = 10;
		int i1 = 20;
		// 배열 : 하나의 변수에 여러개 값을 저장하도록 만든 것
		int y [] = {10,20,30,40};
		//    [10][20][30][40]
		//  y   0   1   2   3 
		System.out.println(y[0]);
		System.out.println(y[1]);
		y[0] = 100;
		System.out.println(y[0]);
		// 배열을 선언하는 방법
		// 1. 배열 선언과 초기화
		int j [] = {10,11,12,13};
		System.out.println(j[0]);
		j[1] = 100;
		System.out.println(j[1]);
		//2. 배열 선언과 초기화
		int j1 [] = new int[] {10,11,12,13};
		System.out.println(j1[0]);
		j1[1] = 100;
		System.out.println(j1[1]);
		//3.
		int [] j2 = new int[4];
		System.out.println(j2[0]);
		// j2 [0][0][0][0]
		j2[0] = 10;
		j2[1] = 20;
		j2[2] = 30;
		j2[3] = 40;
		//  index : 배열의 저장공간의 번호, 0번부터 시작한다.
		System.out.println(j2[0]);
		System.out.println(j2[1]);
		System.out.println(j2[2]);
		System.out.println(j2[3]);
		for(int idx = 0; idx <= 3 ; idx++) {
			System.out.println(j2[idx]);
		}
		// for_each
		for(int z : j2) {
			System.out.println(z);
		}
	}

}
