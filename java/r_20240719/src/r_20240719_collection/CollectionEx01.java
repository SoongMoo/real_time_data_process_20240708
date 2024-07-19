package r_20240719_collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionEx01 {
	public static void main(String[] args) {
		// 변수 단점 : 하나의 값만 저장
		// 배열 장점 : 하나이상의 값을 저장
		//     단점 : 크기를 변경할 수 없다.
		//           하나의 타입만 가능하다.
		// Collection 장점 : 크기가 유동적이다.
		//            단점 : 하나의 타입만 가능하다.
		// list , set
		int i [] = new int[4];
		String str[] = new String[3];
		str[0] = "이숭무";
		str[1] = "이장범";
		str[2] = "이장범";
		System.out.println(str.length);
		List<String> list = new ArrayList<String>();
		list.add("이숭무"); // 0
		list.add("이상범"); // 1
 		list.add("이장범"); // 2
 		list.add("이장범"); // 3
 		// 데이터의 중복을 허용한다.
		System.out.println(list.size());
		for(String val :str ) {
			System.out.println(val);
		}
		for(String val : list) {
			System.out.println(val);
		}
		System.out.println(str[1]);
		System.out.println(list.get(1));
		list.remove(0);
		System.out.println(list.size());
		list.remove("이장범"); // 하나만 삭제
		System.out.println(list.size());
		for(String val : list) {
			System.out.println(val);
		}
	}
}