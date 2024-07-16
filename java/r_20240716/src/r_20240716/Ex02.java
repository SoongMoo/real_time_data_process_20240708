package r_20240716;

public class Ex02 {
	static Ex02_Calculator calc = new Ex02_Calculator();
	static Ex02_Calculator calc1 = new Ex02_Calculator(100, 200);
	public static void main(String[] args) {
		 //기본생성자 실행
		calc.add();
		calc.print();
		print();
		calc1.add();
		calc1.print();
	}
	public static void print() {
		System.out.println(calc.getFirst());
		System.out.println(calc.getSecond());
		System.out.println(calc.getResult());
	}
}
