package r_20240717;

public class Ex01 {
	public static void main(String[] args) {
		int i1 = 10;
		int i2 = 20;
		int i3 = 30;
		int i [] = new int [3]; // [0][0][0]
		i[0] = 10; // [10][0][0]
		i[1] = 20; // [10][20][0]
		Account acc1 = new Account(10001, "이숭무", 1000);
		Account acc2 = new Account(10001, "이숭무", 1000);
		Account acc3 = new Account(10001, "이숭무", 1000);
		Account [] acc = new Account[3]; //[null][null][null]
		// 배열의 초기값 : 정수배열 0, 실수배열 0.0, 부울배열 false, 문자 blank
		//              문자열을 포함한 나머지 배열 초기값 null
		acc[0] = new Account(10001, "이숭무", 1000); // [객체][null][null]
		acc[1] = new Account(10002, "이숭무", 1000); // [객체][객체][null]
		for(int val : i) {
			System.out.println(val);
		}
		for(Account  obj  :  acc ) {
			if(obj == null) break;
			System.out.println(obj.accountNo);
		}
	}
}
