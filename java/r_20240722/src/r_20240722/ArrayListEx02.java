package r_20240722;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx02 {
	public static void main(String[] args) {
		// 1. 선언
		List<String> list = new ArrayList<String>();
		// 2.  저장
		list.add("이숭무"); // 0
		list.add("이상범"); // 1
		list.add("이장범"); // 2
		list.add("김찬중"); // 3
		//3. 출력
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		// 4. 수정
		list.set(2, "이상희");
		System.out.println(list.get(2));
		// 5. 크기
		System.out.println(list.size());
		// 6. 삭제
		list.remove("이상범");
		System.out.println(list.size());
		// 7. pop : 값을 반환받으면서 삭제 
		String pop = list.remove(0); //index를 이용
		System.out.println(pop);
		System.out.println(list.size());
		// 8. 모두출력
		System.out.println(list); // [이상희, 김찬중]
		for(String s : list) {
			System.out.println(s);
		}
		for(int idx = 0; idx < list.size(); idx++) {
			System.out.println(list.get(idx));
		}
		// 9. 문자열 변환
		String result = list.toString(); // "[이상희, 김찬중]"
		System.out.println(result); 
		// 10. 모두 삭제
		list.clear();
	}

}
