package j20240828;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Calculator {
	int num1;
	int num2;
	public int add() {
		return num1 + num2;
	}
	public int div() {
		return num1 / num2; 
	}
	// mul, sub
}
