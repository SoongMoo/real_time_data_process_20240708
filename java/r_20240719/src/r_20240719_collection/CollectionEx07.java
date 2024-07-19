package r_20240719_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionEx07 {
	public static void main(String[] args) {
		// set : 집합 :
		// 1. 순서가 없다
		// 2. 중복을 허용하지 않는다.
		Set<String> set = new HashSet<String>();
		// 저장
		set.add("이숭무");
		set.add("이상범");
		set.add("이장범");
		set.add("이장범");
		//출력
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		for(String s : set) {
			System.out.println(s);
		}
		// 문자열 변환
		System.out.println(set.toString());
		// 데이터 유무
		System.out.println(set.contains("이상범"));
		System.out.println(set.contains("김찬중"));
		// 삭제
		set.remove("이상범");
		for(String s : set) {
			System.out.println(s);
		}
		// 모두 삭제
		set.clear();
	}
}
