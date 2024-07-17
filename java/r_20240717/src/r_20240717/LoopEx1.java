package r_20240717;

public class LoopEx1 {

	public static void main(String[] args) {
		System.out.println("나무를 1번찍었습니다.");
		//...
		System.out.println("나무를 10번찍었습니다.");
		// int i 는 반복을 시작하는 변수
		int start = 1;
		for(int i = 0; i < 10 ; i++) { 
			System.out.println("나무를 " + start + "번찍었습니다.");
			start++;
		}
		// 반복 초기값
		int i = 0;
		start = 1;
		while(i < 10) { // 반복 조건
			System.out.println("나무를 " + start + "번찍었습니다.");
			i++;
			start++;
		}
		// 6 * 1 = (6 * 1);
		// 6 * 2 = (6 * 2);
		//...
		// 6 * 9 = (6 * 9);
		System.out.println("6 * 1 = (6 * 1)");
		//...
		System.out.println("6 * 9 = (6 * 9)");
		for(int j = 1; j <= 9; j++) {
			System.out.println("6 * "+ j +" = "+ 6 * j);
		}
		// 1 ~ 5의 합을 구하시오.
		int sum = 0;
		int y = 1;
		sum = sum + y;y++; 
		sum = sum + y;y++; 
		sum = sum + y;y++; 
		sum = sum + y;y++; 
		sum = sum + y;y++; 
		System.out.println(sum);
		sum = 0;
		for(  y = 1 ; y <= 5 ; y++) {
			sum = sum + y;
		}
		System.out.println(sum);
	}
}
