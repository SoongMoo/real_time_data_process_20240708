package r_20240710;

public class Ex08 {
	public static void main(String[] args) {
		// 반복문 : for, while
		//       : 반복문하고 싶은 명령문을 반복하고자 할 때 사용
		System.out.println("나무를 1번 찍었습니다.");
		System.out.println("나무를 2번 찍었습니다.");
		System.out.println("나무를 3번 찍었습니다.");
		System.out.println("나무를 4번 찍었습니다.");
		System.out.println("나무를 5번 찍었습니다.");
		System.out.println("나무를 6번 찍었습니다.");
		System.out.println("나무를 7번 찍었습니다.");
		System.out.println("나무를 8번 찍었습니다.");
		System.out.println("나무를 9번 찍었습니다.");
		System.out.println("나무를 10번 찍었습니다.");
		System.out.println("나무가 넘어갑니다.");
		int i = 1;
		for(int start = 1; start <= 10; start++) {
			System.out.println("나무를 "+ i +"번 찍었습니다.");
			i++;
		}
		for(int start = 1; start <= 10; start++) {
			System.out.println("나무를 "+ start +"번 찍었습니다.");
		}
		i = 1;
		for(int start = 0 ; start <= 9; start++) {
			System.out.println("나무를 "+ i +"번 찍었습니다.");
			i++;
		}
		for(int start = 0, y = 1 ; start <= 9 && y <= 9 ; start++, y++) {
			System.out.println("나무를 "+ y +"번 찍었습니다.");
		}
		//System.out.println(y);
	}
}
