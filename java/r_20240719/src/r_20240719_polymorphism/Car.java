package r_20240719_polymorphism;

public class Car {
	/*
	Tire frontLeftTire = new HankookTire(10, "앞왼쪽") ;
	Tire frontRightTire  = new HankookTire(10, "앞왼쪽") ;
	Tire backLeftTire  = new HankookTire(10, "앞왼쪽") ;
	Tire backRightTire   = new HankookTire(10, "앞왼쪽") ;
	*/
	/*
	Tire tire[] = new Tire[4];
	tire[0] = new HankookTire(10, "앞왼쪽") ;
	tire[1] = new HankookTire(10, "앞오른쪽");
	tire[2] = new HankookTire(10, "뒤왼쪽");
	tire[3] = new HankookTire(10, "뒤오른쪽"); 
	*/
	Tire tire[] = {new HankookTire(10, "앞왼쪽"), 
			 new KumhoTire(10, "앞오른쪽"),
			 new HankookTire(10, "뒤왼쪽"),
			 new HankookTire(10, "뒤오른쪽")};
	public int run() {
		System.out.println("차가 달립니다.");
		if(tire[0].roll() == false) {stop(); return 1 ;}
		if(tire[1].roll() == false) {stop(); return 2; }
		if(tire[2].roll() == false) {stop(); return 3; }
		if(tire[3].roll() == false) {stop(); return 4; }
		return 0;
	}
	private void stop() {
		System.out.println("차를 멈춥니다.");
	}
}
