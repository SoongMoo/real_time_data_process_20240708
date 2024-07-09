package r_20240708;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		System.out.println(10 + 5);
		int i , j ;
		i = 10;
		j = 5;
		System.out.println(i + j);
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요. : ");
		int num1 = sc.nextInt();
		// System.out.println("num1" + num1);
		System.out.print("숫자를 입력해주세요. : ");
		int num2 = sc.nextInt();
		System.out.println("num1 + num2 = " + num1 + num2);
	}
}
