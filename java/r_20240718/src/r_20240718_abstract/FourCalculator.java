package r_20240718_abstract;

public class FourCalculator extends Calculator{
	public FourCalculator(int first, int second) {
		super(first, second);
	}
	@Override
	public void div() {
		if(second == 0)result = 0;
		else result = first / second;
	}
	public void sub() {
		result = first - second;
	}
	public void mul() {
		result = first / second;
	}
}
