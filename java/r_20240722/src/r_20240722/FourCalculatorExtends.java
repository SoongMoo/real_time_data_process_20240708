package r_20240722;

public class FourCalculatorExtends extends CaluatorAbstract{
	public FourCalculatorExtends(int first, int second) {
		super(first, second);
	}
	public int sub() {
		return first - second;
	}
	public int mul() {
		return first * second;
	}
	@Override
	public int div() {
		if(second == 0)	return 0;
		else return first / second;
	}
}
