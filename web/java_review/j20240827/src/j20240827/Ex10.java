package j20240827;

public class Ex10 {

	public static void main(String[] args) {
		int i0 = 10;
		int i1 = 20;
		int i2 = 30;
		// 배열 : 변수 여러개를 하나로 묶어서 사용할 수 있게
		//       값을 여러개를 저장하기 위한 변수
		int i [] = new int[3]; // [][][] : i
		//                        0 1 2
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		System.out.println(i0 + i[0]);
		System.out.println(i.length); // 배열의 크기
	}

}
