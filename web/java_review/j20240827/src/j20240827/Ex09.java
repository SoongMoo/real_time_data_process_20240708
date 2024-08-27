package j20240827;

public class Ex09 {

	public static void main(String[] args) {
		// 빈복문 : 
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
		int j = 1;
		for(int i = 0; i <= 9; i++) {
			System.out.println("나무를 "+j+"번 찍었습니다.");
			j++;
		}
		// 구구단
		/*
		6 * 1 = 6
		6 * 2 = 12
		...
		6 * 9 = 54
		*/
		for(int i = 1; i <= 9; i++) {
			System.out.println("6 * " + i + " = " + 6 * i);
		}
		// while
		int i = 1;
		while(i <= 9) {
			System.out.println("6 * " + i + " = " + 6 * i);
			i++;
		}
		// 2 ~ 9단까지 1 ~ 9곱까지 출력
		for(int dan = 2 ; dan <= 9; dan ++) {
			for(int gop = 1; gop <= 9; gop ++) {
				System.out.println(dan + " * " + gop + " = " + dan * gop);
			}
		}
		int dan = 2;
		while(dan <= 9) {
			int gop = 1;
			while(gop <= 9) {
				System.out.println(dan + " * " + gop + " = " + dan * gop);
				gop ++;
			}
			dan++;
		}
	}

}









