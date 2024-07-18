package r_20240718_polymorphism;

public class Car {
	// 앞 왼쪽 타이어 : 한구타이어 / 금호타이어 
	Tire frontLeftTire = new HankookTire(6, "앞왼쪽");
	// 앞 오른쪽 타이어
	Tire frontRightTire = new HankookTire(7, "앞오른쪽");
	Tire backLeftTire = new HankookTire(8, "뒤왼쪽");
	Tire backRightTire = new HankookTire(9, "뒤오른쪽");
	int run() {
		System.out.println("[자동차가 달립니다.]");
		if(frontLeftTire.roll() == false) return 1;  // 앞왼쪽
		if(frontRightTire.roll() == false) return 2;  // 앞왼쪽
		if(backLeftTire.roll() == false) return 3;  // 앞왼쪽
		if(backRightTire.roll() == false) return 4;  // 앞왼쪽
		return 0;
	}
	void stop() {
		System.out.println("차가 멈췄습니다.");
	}
}
