package r_20240718;

public class Ex04_Calculator {
	int first;
	int second;
	int result;
	public Ex04_Calculator() { // 기본 생성자
		first = 10;
		second = 20;
	}
	public Ex04_Calculator(int first, int second) { // 생성자
		this.first = first;
		this.second = second;
	}
	public void add() {
		result = first + second;
	}
	public void div() {
		result = first + second;
	}
}
