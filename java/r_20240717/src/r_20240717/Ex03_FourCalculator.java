package r_20240717;

public class Ex03_FourCalculator extends Ex03_Calculator  {
	/*
	int first;
	int second;
	int result;
	public void add() {
		result = first + second;
	}
	public void div() {
		result = first / second;
	}
	*/
	public Ex03_FourCalculator(int first, int second) {
		this.first = first;
		this.second = second;
	}
	public void sub() {
		result = first - second;
	}
	public void mul() {
		result = first * second;
	}
}
