package r_20240722_wrapper;

public class WrapperEx02 {
	public static void main(String [] args) {
		int i = 10;
		Integer ii = i;
		Integer i2 = 100; // boxing
		i = i2;      // unboxing
		String str = "100";
		i = Integer.parseInt(str);
		str = Integer.toString(10);
		str = Double.toString(10.5);
		str = Long.toString(10000000000L); 
	}
}
