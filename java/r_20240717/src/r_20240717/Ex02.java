package r_20240717;

import java.util.Scanner;

public class Ex02 {
	public static void main() {
		int idx = 0;
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		System.out.print("고객수를 지정해주세요 : ");
		Account account [] = new Account[scanner.nextInt()]; //[객체][객체][null][null]
		while(run) {
			System.out.println("-----------------------------------------------");
		 	System.out.println("1.계좌생성 | 2.계좌목록 | 3.입금 | 4.출금 | 5.종료");
		 	System.out.println("-----------------------------------------------");
		 	System.out.print("선택> ");
		 	int num = Integer.parseInt(scanner.nextLine()); // 문자열 --> 정수
		 	switch(num) {
		 	case 1: 
		 		System.out.println("-------");
		 		System.out.println("계좌 생성");
		 		System.out.println("-------");
		 		System.out.print("계좌번호 : ");
		 		int accNo = Integer.parseInt(scanner.nextLine()); 
		 		System.out.print("계좌주 : ");
		 		String owner = scanner.nextLine();
		 		System.out.print("초기입금액 : ");
		 		int balance = Integer.parseInt(scanner.nextLine()); 
		 		account[idx++] = new Account(accNo, owner, balance);
		 		break;
		 	case 2: 
		 		System.out.println("-------");
		 		System.out.println("계좌 목록");
		 		System.out.println("-------");
		 		for(Account  acc :  account) {
		 			if(acc == null)break;
		 			System.out.print(acc.getAccountNo() + "\t");
		 			System.out.print(acc.getOwner() + "\t");
		 			System.out.print(acc.getBalance() + "\n");
		 		}
		 		break;
		 	case 3: break;
		 	case 4: break;
		 	case 5: run = false; System.out.println("프로그램 종료");
		 	}
		}
	}
}
