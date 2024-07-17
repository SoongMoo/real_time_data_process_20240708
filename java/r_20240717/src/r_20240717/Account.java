package r_20240717;

public class Account {
	int accountNo;
	String owner;
	int balance;
	public Account(int accountNo, String owner,int balance) {
		this.accountNo = accountNo;
		this.owner = owner;
		this.balance = balance;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public String getOwner() {
		return owner;
	}
	public int getBalance() {
		return balance;
	}
}
