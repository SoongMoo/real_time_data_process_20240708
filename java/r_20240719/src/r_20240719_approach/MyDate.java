package r_20240719_approach;

public class MyDate {
	private int day; // private 상속이 안된다.
	protected int month;
	int year; // default
	// 접근할 수 없는 멤버를 사용하기 위해서 메서드를 만들어서 사용
	public void setDay(int day) {
		this.day = day;
	}
	public int getDay() {
		return day;
	}
}
