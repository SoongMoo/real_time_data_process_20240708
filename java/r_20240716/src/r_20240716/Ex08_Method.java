package r_20240716;

public class Ex08_Method {
	int first = 10;
	int second = 20;
	int result;
	public Ex08_Method() {} // 생성자 오버로딩
	public Ex08_Method(int first, int second) {
		this.first = first;
		this.second = second;
	}
	public void add() { // 메서드 오버로딩
		result = first + second; // 멤버
	}
	public void add(int first) {
		result = first + second;
	}
/*
	public int add(int first) {
		return result = first + second;
	}
*/
	public void add(int first, int second) {
		   ///   100       200
		this.first = first;
		this.second = second;
		result = this.first + this.second;
	}
}
