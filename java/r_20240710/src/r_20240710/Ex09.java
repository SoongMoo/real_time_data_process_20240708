package r_20240710;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// 5단
		System.out.println("5 * 1 = " + 5 * 1);
		System.out.println("5 * 2 = " + 5 * 2);
		System.out.println("5 * 3 = " + 5 * 3);
		System.out.println("5 * 4 = " + 5 * 4);
		System.out.println("5 * 5 = " + 5 * 5);
		System.out.println("5 * 6 = " + 5 * 6);
		System.out.println("5 * 7 = " + 5 * 7);
		System.out.println("5 * 8 = " + 5 * 8);
		System.out.println("5 * 9 = " + 5 * 9);
		for(int start =0, gop = 1 ; start < 10 && gop<=9  ; start++, gop++ ) {
			System.out.println("5 * "+ gop +" = " + 5 * gop);
		}
		Scanner sc = new Scanner(System.in);
		System.out.print("단을 입력해 주세요 : ");
		int dan = sc.nextInt();
		for(int start =0, gop = 1 ; start < 10 && gop<=9  ; start++, gop++ ) {
			System.out.println(dan +" * "+ gop +" = " + dan * gop);
		}
	}
}
