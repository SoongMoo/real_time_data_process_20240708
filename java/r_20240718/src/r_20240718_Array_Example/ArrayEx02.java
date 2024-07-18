package r_20240718_Array_Example;

import java.util.Scanner;

public class ArrayEx02 {
	public static void main(String[] args) {
		/*
		 * 사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고 
		 * 1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
		 */
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i []  = new int[num];
		for(int idx = 0; idx < i.length ; idx++) {
			i[idx] = idx + 1;
		}
		for(int val : i) {
			System.out.println(val);
		}
	}
}
