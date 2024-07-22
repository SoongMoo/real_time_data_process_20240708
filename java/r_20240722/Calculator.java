package r_20240722;

import lombok.AllArgsConstructor;

@AllArgsConstructor // 생성자
public class Calculator {
	int first;
	int second;
	public int add() {
		return first + second;
	}
	public int div() {
		return first / second;
	}
}
