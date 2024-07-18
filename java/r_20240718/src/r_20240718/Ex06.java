package r_20240718;

public class Ex06 {
	public static void main(String [] args) {
		Ex06_FourCalculator ex01 =  new Ex06_FourCalculator(10, 20);
		ex01.add();
		ex01.div();
		System.out.println(ex01.result);
		Ex06_FourCalculator ex02 =  new Ex06_FourCalculator(10, 0);
		ex02.add();
		ex02.div(); // 10 / 0 : 불능
		System.out.println(ex02.result);
	}
}
