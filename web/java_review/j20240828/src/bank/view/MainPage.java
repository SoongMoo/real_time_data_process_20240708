package bank.view;

import java.util.Scanner;

public class MainPage {
	Scanner scanner = new Scanner(System.in);
	public int mainView() {
		System.out.println("-----------------------------------------------");
	 	System.out.println("1.계좌생성 | 2.계좌목록 | 3.입금 | 4.출금 | 5.종료");
	 	System.out.println("-----------------------------------------------");
	 	int num = Integer.parseInt(scanner.nextLine());
	 	return num;
	}
}