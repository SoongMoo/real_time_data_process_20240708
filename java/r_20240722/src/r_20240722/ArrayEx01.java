package r_20240722;

public class ArrayEx01 {
	public static void main(String [] args) {
		// 변수 : 하나의 값을 저장 한다.
		// 배열 : 하나의 이상의 값을 저장 할 수 있다.
		//      단점:  하나의 타입만 저장 할 수 있다
		//            크기가 정해져 있다.
		// class : 여러개의 타입을 저장 : 
		// 
		String str1 = "이숭무";
		String str2 = "이상범";
		String str3 = "이장범"; //           0 1 2
		String [] str = new String [3]; // [][][]
		// index : 배열에 있는 요소가 가지는 고유의 번호 : 0부터
		str[0] = "이숭무";                // [이숭무][][]
		str[1] = "이상범";                // [이숭무][이상범][]
		str[2] = "이장범";                // [이숭무][이상범][이장범]
		System.out.println(str1);
		System.out.println(str[0]);
		// 배열의 크기 : 요소의 갯수
		System.out.println(str.length);
		// 배열안에 있는 요소의 값 출력 : foreach
		for(String s : str) {
			System.out.println(s);
		}
		for(int i = 0; i < str.length ; i++) {
			System.out.println(str[i]); // i : 0, 1, 2
		}
	}
}
