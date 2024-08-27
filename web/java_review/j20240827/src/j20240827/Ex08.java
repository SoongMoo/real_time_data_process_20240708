package j20240827;

public class Ex08 {

	public static void main(String[] args) {
		/* if문과 swith문의 차이
 		 * 
		 */
		int dayOfWeek = 3;
		/*
		// 14버전이후 부터 가능
		String dayName = switch (dayOfWeek) {
			case 0 -> "Sunday";
			case 1 -> "Monday";
			case 2 -> "Tuesday";
			case 3 -> "Wednesday";
			case 4 -> "Thursday";
			case 5 -> "Friday";
			case 6 -> "Saturday";
			default -> "Invalid day";
		};
		*/
		String dayName = "";
		switch (dayOfWeek) {
		case 0 -> dayName= "Sunday";
		case 1 -> dayName= "Monday";
		case 2 -> dayName= "Tuesday";
		case 3 -> dayName= "Wednesday";
		case 4 -> dayName= "Thursday";
		case 5 -> dayName= "Friday";
		case 6 -> dayName= "Saturday";
		default -> dayName= "Invalid day";
		};
		System.out.println("오늘은 " + dayName + "입니다.");
		if (dayOfWeek == 0) dayName= "Sunday";
		else if (dayOfWeek == 1) dayName= "Monday";
		else if (dayOfWeek == 2) dayName= "Tuesday";
		else if (dayOfWeek == 3) dayName= "Wednesday";
		else if (dayOfWeek == 4) dayName= "Thursday";
		else if (dayOfWeek == 5) dayName= "Friday";
		else if (dayOfWeek == 6) dayName= "Saturday";
		else dayName= "Invalid day";
		System.out.println("오늘은 " + dayName + "입니다.");
		
		// 3~5월은 봄입니다. 6~8월은 여름입니다. 9~11월은 가을입니다.
		// 12~2월까지는 겨울입니다.
		int month = 12;
		if(month == 12 || month >= 1 && month <= 2 )
			System.out.println("겨울입니다.");
		else if(month >= 3 && month <= 5)
			System.out.println("봄입니다.");
		else if(month >= 6 && month <= 8)
			System.out.println("여름입니다.");
		else if(month >= 9 && month <= 11)
			System.out.println("가을 입니다.");
		else 
			System.out.println("달을 잘 못입력하였습니다.");
		// swith문
		switch(month) {
		case 12:case 1: case 2: System.out.println("겨울입니다.");break;
		case 3:case 4: case 5: System.out.println("봄입니다.");break;
		case 6:case 7: case 8: System.out.println("여름입니다.");break;
		case 9:case 10: case 11: System.out.println("가을입니다.");break;
		default: System.out.println("달을 잘 못입력하였습니다.");
		}
	}

}
