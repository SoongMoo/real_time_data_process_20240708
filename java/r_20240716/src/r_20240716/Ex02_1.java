package r_20240716;

public class Ex02_1 {

	public static void main(String[] args) {
		Ex02_Calculator calc = new Ex02_Calculator();
		calc.add();
		calc.print();
		print(calc);
		Ex02_Calculator calc1 = new Ex02_Calculator(100, 200);
		calc1.add();
		calc1.print();
		print(calc1);
		test(10, 20);
		test(100, 200);
	}
	public static void test(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	public static void print(Ex02_Calculator c) {
		System.out.println(c.getFirst());
		System.out.println(c.getSecond());
		System.out.println(c.getResult());
	}
	

}
