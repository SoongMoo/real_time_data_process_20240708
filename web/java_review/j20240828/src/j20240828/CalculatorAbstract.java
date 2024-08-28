package j20240828;


// 추상 클래스 : 혼자서 객체 생성을 할 수 없다.
public abstract class CalculatorAbstract {
	// 멤버필드
	int num1;
	int num2;
	public CalculatorAbstract(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	public int add() {
		return num1 + num2;
	}
	// 추상메서드
	public abstract int div(); // 추상화 
}
