package r_20240716;

public class Ex02_Calculator {
	private int first;
	private int second;
	private int result;
	public Ex02_Calculator() {
		first = 10;
		second = 20;
	}
	public Ex02_Calculator(int first, int second) {
		this.first = first;
		this.second = second;
	}
	public void add() {
		result = first + second;
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
	public void print() {
		System.out.println(first);
		System.out.println(second);
		System.out.println(result);
	}
}
