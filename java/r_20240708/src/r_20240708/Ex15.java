package r_20240708;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		/// Scanner를 이용해서 변수 kor, eng, mat에 값을 입력 받자
		Scanner sc = new Scanner(System.in); 
		System.out.print("국어점수를 입력하시오 : ");
		int kor = sc.nextInt();
		System.out.print("수학점수를 입력하시오 : ");
		int mat = sc.nextInt();
		System.out.print("영어점수를 입력하시오 : ");
		int eng = sc.nextInt();
		// 각 과목이 40점이상이어야 하고
		// 평균이 60점 이상이어야 합격이다.
		if(mat >= 40 && kor >= 40 && eng >= 40 && 
				(mat+kor+eng)/3 >= 60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
	}

}
