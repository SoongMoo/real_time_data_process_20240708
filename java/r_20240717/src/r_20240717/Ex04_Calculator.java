package r_20240717;

public class Ex04_Calculator {
	int first;
	int second;
	int result;
	//생성자 // 클래스 이름과 같은 이름의 메서드
	// 생성자는 반환형이 없다
	public Ex04_Calculator(int first, int second) {
		this.first = first;
		this.second = second;
		System.out.println("부모 객체");
	}
	public void add() {
		result = first + second;
	}
	public void div() {
		result = first / second;
	}
}