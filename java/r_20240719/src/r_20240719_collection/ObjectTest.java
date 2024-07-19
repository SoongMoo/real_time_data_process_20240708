package r_20240719_collection;

public class ObjectTest {

	public static void main(String[] args) {
		Book book = new Book("산울림", "이숭무");
		book.getAuthor();
		// 일회성
		new Book("산울림", "이숭무").getAuthor();
	}

}
