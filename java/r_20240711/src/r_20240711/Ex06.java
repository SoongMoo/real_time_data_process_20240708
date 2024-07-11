package r_20240711;

public class Ex06 {
	public static void main(String[] args) {
		char ch[] = new char[26];
		ch[0] = 'A'; // 65
		ch[1] = 66;  // B
		System.out.println(ch[0]);
		System.out.println(ch[1]);
		for(int idx = 0; idx < ch.length ; idx++) {
			ch[idx] = (char)(idx + 65);
		}
		for(char c : ch) {
			System.out.println(c);
		}
		// 소문자
		for(int idx = 0; idx < ch.length ; idx++) {
			ch[idx] = (char)(idx + 65 + 32);
		}
		for(char c : ch) {
			System.out.println(c);
		}
		char charecter = 'A';
		for(int idx = 0; idx < ch.length; idx++,charecter++) {
			ch[idx] = charecter;
		}
	}
}
