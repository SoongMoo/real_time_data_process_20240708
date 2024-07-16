package r_20240716;

public class Ex01 {

	public static void main(String[] args) {
		Ex01_Calculator calc = new Ex01_Calculator();
		calc.add(); // 10 + 20 = 30
		calc.print();
		Ex01_Calculator calc1 = new Ex01_Calculator(100, 200);
		calc1.add();
		calc1.print();
	}

}
