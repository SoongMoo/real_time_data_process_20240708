package r_20240710;

public class Ex01 {
	public static void main(String[] args) {
		// 일항연산자 : ++, -- , -, +
		/* 이항연사자 : 
		 * 	산술연산자 : * 	+, - , * , / , % , 
		 *  연결연산자 : +
		 *  비교연산자 : > , < , <= ,>=, ==, !=
		 *  논리연산자 : &&(and) , ||(or)
		 *  대입연산자 : +=, -=, *=, /=, %=
		 */
		// 삼항연산자 :  a ? b : c
		int i = 10, j = 20;
		String str = i > j ? "크다" : "작다";
		System.out.println(str);
		if(i > j)str = "크다";
		else str = "작다";
		System.out.println(str);
	}
}
