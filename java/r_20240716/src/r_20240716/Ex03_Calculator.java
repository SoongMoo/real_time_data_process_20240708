package r_20240716;

public class Ex03_Calculator {
	private int first;
	private int second;
	private int result;
	public Ex03_Calculator(int first, int second) {
		this.first = first;
		this.second = second;
	}
	public int getFirst() {
		return first;
	}
	public int getSecond() {
		return second;
	}
	public int getResult() {
		return result;
	}
	public void add() {
		result = first + second;
	}
	
	
	
	
}
