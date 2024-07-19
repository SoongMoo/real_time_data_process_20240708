package r_20240719;

public class TestEx {

	public static void main(String[] args) {
		// 정적은 객체 생성 없이 클래스명을 이용해서 사용
		System.out.println(Test.i); // 
		Test.staticMethod();
		Test i = new Test(); // k, y
		Test i1 = new Test(); // k, y
	}

}
