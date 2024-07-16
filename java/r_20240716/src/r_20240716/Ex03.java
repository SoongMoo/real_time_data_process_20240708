package r_20240716;

public class Ex03 {

	public static void main(String[] args) {
		int i = 10; // 정수 변수
		double d = 1.0; // 실수 변수
		String str = "이숭무";
		//             변수           객체
		Ex03_Calculator calc = new Ex03_Calculator(10, 20);
		calc.add();
		print(calc);
		/*
		System.out.println(calc.getFirst());
		System.out.println(calc.getSecond());
		System.out.println(calc.getResult());
		*/
		Ex03_Calculator calc1 = new Ex03_Calculator(100, 200);
		calc1.add(); // 100+200
		print(calc1);
		/*
		System.out.println(calc1.getFirst());
		System.out.println(calc1.getSecond());
		System.out.println(calc1.getResult());
		*/
		Ex03_Calculator calc2 = new Ex03_Calculator(1000, 2000);
		calc2.add(); // 100+200
		System.out.println(calc2.getFirst());
		System.out.println(calc2.getSecond());
		System.out.println(calc2.getResult());
		
		intMethod(i);
	}
	public static void intMethod(int a) { // 값 전달 방식
		System.out.println(a);
	}
	public static void print(Ex03_Calculator num) { // 객체전달방식
		System.out.println(num.getFirst());
		System.out.println(num.getSecond());
		System.out.println(num.getResult());
	}
}
