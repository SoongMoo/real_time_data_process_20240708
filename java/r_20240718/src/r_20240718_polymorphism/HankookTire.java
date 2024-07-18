package r_20240718_polymorphism;

public class HankookTire extends Tire  {
	public HankookTire(int maxRotation, String location) {
		super(maxRotation, location);
	}
	@Override
	public boolean roll() {
		accumulatedRotation ++;
		if(maxRotation > accumulatedRotation) {
			System.out.println(location + "한국타이어  수명은 " 
										+ accumulatedRotation + "회");
			return true;
		}else {
			System.out.println(location + "한국타이어  펑크");
			return false;
		}
	}
}
