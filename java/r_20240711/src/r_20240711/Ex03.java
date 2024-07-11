package r_20240711;

public class Ex03 {

	public static void main(String[] args) {
		//배열 선언법
		//1.
		double d[] = {10.0 ,20.0,30.0,40.0};
		for(double z : d) {
			System.out.println(z);
		}
		System.out.println(d[0]);
		System.out.println(d[1]);
		//2.
		double [] d1 = new double[] {10.0 ,20.0,30.0,40.0};
		//3. 
		double d2 [] = new double[4]; // [크기]
		// 			[0.0][0.0][0.0][0.0]
		for(double z : d2) {
			System.out.println(z);
		}
		System.out.println("배열의 크기 : " + d2.length);
		for(int idx = 0; idx < d2.length; idx++) {
			d2[idx] = idx + 1;
		}
		for(int idx = 0; idx <= d2.length -1 ; idx++) {
			d2[idx] = idx + 10;
		}
		for(double z : d2) {
			System.out.println(z);
		}

	}

}
