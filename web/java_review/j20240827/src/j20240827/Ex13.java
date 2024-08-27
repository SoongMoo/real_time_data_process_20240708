package j20240827;

public class Ex13 {
	public static void main(String [] args) {
		String name0 = "이숭무";
		String name1 = "이상범";
		String name2 = "이장범";
		String name3 = "이상무";
		
		String name[] = {"이숭무", "이상범", "이장범","이상무"};
		String i [] = new String[]{"이숭무", "이상범", "이장범","이상무"}; 
		String i1 [] = new String[4];
		i1[0] = "이숭무";
		i1[1] = "이상범";
		i1[2] = "이상범";
		i1[3] = "이상무";
		for(String s : i1) {
			System.out.println(s);
		}
		for(int idx = 0 ; idx < i1.length ; idx++) {
			System.out.println(i1[idx]);
		}
	}
}
