package j20240827;

public class Ex11 {

	public static void main(String[] args) {
		// 배열의 선언방법
		int i1[] = {1,2,3,4};
		int i2[] = new int[] {1,2,3,4,};
		int i3[] = new int[3];
		int i4[]; // 선언
		i4 = new int[] {1,2,3,4};
		i4 = new int[4];
		System.out.println(i1[0]);
		i1[0] = 100;
		System.out.println(i1[0]);
	}

}
