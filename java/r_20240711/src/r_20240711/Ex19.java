package r_20240711;

public class Ex19 {

	public static void main(String[] args) {
		if(args != null) {
			for(int idx = 0; idx < args.length; idx++) {
				System.out.println(args[idx]);
			}
			
			for(int gop = 1; gop<=9 ; gop ++) {
				System.out.println(args[0] + " * " + gop + " = " 
									+ Integer.parseInt(args[0])  * gop);
			}
			if(args[0].equals("/?")) {
				//코드
			}
		}
	}
}