package r_20240719_collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionEx04 {
	public static void main(String [] args) {
		int i1 = 10;
		int i2 = 20;
		int i [] = new int[2];
		i[0] = 10;
		i[1] = 20;
		Book b1 = new Book("태백산맥","이숭무");
		Book b2 = new Book("무궁화꽃이 피었습니다.","이상범");
		Book b[] = new Book[2];
		b[0] = new Book("태백산맥","이숭무");
		b[1] = new Book("무궁화꽃이 피었습니다.","이상범");
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		List<Book> list1 = new ArrayList<Book>();
		list1.add(new Book("태백산맥","이숭무"));
		list1.add(new Book("무궁화꽃이 피었습니다.","이상범"));
		b[0].getAuthor();
		list1.get(0).getAuthor() ;
	}
}





