package r_20240719_collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionEx06 {
	public static void main(String[] args) {
		Object obj = 10;
		System.out.println(obj);
		obj = "이숭무";
		System.out.println(obj);
		obj = new Book("산울림", "이숭무");
		System.out.println(((Book)obj).getAuthor());
		
		List<Object> list = new ArrayList<Object>();
		list.add(10);
		list.add("이숭무");
		list.add(new Book("산울림", "이숭무"));
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(((Book)list.get(2)).getAuthor());
		System.out.println("==============");
		List list1 = new ArrayList();
		list1.add(10);
		list1.add("이숭무");
		list1.add(new Book("산울림", "이숭무"));
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		System.out.println(((Book)list.get(2)).getAuthor());
	}
}


