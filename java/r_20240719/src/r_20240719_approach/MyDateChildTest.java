package r_20240719_approach;

public class MyDateChildTest {

	public static void main(String[] args) {
		MyDateChild my = new MyDateChild();
		my.setDay(10);
		System.out.println(my.getDay());
		my.month = 10; // prodected
		System.out.println(my.month);
		my.year = 2004; // default
	}

}
