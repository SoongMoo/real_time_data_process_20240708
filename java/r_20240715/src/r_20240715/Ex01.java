package r_20240715;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/*
		 * 8.
		System.out.print("학생 이름을 입력하시오.");
		String name = sc.nextLine(); // 홍길동\n
		System.out.print("수학점수를 입력하시오 : ");
		int mat = sc.nextInt();
		System.out.print("국어점수를 입력하시오 : ");
		int kor = sc.nextInt();
		System.out.print("영어점수를 입력하시오 : ");
		int eng = sc.nextInt();
		if(kor >= 40 && eng >= 40 && mat >= 40 && (kor+eng+mat)/3 >= 60 ) {
			System.out.println(name + "는 합격입니다.");
		}else {
			System.out.println(name + "는 불합격입니다.");
		}
		
		9.
		int num1 = 10;
		int num2 = 20;
		System.out.println("1.더하기 | 2.빼기 | 3.곱하기 | 4.나누기");
		System.out.print("1부터 4사이의 값을 하세요 : ");
		int i = sc.nextInt();
		switch(i) {
		case 1 -> System.out.println(num1 + num2);
		case 2 -> System.out.println(num1 - num2);
		case 3 -> System.out.println(num1 * num2);
		case 4 -> System.out.println(num1 / num2);
		default -> System.out.println("1~4까지만 입력셔야합니다.");
		}
		
		10. 
		int charge;
	    int age = 12;
	    if (age < 8) {
	    	System.out.println("미 취학 아동입니다.");
	    	charge = 1000;
	    }else if(age < 14) {
	    	System.out.println("초등학생 입니다.");
	    	charge = 2000;
	    }else if(age < 20) {
	    	System.out.println("중, 고등학생 입니다.");
	    	charge =2500;
	    }else {
	    	System.out.println("일반인 입니다.");
	    	charge =3000;
	    }
	    System.out.println("입장료는 " + charge + "원입니다.");
	    
	    11.
	    int charge;
	    int age = 12;
	    switch(age) {
	    case 1: case 2: case 3: case 4: case 5: case 6: 
	    case 7:  
	    	System.out.println("미 취학 아동입니다.");
	    	charge = 1000; break;
	    case 8: case 9: case 10: case 11: case 12: 
	    case 13: 
	       	System.out.println("미 취학 아동입니다.");
	    	charge = 1000;break;
	    case 14: case 15: case 16: case 17: case 18: 
	    case 19: 
	    	System.out.println("중, 고등학생 입니다.");
		    charge = 2500; break;
		default : 
			System.out.println("일반인 입니다.");
	 	    charge = 3000;
	    }
	    12.
	    
		int month = 11;
		if(month == 12 || month >= 1 && month <= 2) {
			System.out.println("겨울입니다.");
		}else if(month >= 3 && month <= 5) {
			System.out.println("봄입니다.");
		}else if(month >= 6 && month <= 8) {
			System.out.println("여름입니다.");
		}else if(month >= 9 && month <= 11) {
			System.out.println("가을입니다.");
		}else {
			System.out.println("달이 아닙니다.");
		}
		14.
		String city;
		city = sc.nextLine();
		switch(city){
		case "02" -> System.out.println("서울입니다");
		case "031" -> System.out.println("경기도입니다");
		case "032" -> System.out.println("인천광역시입니다");
		case "041" -> System.out.println("충청남도입니다");
		case "051" -> System.out.println("부산광역시입니다");
		default -> System.out.println("프로그램 종료");			
		}
		17.
		//*        // j = 1
		//**       // j = 2
		//***      // j = 3
		//****     // j = 4
		//*****    // j = 5
		for(int i = 1; i <= 5 ; i++ ) {
			for(int j = 1; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		18.
		boolean run = true;
		int balance = 0;
		while(run) {
			System.out.println("-------------------------------------");
		 	System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
		 	System.out.println("-------------------------------------");
		 	System.out.print("선택 >");
		 	int menuNum = sc.nextInt();
		 	switch(menuNum) {
		 	case 1 -> {
		 		System.out.print("예금액 > ");
		 		balance += sc.nextInt();
		 	}
		 	case 2->{
			 	System.out.print("잔고 > ");
		 		balance -= sc.nextInt();
		 	}
		 	case 3 ->{
		 		System.out.print("예금액 > ");
		 		System.out.println(balance);
		 	}
		 	case 4 -> run = false;
		 	}
		}
		System.out.println("프로그램 종료");
		19.
		
		int [] arr = new int[10];
		for(int i = 0; i < arr.length ; i ++) {
			arr[i] = i + 1;
		}
		for(int val : arr) {
			System.out.println(val);
		}
		// 배열의 크기
		System.out.println(arr.length);
		String str = "이숭무";
		// 문자열의 크기
		System.out.println(str.length());
		
		20.
		
		int [] arr = new int [10];
		//System.out.println(arr.length); // 10
		int num = arr.length;
		for(int idx = 0; idx < arr.length ; idx ++) {
			arr[idx] = num--;
		}
		for(int val : arr) {
			System.out.println(val);
		}
		
		21.
		int [] i1 = new int[6];
		
		int len = 6;
		int [] i2 = new int[len];
		
		22.
		//양의 정수 : 5
		// 1 2 3 4 5
		
		int len = sc.nextInt();
		int arr [] = new int[len];
		for(int idx = 0; idx < arr.length ; idx++) {
			arr [idx] = idx + 1; 
		}
		for(int val : arr) {
			System.out.print(val + " ");
		}
		
		23.
		//                   0          1                  2
		int[][] array = {{95, 86}, {83, 92, 96}, {78, 83, 93, 87, 88}};
		System.out.println(array.length); // 3
		System.out.println(array[0].length);
		System.out.println(array[1].length);
		System.out.println(array[2].length);
		
		24.
		//몸무게를 입력하시오 : 45.5
		//몸무게를 입력하시오 : 27.3
		//몸무게를 입력하시오 : 12.6
		//몸무게를 입력하시오 : 65.4
		//최대값=65.40
		//최소값=12.60
		//합=150.80
		//평균=37.70
		
		System.out.print("사람수를 입력하세요. : ");
		int len =sc.nextInt();
		double weight [] = new double[len];
		for(int i = 0; i < 4 ; i++) {
			System.out.print("몸무게를 입력하시오 : ");
			weight[i] = sc.nextDouble();
		}
		double max = weight[0];
		double min = weight[0];
		double sum = 0;
		for(int i = 0; i < 4 ; i++ ) {
			if(max < weight[i])max = weight[i];
			if(min > weight[i])min = weight[i];
			sum += weight[i];
		}
		System.out.println(max);
		System.out.println(min);
		System.out.println(sum);
		System.out.println(sum / weight.length);
		*/
		boolean run = true;
		int studentNum = 0;   // 배열크기
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		while(run) {
		 	System.out.println("--------------------------------------------------------------");
		 	System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
		 	System.out.println("--------------------------------------------------------------");
		 	System.out.print("선택> ");
		 	int selectNo = scanner.nextInt();
			switch(selectNo) {
			case 1 : 
				System.out.print("학생수를 입력하세요 : ");
				studentNum = sc.nextInt();
				scores = new int[studentNum]; // 학생 배열
				break;
			case 2 : 
				for(int idx = 0 ; idx < studentNum ; idx++) {
					System.out.print("scores[" +idx+ "] > ");
					scores[idx] = sc.nextInt();
				}
				break;
			case 3 :
				int idx = 0;
				for(int val : scores) {
					System.out.println("scores[" + idx++ + "] > " + val);
				}
				break;
			case 4 :
				int max = 0;
				int sum = 0;
				double avg;
				for(int val : scores) {
					if(max < val ) max = val;
					sum += val;
				}
				System.out.println("최고 점수: " + max);
				System.out.println("합계 점수: " + sum);
				System.out.println("평균 점수: " + sum /studentNum );
				break;
			case 5: run = false; System.out.println("프로그램이 종료되었습니다.");
			}
		}
	}
}
