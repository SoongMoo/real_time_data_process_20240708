package r_20240716;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("고객수를 입력하시오. ");
		// 0. 고객수
		int ownerNum = sc.nextInt();
		Ex13_Account account [] = new Ex13_Account[ownerNum];
		// 1.계좌 생성
		account[Ex13_Account.idx++] = new  Ex13_Account(100000, "이숭무", 100);
		// 3. 입금
		System.out.print("입금 금액을 입력하시오. : ");
		int money = sc.nextInt();
		account[0].balance += money;
		// 4.출금
		System.out.print("출금 금액을 입력하시오. : ");
		money = sc.nextInt();
		account[0].balance -= money;
		// 2.계좌출력
		for(Ex13_Account obj : account) {
			if(obj == null) break;
			obj.print();
		}	
	}
}
