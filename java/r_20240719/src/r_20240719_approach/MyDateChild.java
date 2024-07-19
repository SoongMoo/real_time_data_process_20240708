package r_20240719_approach;

public class MyDateChild extends MyDate {
	/*
	 * day는 private이기 때문에 상속이 되지 않는다.
	public void setDay(int day) {
		this.day = day;
	}
	*/
	// protected int month
	public void setMonth(int month) {
		this.month = month;
	}	
}
