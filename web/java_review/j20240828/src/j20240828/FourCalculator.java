package j20240828;

public class FourCalculator extends Calculator{
	/*
	 * 	int num1;
	int num2;
	
	public int add() {
		return num1 + num2;
	}
	public int div() {
		return num1 / num2; 
	}
	 */
	public FourCalculator(int num1, int num2) {
		super(num1, num2);
	}
	public int sub() {
		return num1 - num2;
	}
	public int mul() {
		return num1 * num2;
	}
	@Override
	//  부모가 가진 메서드를 자식 쪽에서 이름은 그대로 사용하고 내용을 바꾸고 싶을 때
	public int div() {
		if(num2 == 0) {
			return 0; 
		}else {
			return num1 / num2;
		}
	}
	
	
	
	
	
	
	
	
	
	
}
