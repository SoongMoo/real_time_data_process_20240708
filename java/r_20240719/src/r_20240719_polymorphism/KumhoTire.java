package r_20240719_polymorphism;

public class KumhoTire implements Tire{
	int maxRotation;
	int accumulatedRotation;
	String location;
	public KumhoTire(int maxRotation, String location) {
		this.maxRotation = maxRotation;
		this.location = location;
	}
	@Override
	public boolean roll() {
		accumulatedRotation++;
		if(maxRotation > accumulatedRotation) {
			System.out.println(location + "금호타이어 수명 : " 
									+ accumulatedRotation + "회");
			return true; 
		}else {
			System.out.println("***" + location + "금호타이어 펑크 ***");
			return false;
		}
	}

}
