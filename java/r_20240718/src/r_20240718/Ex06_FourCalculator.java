package r_20240718;

public class Ex06_FourCalculator extends Ex06_Calculator {

	public Ex06_FourCalculator(int first, int second) {
		super(first, second);
	}
	public void sub() {
		result = first - second;
	}
	public void mul() {
		result = first * second;
	}
	// 
	/* final키워드가 있기 때문에 오버라이딩을 할 수 없다.
	public void div() {
		result = first / second;
	}
	*/
}
