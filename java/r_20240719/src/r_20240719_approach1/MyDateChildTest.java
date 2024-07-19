package r_20240719_approach1;

public class MyDateChildTest {

	public static void main(String[] args) {
		MyDateChild my = new MyDateChild();
		// 다른 패키지에 있는 prodected멤버는 직접 접근을 할 수 없다.
		// my.month= 10;
		my.setDay(10);
		

	}

}
