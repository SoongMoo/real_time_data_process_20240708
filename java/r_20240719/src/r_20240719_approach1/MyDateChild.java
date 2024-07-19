package r_20240719_approach1;

import r_20240719_approach.MyDate;

public class MyDateChild extends MyDate{
	/*
	public void setDay(int day) {
		this.day = day;
	}
	*/
	// int month
	// prodected 멤버는 다른 패치지내에서도 싱속이 된다.
	public void setMonth(int month) {
		this.month = month;
	}
	// 다른 패키지에서는 default멤버는 상속되지 않는다.
	/*
	public void setYear(int year) {
		this.year = year;
	}
	*/
}
