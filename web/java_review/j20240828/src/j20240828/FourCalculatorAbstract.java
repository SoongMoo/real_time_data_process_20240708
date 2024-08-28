package j20240828;

public class FourCalculatorAbstract extends CalculatorAbstract{
	public FourCalculatorAbstract(int num1, int num2) {
		super(num1, num2);
	}
	@Override
	public int div() ///메서드 머리 
	{                                 ///  ->
		if(num2 == 0) return 0;       ///  몸통
		else return num1 / num2;
	}                                  /// <-
	public int sub() {
		return num1 - num2;
	}
	public int mul() {
		return num1 * num2;
	}

}
