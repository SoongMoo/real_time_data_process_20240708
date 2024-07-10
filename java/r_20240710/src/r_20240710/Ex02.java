package r_20240710;

public class Ex02 {
	public static void main(String[] args) {
		//제어문 : 조건문 / 반복문
		// 조건문 : if , switch 
		// 반복문 : for , while, do ~ while
		// *단일 if
		// if(조건식) { //   조건식에는  부울값이 오거나 결과 부울인 식이 온다.
		//    명령문 // true일 때 실행될 코드를 작성
		// }
		// * if ~ else
		/*
		 *  if(조건식){
		 *  	명령문 : true일 때 실행되는 명령
		 *  }else{
		 *  	명령어 : false일 때 실행되는 명령
		 *  	...
		 *  	명령어_n
		 *  }
		 */
		int money = 1500;
		if(money >= 1450) {
			System.out.println("버스를 타고 가시오");
		}
		money = 1000;
		if(money >= 1450) {
			System.out.println("버스를 타고 가시오");
		}else {
			System.out.println("걸어가시오");
		}
		
	}
}
