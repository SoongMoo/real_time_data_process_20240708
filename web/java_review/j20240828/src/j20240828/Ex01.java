package j20240828;

public class Ex01 {

	public static void main(String[] args) {
		char ch[] = new char[26];
		ch[0] = 65; //'A'
		ch[1] = 'B'; // 66
		//반복문을 이용해서 대문자를 저장
		                          // 26
		for(int idx = 65; idx < ch.length + 65 ; idx ++) {
			ch[idx - 65] = (char)idx;
		}
		for(char val : ch) {
			System.out.println(val);
		}
		// 소문자 
		ch[0] = 'A' + 32;
		System.out.println(ch[0]);
		for(int idx = 0 ; idx < ch.length ; idx ++) {
			ch[idx] = (char)(idx + 97);
		}
		for(char val : ch)
			System.out.println(val);
		/// 마지막요소의 값을 출력
		System.out.println(ch[ch.length -1]);
	}

}
