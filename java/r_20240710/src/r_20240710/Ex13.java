package r_20240710;

public class Ex13 {
	public static void main(String[] args) {
		// 반복문은 반복하는 명령문을 사용할 때
		// 5단
		for(int gop=1 ; gop <= 9 ; gop++) {
			System.out.println("5 * "+ gop + " = " + 5 * gop);
		}
		//6단
		for(int gop=1 ; gop <= 9 ; gop++) {
			System.out.println("6 * "+ gop + " = " + 6 * gop);
		}
		//7단
		for(int gop=1 ; gop <= 9 ; gop++) {
			System.out.println("7 * "+ gop + " = " + 7 * gop);
		}
		// 2중 반복문
		for(int dan = 5; dan <= 7; dan ++) {
			for(int gop=1 ; gop <= 9 ; gop++) {
				System.out.println(dan + " * "+ gop + " = " + dan * gop);
			}
		}
	}
}
