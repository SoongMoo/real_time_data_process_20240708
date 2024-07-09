package r_20240708;

public class Ex20 {
	public static void main(String[] args) {
		// 잠깐 생각하는 시간 
		
		// 8세 미만은  "미 취학 아동입니다." , 입장료가 1000 
		// 14세 미만은 "초등학생 입니다." , 입장료가 2000
		// 20세 미만은 "중, 고등학생 입니다." 입장료 2500
		// 이상은 "일반인 입니다." , 입장료가 3000원
		int age = 12;
		int charge;
		if(age < 8 ) {  // 0 ~ 7
			System.out.println("미 취학 아동입니다.");
			charge = 1000;
		}else if(age < 14) { //8 ~ 13
			System.out.println("초등학생 입니다.");
			charge = 2000;
		}else if(age < 20) { // 14 ~ 19
			System.out.println("중, 고등학생 입니다.");
			charge = 2500;
		}else { // 20세 이상
			System.out.println("일반인 입니다.");
			charge = 3000;
		}
 
		System.out.println("입장료는 " + charge + "원입니다.");
	}

}
