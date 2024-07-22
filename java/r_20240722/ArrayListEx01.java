package r_20240722;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx01 {
	public static void main(String[] args) {
		// 변수 : 하나의 값만 저장 
		// 배열 : 하나 이상의 값을 저장
		//       크기가 고정
		// 컬렉션 : 하나의 이상의 값을 저장
		//       크기가 유동적 : list(ArrayList), set
		//                    [][][][][][][]
		int i [] = new int[2];
		i[0] = 10; 
		i[1] = 20;
		//ArrayIndexOutOfBoundsException
		//i[2] = 30;
		//1. 리스트 선언
		List<Integer> list = new ArrayList<Integer>();
		//2. 저장
		list.add(10); // 0 :index
		list.add(20); // 1
		list.add(30); // 2
		list.add(30); // 3
		//3. 수정
		list.set(1, 2000);
		//4. 출력
		System.out.println(list.get(1));
		System.out.println(list.get(3));
		//5. 모두 출력
		System.out.println(list);
		//6. 크기
		System.out.println(list.size());
		//7.요소 삭제 : 요소의 값이 정수인 경우엔 요소의 값으로 삭제 할 수 없다.
		//list.remove(2000); // 삭제되면 리스트의 크기가 줄어든다.
		//8. 요소의 값을 받아오면서 삭제
		int pop = list.remove(0); // index를 사용
		System.out.println(pop);
		//9. 모두 삭제
		list.clear();
		System.out.println(list.size());
	}
}
