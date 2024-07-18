package r_20240718_polymorphism;

public class Tire {
	int maxRotation; // 최대회전
	int accumulatedRotation; // 현재 회전수
	String location; // 타이어의 위치
	public Tire(int maxRotation , String location) {
		this.accumulatedRotation = accumulatedRotation;
		this.location = location;
	}
	public boolean roll() {
		accumulatedRotation ++;
		if(maxRotation > accumulatedRotation) {
			System.out.println(location + "Tire 수명은 " + accumulatedRotation + "회");
			return true;
		}else {
			System.out.println(location + "Tire 펑크");
			return false;
		}
	}
	
}
