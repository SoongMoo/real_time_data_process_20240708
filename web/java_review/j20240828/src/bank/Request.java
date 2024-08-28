package bank;

import java.util.List;

import bank.model.AccountDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Request {
	int accountNo;
	String owner;
	int balance;
	int num;
}
