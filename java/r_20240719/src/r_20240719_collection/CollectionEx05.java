package r_20240719_collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionEx05 {
	public static void main(String[] args) {
		new Book("태백산맥", "이숭무").getAuthor();
		// 선언
		List<Book> list = new ArrayList<Book>();
		// 저장
		list.add(new Book("태백산맥", "이숭무"));   //  0
		list.add(new Book("무궁화꽃이 피었습니다.","이상범")); //1
		//수정
		list.set(0, new Book("산우림","이장범"));
		//출력
		System.out.println(list.get(1).getAuthor());
		Book book = list.get(1);
		System.out.println(book.getAuthor());
		System.out.println(list.get(1).getAuthor());
		// 모두출력
		System.out.println(list);
		// 크기
		System.out.println(list.size());
		// 삭제
		list.remove(0);
		for(int idx = 0; idx < list.size(); idx++) {
			if(list.get(idx).getAuthor() == "이숭무") {
				list.remove(idx); break;
			}
		}
		//반복문
		for(Book b : list) {
			b.print();
		}
		// 모두 삭제
		list.clear();
	}
}