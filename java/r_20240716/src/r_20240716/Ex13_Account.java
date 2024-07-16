package r_20240716;

public class Ex13_Account {
	static int idx = 0;
	int accountNo;
	String owner;
	int balance = 0;
	
	public Ex13_Account(int accountNo, String owner, int balance) {
		this.accountNo = accountNo;
		this.owner = owner;
		this.balance = balance;
	}
	public void print() {
		System.out.println(accountNo);
		System.out.println(owner);
		System.out.println(balance);
	}
	
}
