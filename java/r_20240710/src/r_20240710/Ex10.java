package r_20240710;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 단을 입력하세요 : ");
		int dan = sc.nextInt();
		System.out.print("시작 곱을 입력하세요 : ");
		int startGop = sc.nextInt();
		System.out.print("마지막 곱을 입력하세요. :");
		int endGop = sc.nextInt();
		for(int gop = startGop; gop <= endGop ; gop ++) {
			System.out.println(dan + " * " + gop + " = " + dan * gop);
		}
	}
}
