package bank.service;

import bank.Request;
import bank.model.AccountDAO;
import bank.model.AccountDTO;

public class DepositService {
	public void execute(Request request) {
		AccountDTO dto = new AccountDTO();
		dto.setAccountNo(request.getAccountNo());
		dto.setBalance(request.getBalance());
		AccountDAO dao = new AccountDAO();
		dao.depositUpdate(dto);
	}
}
