package r_20240718;

public class Ex05_FourCalculator extends Ex05_Calculator {

	public Ex05_FourCalculator(int first, int second) {
		super(first, second);
	}
	public void sub() {
		result = first - second;
	}
	public void mul() {
		result = first * second;
	}
	// overriding : 부모로 부터 상속 빋은 메서드를 자식클래스에서 다시 정의하는 것
	/*
	 * public void div() {
		result = first / second;
		}
	 * 
	 */
	public void div() { // 부모 클래스에 있는 메서드를 재 정의
		if(second == 0) {
			result =0;
		}else {
			result = first / second;
		}
	}
	
	
	
	
	
	
	
	
	
	
}