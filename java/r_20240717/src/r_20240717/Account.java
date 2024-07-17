package r_20240717;

public class Account {
	static int idx; //클래스변수 , 정적변수
	final double PI = 3.141592;
	int accountNo;
	String owner;
	int balance;
	static {
		idx = 0;
	}
	public Account() {}
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
	public void deposit(int money) {
		balance += money;
	}
	public void withdraw(int money) {
		balance -= money;
	}
}
