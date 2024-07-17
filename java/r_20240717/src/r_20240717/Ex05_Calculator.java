package r_20240717;

public class Ex05_Calculator {
	int first;
	int second;
	int result;
	public Ex05_Calculator() {
		first = 10;
		second = 20;
	}
	public Ex05_Calculator(int first, int second) {
		this.first = first;
		this.second = second;
	}
	public void add() {
		result = first + second;
	}
	public void div() {
		result = first / second;
	}
}
