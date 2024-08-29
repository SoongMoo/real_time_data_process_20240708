package bank.view;

import java.util.Scanner;

import bank.Request;

public class DepositView {
	Scanner scanner = new Scanner(System.in);
	public Request view() {
		System.out.println("-------");
 		System.out.println("입금");
 		System.out.println("-------");
 		System.out.print("계좌번호 : ");
 		int accNo = Integer.parseInt(scanner.nextLine());
 		Request request = new Request();
 		request.setAccountNo(accNo);
 		request.setPageNum(7);
 		return request;
	}
}
