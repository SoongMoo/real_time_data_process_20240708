package r_20240718;

public final class Ex07_Calculator { // 클래스에 fianl은 상속하지 못하게 한다.
	int first;
	int second;
	int result;
	public Ex07_Calculator(int first, int second) { // 생성자
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
