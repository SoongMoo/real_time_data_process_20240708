package r_20240711;

public class Ex20 {
	public static void main(String[] args) {
		int i = 10;
		int j = i;
		int i1[] = {1,2,3,4,5};
		int i2[] = i1;
		System.out.println(i1[2]);
		System.out.println(i2[2]);
		i2[2] = 100;
		System.out.println(i1[2]);
		System.out.println(i2[2]);
		
		int i3[] = new int[5]; // 배열을 생성 후 
		System.arraycopy(i1, 0, i3, 0, i1.length);
		System.out.println(i1[2]);
		System.out.println(i3[2]);
		i2[2] = 10000;
		System.out.println(i1[2]);
		System.out.println(i3[2]);
	}
}