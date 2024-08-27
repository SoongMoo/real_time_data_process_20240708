package j20240827;

public class Ex07 {

	public static void main(String[] args) {
		// 제어문 : 조건식 : condition
		/* 조건문  : if , switch~case 
		 *          단일 if , if ~ else, if ~ else if ~ else , 다중 if 
		 			if(condition){
		 				실행코드
		 			}else{
		 				코드
		 			}
		 * 반복문  : for, while, forEach
		 */
		char ch = 'M';
		if(ch == 'M') {
			System.out.println("남자입니다.");
		}else {
			if(ch == 'F') 
				System.out.println("여자입니다.");
		}
		if(ch == 'M')
			System.out.println("남자입니다.");
		else if(ch == 'F')
			System.out.println("여자입니다.");
		
		switch(ch) {
		case 'F' : System.out.println("여자입니다.");break;
		case 'M' : System.out.println("남자입니다.");break;
		}
		
		switch(ch) {
		case 'F' -> System.out.println("여자입니다.");
		case 'M' -> System.out.println("남자입니다.");
		}	
			
		
		

	}

}
