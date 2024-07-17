package r_20240717;
//               자식                          부모
public class Ex04_FourCalculator extends Ex04_Calculator {
/*
  	int first;
	int second;
	int result;
	//생성자
	public Ex04_Calculator(int first, int second) {
		this.first = first;
		this.second = second;
	}
	public void add() {
		result = first + second;
	}
	public void div() {
		result = first / second;
	}
 */
	// 부모클래스에 생성자가 있다면 자식클래스에서 부모생성자를 실행하도록 
	// 자식클래스에도 생성자가 존재해야 한다.
	public Ex04_FourCalculator(int first, int second) {
		// 부모클래스의 생성자를 실행시킬 때는 super메서드를 사용한다.
		super(first, second);
		System.out.println("자식 객체");
	}
	public void sub() {
		result = first - second;
	}
	public void mul() {
		result = first * second;
	}
	
}







