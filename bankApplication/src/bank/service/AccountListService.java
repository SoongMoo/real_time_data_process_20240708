package bank.service;

import java.util.List;

import bank.model.AccountDAO;
import bank.model.AccountDTO;

public class AccountListService {
	public List<AccountDTO> execute() {
		AccountDAO dao = new AccountDAO();
		List<AccountDTO> list  = dao.accountAll();
		return list;
	}
}
