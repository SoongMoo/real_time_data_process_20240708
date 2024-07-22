package r_20240722_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import r_20240722.Account;

public class BankAccountMap {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		//Account account [] = new Account[10];
		//List<Account> account = new ArrayList<Account>();
		Map<Integer, Account> account = new HashMap<Integer, Account>();
		boolean run = true;
		while(run) {
			System.out.println("-----------------------------------------------");
		 	System.out.println("1.계좌생성 | 2.계좌목록 | 3.입금 | 4.출금 | 5.종료");
		 	System.out.println("-----------------------------------------------");
		 	String num = scanner.nextLine();
		 	switch(num){
		 	case "1": 
		 		System.out.println("--------");
		 		System.out.println("계좌 생성");
		 		System.out.println("--------");
		 		System.out.print("계좌번호 : ");
		 		int accNo = Integer.parseInt(scanner.nextLine());
		 		System.out.print("계좌주 : ");
		 		String owner = scanner.nextLine();
		 		System.out.print("초기 입금액 : ");
		 		int money = Integer.parseInt(scanner.nextLine());
		 		account.put(accNo, new Account(accNo,owner,money));
		 		//account[0] = new Account(accNo, owner, balance);
		 		//account.add(new Account(accNo,owner,money));
		 		break;
		 	case "2": 
		 		System.out.println("-------");
		 		System.out.println("계좌 목록");
		 		System.out.println("-------");
		 		// 모든 키 받아오기 account.keySet()
		 		for(Integer key : account.keySet()) {
		 			Account acc = account.get(key);
		 			System.out.print(acc.getAccountNo() + "\t");
		 			System.out.print(acc.getOwner() + "\t");
		 			System.out.print(acc.getBalance() + "\t");
		 		}
		 		break;
		 	case "3": 
		 		System.out.println("-------");
		 		System.out.println("입금");
		 		System.out.println("-------");
		 		System.out.print("계좌 번호 : ");
		 		int key = Integer.parseInt(scanner.nextLine());
		 		if(account.get(key) != null) {
		 			Account acc = account.get(key);
		 			System.out.print("입금액 : ");
		 			money = Integer.parseInt(scanner.nextLine());
		 			acc.deposit(money);
		 		}else {
		 			System.out.println("해당계좌가 존재하지 않습니다.");
		 		}
		 		break;
		 	case "4": 
		 		System.out.println("-------");
		 		System.out.println("출금");
		 		System.out.println("-------");
		 		System.out.print("계좌 번호 : ");
		 		key = Integer.parseInt(scanner.nextLine());
		 		if(account.get(key) != null) {
		 			Account acc = account.get(key);
		 			System.out.print("출금액 : ");
		 			money = Integer.parseInt(scanner.nextLine());
		 			acc.withdraw(money);
		 		}else {
		 			System.out.println("해당계좌가 존재하지 않습니다.");
		 		}
		 		break;
		 	case "5": run = false; System.out.println("프로그램 종료");break;
		 	default: System.out.println("입력 번호가 틀렸습니다.");	
		 	}
		 	
		}
	}
}
/// 배열 / Collection(List, set) / Map(HashMap)
