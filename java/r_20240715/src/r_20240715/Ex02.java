package r_20240715;

public class Ex02 {

	public static void main(String[] args) {
		// 변수 단점: 하나의 값만 저장가능하다. 정해진 타입만 가능
		// 배열 장점 : 하나 이상의 값을 저장 가능하다.
		// 배열 단점 : 크기가 고정이다.
		//           정해진 타입만 저장 가능
		// 배열 장점 : 하나 이상의 값을 저장 할 수있다.
		// class : 하나 이상의 값을 저장 하고, 여러 타입의 값응 저장 할 수 있다.
		int i = 10; // 정수리터널 변수 : 정수변수
		Ex02_Student st = new Ex02_Student(); // st : class 변수, 객체변수
		//            new Student(); // 객체생성 
		/*
		 * 	String name;
			int studentNum;
			int grade;
			int age;
			String addr;
			double height;
			boolean gender;
		 */
		st.name = "이숭무";
		st.addr = "서울";
		st.age = 30;
		System.out.println(i);
		System.out.println(st.name);
		System.out.println(st.age);
		
		int i1 = 20;
		Ex02_Student st1= new Ex02_Student();
		st1.name = "이상범";
		System.out.println(st1.name);
	}

}
