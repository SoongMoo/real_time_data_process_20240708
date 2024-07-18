package r_20240718_Array_Example;

import java.util.Scanner;

public class ArrayEx07 {

	public static void main(String[] args) {
		/* "양념", "후라이드", "순살"인 문자열 배열에
		 * 사용자가 입력한 값이 배열에 있는지 검색하여 있으면 “OOO 치킨 배달 가능“, 
		 * 없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요. 
		 * 치킨 이름을 입력하세요 : 양념
			양념치킨 배달 가능

			치킨 이름을 입력하세요 : 불닭 
			불닭치킨은 없는 메뉴입니다.
		*/
		 Scanner sc = new Scanner(System.in);
		 String[] arr = {"양념", "후라이드", "순살"};
		 System.out.print("치킨 이름을 입력하세요. : ");
		 String food = sc.nextLine();
		 int num = -1;
		 for(int idx = 0; idx <arr.length; idx++) {
			 if(arr[idx].equals(food)) {
				 num = idx; break;
			 }
		 }
		 if(num == -1) {
			 System.out.println(food + "은(는) 없는 메뉴입니다.");
		 }else {
			 System.out.println(food + "치킨 배달 가능");
		 }
		
	}

}
