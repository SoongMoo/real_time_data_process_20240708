package r_20240722_wrapper;

public class StringEx02 {

	public static void main(String[] args) {
		String str1 = "이숭무"; // static
		String str2 = new String("이숭무"); // heap
		if(str1 == str2) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		if(str1.equals(str2)){
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		//  문열 붙이기
		String javaStr = "java";
		String androidStr = "android";
		System.out.println(javaStr + androidStr);
		String result = javaStr.concat(androidStr);
		System.out.println(result);
		
		// 변수가 저장하고 있는 주소 출력
		System.out.println(System.identityHashCode(javaStr));
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		// 문자열에서 문자 추출
		//                                 0123456
		System.out.println(androidStr); // android
		char ch = androidStr.charAt(2);
		System.out.println(ch);
		//               0 123 45 6 7
		String subStr = "자바 프로그래밍";
		ch = subStr.charAt(3);
		System.out.println(ch);
		// 문자열 자르기
		result = subStr.substring(3 , (3 + 3));
		System.out.println(result);
		result = subStr.substring(3 , 6);
		System.out.println(result);
		result = subStr.substring(3); // 3부터 마지막
		System.out.println(result);
		// 크기
		System.out.println(subStr.length());
		// subStr에서 마지막 글자를 가져오시오.
		ch = subStr.charAt(subStr.length() -1 );
		System.out.println(ch);
		// 문자열이 가진 고유의 번호 index를 가져오기
		int idx = subStr.indexOf('프');
		System.out.println(idx);
		// '프'부터 3글자 출력
		result = subStr.substring(subStr.indexOf('프')
				, subStr.indexOf('프') + 3);
		System.out.println(result);
		// 문자열 변경
		//"자바 프로그래밍" 을 "java 프로그래밍"
		System.out.println(subStr);
		result = subStr.replace("자바", "java");
		System.out.println(subStr);
		System.out.println(result);
		String original = "Java Programming";
		// 모두 대문자
		result = original.toUpperCase();
		System.out.println(result);
		// 모두 소문자
		result = original.toLowerCase();
		System.out.println(result);
		// 양쪽 공백 지우기
		original = "     Java Programming     ";
		result = original.trim();
		System.out.println(result);
		String userId = "    highland0   ";
		userId = userId.trim();
		System.out.println(userId);
		// 리터널을 문자열...
		int i = 10;
		result = String.valueOf(i);
		System.out.println(result);
	}
}