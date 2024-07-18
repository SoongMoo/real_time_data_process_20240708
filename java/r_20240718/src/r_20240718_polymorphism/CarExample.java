package r_20240718_polymorphism;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		for(int i = 0 ; i <= 10; i++) {
			int num = car.run();
			switch(num) {
			case 1: // 앞바퀴
				System.out.println("앞왼쪽 금호타이어 교체");
				car.frontLeftTire = new KumhoTire(10, "앞왼쪽");
				break;
			case 2: // 앞바퀴
				System.out.println("앞왼쪽 금호타이어 교체");
				car.frontLeftTire = new KumhoTire(10, "앞오른쪽");
				break;
			case 3: // 앞바퀴
				System.out.println("앞왼쪽 금호타이어 교체");
				car.frontLeftTire = new KumhoTire(10, "뒤왼쪽");
				break;
			case 4: // 앞바퀴
				System.out.println("앞왼쪽 금호타이어 교체");
				car.frontLeftTire = new KumhoTire(10, "뒤오른쪽");
				break;
			}
		}
	}
}
