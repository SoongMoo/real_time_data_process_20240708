package r_20240710;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("시작 수를 입력하세요. : ");
		int start = sc.nextInt();
		System.out.print("마지막 수를 입력하세요. : ");
		int end = sc.nextInt();
		int sum = 0;
		for(int y = start; y <= end ; y++) {
			sum = sum + y;
		}
		System.out.println(sum);
	}
}
