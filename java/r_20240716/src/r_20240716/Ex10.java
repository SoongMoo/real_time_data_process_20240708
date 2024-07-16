package r_20240716;

public class Ex10 {

	public static void main(String[] args) {
		Ex10_Static.num2 = 20; 
		Ex10_Static c = new Ex10_Static(); 
		Ex10_Static c1 = new Ex10_Static();
		c.num1 = 100;
		c1.num1 = 1000;
		c.result = 20;
		c1.result = 200;
		System.out.println(c.num1);
		System.out.println(c.result);
		System.out.println(c1.num1);
		System.out.println(c1.result);
		System.out.println(c.num2);
		System.out.println(c1.num2);
		Ex10_Static.add(10,20);
	}
}
