package r_20240718;

public class Ex01 {

	public static void main(String[] args) {
		Ex01_FourCalculator ex01 = new Ex01_FourCalculator();
		ex01.first = 10; ex01.second = 20;
		ex01.add();
		ex01.sub();
		ex01.div();
		Ex01_Calculator ex02 = new Ex01_Calculator();
		ex02.first = 100; ex02.second = 200;
		ex02.add();
		ex02.div();

	}

}
