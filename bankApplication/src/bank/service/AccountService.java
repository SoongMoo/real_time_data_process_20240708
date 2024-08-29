package bank.service;

import bank.Request;
import bank.model.AccountDAO;
import bank.model.AccountDTO;

public class AccountService {
	public AccountDTO execute(Request request) {
		AccountDAO dao = new AccountDAO();
		AccountDTO dto = dao.accountOne(request.getAccountNo());
		return dto;
	}
}
