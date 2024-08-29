package bank.view;

import java.util.List;

import bank.model.AccountDTO;

public class AccountListView {
	public void view(List<AccountDTO> list) {
		System.out.println("-------");
 		System.out.println("계좌 목록");
 		System.out.println("-------");
 		System.out.println("계좌번호 \t 계좌주 \t 잔액 \t");
 		for( AccountDTO acc  : list) {
 			System.out.print(acc.getAccountNo() + "\t");
 			System.out.print(acc.getOwner() + "\t");
 			System.out.print(acc.getBalance() + "\t");
 			System.out.println();
 		}
	}
}
