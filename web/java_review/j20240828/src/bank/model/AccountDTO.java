package bank.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor // 생성자
@NoArgsConstructor  // default 생성자
public class AccountDTO {
	int accountNo;
	String owner;
	int balance;
}
