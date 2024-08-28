package bank;

import java.util.List;

import bank.model.AccountDTO;
import bank.service.ListService;
import bank.service.WriteService;
import bank.view.AccountCreate;
import bank.view.AccountList;
import bank.view.MainPage;

public class FrontController {
	public static void main(String[] args) {
		boolean run = true;
		int num = 0;
		Request request = new Request();
		MainPage mainPage = new MainPage();
		while(run) {
			if(num == 0) {
				num = mainPage.mainView();
			}else if(num == 1) {
				AccountCreate createAccount = new AccountCreate();
				request = createAccount.request();
				num = request.getNum();
			}else if(num == 6) {
				WriteService action = new WriteService();
				action.execute(request);
				num = 0;
			}else if(num == 2) {
				ListService action = new ListService();
				List<AccountDTO> list = action.execute();
				AccountList accountList = new AccountList();
				accountList.accouns(list);
				num = 0;
			}else if(num == 3){
				
			}else if(num == 4) {	
				
			}else  if(num == 5) {
				System.out.println("프로그램이 종료되었습니다.");
				run = false;
			}
				
		}
		
	}
}
