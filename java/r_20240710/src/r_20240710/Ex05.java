package r_20240710;

public class Ex05 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		System.out.println(" 1.덧셈 | 2.뺄셈 | 3.곱셈 | 4.나눗셈 ");
		int i = 2;
		switch(i) {
		case 1 : System.out.println(num1 + num2); break;
		case 2 : System.out.println(num1 - num2); break;
		default : System.out.println("1~4까지만 입력셔야합니다.");break;
		case 3 : System.out.println(num1 * num2); break;
		case 4 : System.out.println(num1 / num2); 
		}
	}

}
