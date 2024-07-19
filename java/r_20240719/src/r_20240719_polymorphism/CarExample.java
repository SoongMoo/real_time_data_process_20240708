package r_20240719_polymorphism;

public class CarExample {
	public static void main(String [] args) {
		Car car = new Car();
		for(int i = 0; i <= 12 ; i++) {
			int num = car.run(); // 0,1,2,3,4
			switch(num) {
			case 1: System.out.println(" 왼쪽앞바퀴 금호타이어로 교체 ");
				car.tire[0] = new KumhoTire(7,"왼쪽앞");
			case 2 :
				System.out.println(" 오른쪽앞바퀴 금호타이어로 교체 ");
				car.tire[1] = new HankookTire(7,"오른쪽앞");
			case 3: System.out.println(" 왼쪽뒤바퀴 금호타이어로 교체 ");
				car.tire[2] = new KumhoTire(7,"왼쪽앞");
			case 4 :
				System.out.println(" 오른쪽뒤바퀴 금호타이어로 교체 ");
				car.tire[3] = new HankookTire(7,"오른쪽앞");
			}
		}
	}
}
