package r_20240710;

public class Ex16 {

	public static void main(String[] args) {
		// 5단
		for(int gop = 1; gop <= 9; gop ++) {
			System.out.println("5 * " + gop + " = " + 5 * gop);
		}
		// while
		int gop = 1;
		while(gop <= 9) {
			System.out.println("5 * " + gop + " = " + 5 * gop);
			gop++;
		}
	}
}
