package r_20240710;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		// 1 ~ 100가지의 합을 구하는 while문을 만드시오.
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.print("시작 숫자를 입력하세요. : ");
		int i = sc.nextInt();
		System.out.print("마지막 숫자를 입력해주세요. : ");
		int end = sc.nextInt();
		while(i <= end) {
			// sum = sum + i;
			sum += i;
			i++;
		}
		System.out.println(sum);
	}
}
