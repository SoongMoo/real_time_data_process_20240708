package bank.view;

import java.util.List;

import bank.model.AccountDTO;

public class AccountList {
	public void accouns(List<AccountDTO> list) {
		System.out.println("-------");
 		System.out.println("계좌 목록");
 		System.out.println("-------");
 		for(AccountDTO acc : list ) {
 			System.out.print(acc.getAccountNo() + "\t");
 			System.out.print(acc.getOwner() + "\t");
 			System.out.print(acc.getBalance() + "\t");
 			System.out.println();
 		}
	}
}
