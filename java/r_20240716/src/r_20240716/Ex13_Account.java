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
		System.out.print(accountNo + "\t");
		System.out.print(owner + "\t");
		System.out.print(balance + "\t");
		
	}
	public static int getIdx() {
		return idx;
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
	public static void setIdx(int idx) {
		Ex13_Account.idx = idx;
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
	
	
}
