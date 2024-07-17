package r_20240717;

public class Ex03 {
	public static void main(String[] args) {
		Ex03_FourCalculator calc = new Ex03_FourCalculator(10, 20);
		calc.add();
		System.out.println(calc.result);
		calc.div();
		System.out.println(calc.result);
	}
}