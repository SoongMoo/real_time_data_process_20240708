package r_20240716;

public class Ex07 {

	public static void main(String[] args) {
		Ex07_Method ex1 = new Ex07_Method();
		ex1.add(); // 멤버 first = 10, 멤버 second = 20 
		ex1.print();
		Ex07_Method ex2 = new Ex07_Method(100, 200);
		ex2.add(); // 100 + 200
		ex2.print();
		ex1.add(1000);  //  멤버 first = 10, 멤버 second = 20
		ex1.print();
		
	}

}
