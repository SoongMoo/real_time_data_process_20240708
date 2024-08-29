package bank.service;

import bank.Request;
import bank.model.AccountDAO;
import bank.model.AccountDTO;

public class AccountWriteService {
	public void execute(Request request) { // 피호출메
		AccountDTO dto = new AccountDTO();
		dto.setAccountNo(request.getAccountNo());
		dto.setOwner(request.getOwner());
		dto.setBalance(request.getBalance());
		AccountDAO dao = new AccountDAO();
		dao.accountInsert(dto);

	}
}
