package r_20240719_polymorphism;

public class HankookTire implements Tire{
	int maxRotation; // 최대회전
	int accumulatedRotation; // 현재 회전수
	String location; // 타이어의 위치
	public HankookTire(int maxRotation, String location) {
		this.maxRotation = maxRotation;
		this.location = location;
	}
	@Override
	public boolean roll() {
		accumulatedRotation++;
		if(maxRotation > accumulatedRotation) {
			System.out.println(location + "한국타이어 수명 : " 
										+ accumulatedRotation + "회");
			return true;
		}else {
			System.out.println("***" + location + "한국타이어 펑크 ***");
			return false;
		}
	}
}
