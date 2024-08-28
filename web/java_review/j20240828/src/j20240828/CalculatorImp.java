package j20240828;

public class CalculatorImp implements CalculatorInterface{
	@Override
	public int add() {
		return NUM1 + NUM2;
	}
	@Override
	public int div() {
		// TODO Auto-generated method stub
		return NUM1 / NUM2;
	}
	public int sub() {
		return NUM1 - NUM2;
	}
}