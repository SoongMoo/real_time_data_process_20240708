package r_20240710;

public class Ex04 {

	public static void main(String[] args) {
		// switch
		char gender = 'M';
		if(gender == 'M') { // 등호연산자
			System.out.println("남자입니다.");
		}else {
			System.out.println("여자입니다.");
		}
		switch(gender) {
		// gender == 'M'
		case 'M' : System.out.println("남자입니다");break;
		// gender == 'F'
		case 'F' : System.out.println("여자입니다.");
		}
		switch(gender) {
		case 'M' : System.out.println("남자입니다.");break;
		// else
		default: System.out.println("여자입니다.");
		}
		switch(gender) {
		default: System.out.println("여자입니다.");break;
		case 'M' : System.out.println("남자입니다.");
		}
		
	}

}
