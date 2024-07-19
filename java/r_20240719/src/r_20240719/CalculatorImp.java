package r_20240719;

public interface CalculatorImp { // 생성자가 없다.
	final double PI = 3.151592; // 상수
	int ERROR = 99999; // 상수
	// 추상메서드
	void add(int num1, int num2);
	int sub();
	// 9버전 이후 
	// default 메서드
	default void print() {
		System.out.println("디펄트 메서드");
	}
	// 정적메서드
	static int total(int [] arr) {
		int total= 0;
		for(int i : arr) {
			total += i;
		}
		return total;
	}
	
	
	
}
