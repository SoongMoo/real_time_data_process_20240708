package r_20240710;

public class Ex03 {
	public static void main(String[] args) {
		/*
		 * 다중 if문
		 * if(조건식){
		 * 	 if(조건식){
		 * 
		 * 	 }
		 *   if(조건식){
		 *   
		 *   }else{
		 *   
		 *   }
		 * }else{
		 *   ...
		 * } 
		 * if ~ else if ~ else
		 */
		// 100~90:A, 89~80:B, 79~70:C, 69~60 : D, 59이하 :F
		// if ~ else if ~ else으로 작성
		int score = 74;
		if (score >= 90) { System.out.println("A");}
		else if(score >= 80) {System.out.println("B");}
		else if(score >= 70) {System.out.println("C");}
		else if(score >= 60) {System.out.println("D");}
		else {System.out.println("F");}
		// 95이상이면 "A+" 90이상이면 "A"
		// 85이상이면 "B+" 80이상이면 "B"
		// 75이상이면 "C+" 80이상이면 "C"
		// 65이상이면 "D+" 60이상이면 "D"
		// 아니면 "F"이다.
		if (score >= 90) { 
			if(score >= 95)	System.out.println("A+");
			else System.out.println("A");
		}else if(score >= 80) {
			if(score >= 85)System.out.println("B+");
			else System.out.println("B");
		}else if(score >= 70) {
			if(score >=75 )System.out.println("C+");
			else System.out.println("C");
		}else if(score >= 60) {
			if(score >=65)System.out.println("C+");
			else System.out.println("C");
		}else {System.out.println("F");}
		// 8세 미만은  "미 취학 아동입니다." , 입장료가 1000 
		// 14세 미만은 "초등학생 입니다." , 입장료가 2000
		// 20세 미만은 "중, 고등학생 입니다." 입장료 2500
		// 이상은 "일반인 입니다." , 입장료가 3000원
		int age = 12;
		int charge;
		if(age >= 20) {
			System.out.println("일반인 입니다.");
			charge = 3000;
		}else if(age >= 14) {
			System.out.println("중, 고등학생 입니다.");
			charge = 2500;
		}else if(age >= 8) {
			System.out.println("초등학생 입니다.");
			charge = 2000;
		}else {
			System.out.println("미 취학 아동입니다.");
			charge = 1000;
		}
		System.out.println("입장료는 " + charge + "원입니다.");
	}
}
