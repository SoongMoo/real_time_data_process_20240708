package bank;
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
	
	Integer pageNum;
}
