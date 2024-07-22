package r_20240722;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankAccount {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		List<Account> account = new ArrayList<Account>(); // 크기가 유동적
		//Account account [] = new Account[10];
		while(run) {
			System.out.println("-----------------------------------------------");
		 	System.out.println("1.계좌생성 | 2.계좌목록 | 3.입금 | 4.출금 | 5.종료");
		 	System.out.println("-----------------------------------------------");
		 	int num = Integer.parseInt(scanner.nextLine());
		 	switch(num) {
		 	case 1 : 
		 		System.out.println("--------");
		 		System.out.println("계좌 생성");
		 		System.out.println("--------");
		 		System.out.print("계좌번호 : ");
		 		int accNo = Integer.parseInt(scanner.nextLine());
		 		System.out.print("계좌주 : ");
		 		String owner = scanner.nextLine();
		 		System.out.print("초기 입금액 : ");
		 		int money = Integer.parseInt(scanner.nextLine());
		 		account.add(new Account(accNo,owner,money));
		 		//account[0] = new Account(accNo, owner, balance);
		 		System.out.println("계좌가 생성되었습니다.");
		 		break;
		 	case 2 : 
		 		System.out.println("-------");
		 		System.out.println("계좌 목록");
		 		System.out.println("-------");
		 		for(Account acc : account ) {
		 			//if(acc == null)break;
		 			System.out.print(acc.getAccountNo() + "\t");
		 			System.out.print(acc.getOwner() + "\t");
		 			System.out.print(acc.getBalance() + "\t");
		 		}
		 		break;
		 	case 3 : 
		 		System.out.println("-------");
		 		System.out.println("입금");
		 		System.out.println("-------");
		 		System.out.print("계좌 번호 : ");
		 		accNo = Integer.parseInt(scanner.nextLine());
		 		boolean noAccNum = true;
		 		for(Account acc : account) {
		 			if(acc.getAccountNo() == accNo) {
		 				System.out.print("입금액 : ");
		 				money = Integer.parseInt(scanner.nextLine());
		 				acc.deposit(money);
		 				noAccNum = false;
		 				break;
		 			}
		 		}
		 		if(noAccNum == true)System.out.println("해당 계좌번호가 없습니다.");
		 		break;
		 	case 4 : 
		 		System.out.println("-------");
		 		System.out.println("출금");
		 		System.out.println("-------");
		 		System.out.print("계좌 번호 : ");
		 		accNo = Integer.parseInt(scanner.nextLine());
		 		noAccNum = true;
		 		for(Account acc : account) {
		 			if(acc.getAccountNo() == accNo) {
		 				System.out.print("출금액 : ");
		 				money = Integer.parseInt(scanner.nextLine());
		 				acc.withdraw(money);
		 				noAccNum = false;
		 				break;
		 			}
		 		}
		 		if(noAccNum == true)System.out.println("해당 계좌번호가 없습니다.");
		 		break;
		 	case 5 : run = false; System.out.println("프로그램 종료");break;
		 	default: System.out.println("입력 번호가 틀렸습니다.");	
		 	}
		}
		
	}
}
