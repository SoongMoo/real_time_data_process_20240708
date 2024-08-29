package bank.Front;

import java.util.List;

import bank.Request;
import bank.model.AccountDTO;
import bank.service.AccountListService;
import bank.service.AccountService;
import bank.service.AccountWriteService;
import bank.service.DepositService;
import bank.view.AccountCreate;
import bank.view.AccountDepositView;
import bank.view.AccountListView;
import bank.view.DepositView;
import bank.view.MainPage;

public class FrontController {
	public static void main(String [] args) {
		int pageNum = 0; // 메인 페이지 
		boolean run = true;
		Request request = null;
		while(run) {
			if(pageNum == 0) { 
				MainPage mainView = new MainPage();
				request = mainView.view();
				pageNum = request.getPageNum(); // 1
			}else if(pageNum == 1) {
				// 계좌 정보 입력
				AccountCreate accountCreate = new AccountCreate();
				request = accountCreate.view();
				pageNum = request.getPageNum();  // 6 
			}else if(pageNum == 6) {
				// 계좌 생성을 하는 페이지
				AccountWriteService action = new AccountWriteService();
				action.execute(request); // 호출메서드
				pageNum = 0;
			}else if(pageNum == 2) {
				// 계좌목록
				AccountListService action = new AccountListService(); 
				List<AccountDTO> list = action.execute();
				/// 출력
				AccountListView accountListView = new AccountListView();
				accountListView.view(list);
				pageNum = 0;
			}else if(pageNum == 3) {
				// 입금
				DepositView depositView = new DepositView();
				request = depositView.view();
		 		pageNum = request.getPageNum();			
			}else if(pageNum == 7) {
				// 계좌번호에 해당되는 계좌정보 
				AccountService action = new AccountService();
				AccountDTO dto = action.execute(request);
				AccountDepositView accountDepositView = new AccountDepositView();
				request = accountDepositView.view(dto);
				pageNum = request.getPageNum();
			}else if(pageNum == 8) {
				DepositService action = new DepositService();
				action.execute(request);
				pageNum = 0;
			}else if(pageNum == 4) {
				//출금
				System.out.println("출금");
				
			}else if(pageNum == 5) {
				run = false;
				System.out.println("프로그램이 종료 되었습니다.");
			}
		}
	}
	
}



