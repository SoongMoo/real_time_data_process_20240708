package r_20240711;

public class Ex04 {

	public static void main(String[] args) {
		String [] str = {"이숭무","이상범","이장범"};
		String [] str1 = new String[] {"이숭무","이상범","이장범"};
		for(String s : str1) {
			System.out.println(s);
		}
		str1[0] = "김찬중";
		str1[1] = "이상희";
		str1[2] = "오연의";
		// str1[3] = "김광식";
		// 배열의 장점 : 하나 이상의 값을 저장할 수 있다.
		// 배열의 단점 : 크기를 변경할 수 없다.
		//             하나의 타입만 저장 가능하다.
		System.out.println(str1.length);
		String [] str2 = new String[3];
		for(String s : str2) {
			System.out.println(s);
		}
		// null : 값은 있는데 어떠한 값인지 모른다.
		str2[0] = "강감찬";
		str2[1] = "이순신";
		str2[2] = "홍길동";
		for(String s : str2) {
			System.out.println(s);
		}
		System.out.println("크기 : " + str2.length);
		//str2[3] = "이숭무";
	}

}
