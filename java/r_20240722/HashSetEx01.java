package r_20240722;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx01 {

	public static void main(String[] args) {
		// list 비슷 : 배열처럼 요소들을 저장
		//            순서 : index
		// set : 집합 : 순서 없다. index(X)
		//             중복데이터를 허용하지 않는다.
		// 1. 선언
		Set<String> set = new HashSet<String>();
		// 2. 저장
		set.add("이숭무");
		set.add("이상범");
		set.add("이장범");
		set.add("이장범");
		//3. 출력
		System.out.println(set);
		for(String s : set) {
			System.out.println(s);
		}
		//4. 크기
		System.out.println(set.size());
		//5. 문자열 변환
		String str = set.toString();
		//6. 데이터 유무
		System.out.println(set.contains("이상범"));
		System.out.println(set.contains("강감찬"));
		//7.삭제
		set.remove("이상범");
		System.out.println(set);
		//8. 모두삭제
		set.clear();
		System.out.println(set.size());
	}
}