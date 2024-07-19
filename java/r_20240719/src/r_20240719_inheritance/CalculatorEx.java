package r_20240719_inheritance;

import r_20240719.CalculatorImp;

public class CalculatorEx {
	public static void main(String[] args) {
		Calculator calc = new Calculator(20, 30);
		calc.add(20, 30);
		System.out.println(calc.sub());
		calc.print();
		int sum = CalculatorImp.total(new int[] {1,2,3,4});
		System.out.println(sum);
	}
}
