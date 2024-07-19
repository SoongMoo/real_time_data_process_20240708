package r_20240719_collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionEx02 {

	public static void main(String[] args) {
		// 선언
		List<String> list = new ArrayList<String>();
		// 저장
		list.add("이숭무"); // 0
		list.add("이상범"); // 1
		list.add("이장범"); // 2
		list.add("이장범"); // 3
		//수정
		list.set(2, "김찬중");
		// 출력
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		// 모두출력
		System.out.println(list);
		// 크기
		System.out.println(list.size());
		// 삭제
		list.remove(0); // index로 삭제
		list.remove("이상범"); // object로 삭제
		// 모두 삭제
		list.clear();
		// 문자열로 변환
		String str = list.toString();
		System.out.println(str); // "[이숭무, 이상범, 김찬중, 이장범]"
		// 반복문 
		for(int i = 0; i < list.size() ; i++) {
			System.out.println(list.get(i));
		}
		for(String s : list) {
			System.out.println(s);
		}
	}
	
	
	
	
	

}
