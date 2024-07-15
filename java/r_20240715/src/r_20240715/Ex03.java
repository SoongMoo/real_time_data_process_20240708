package r_20240715;

public class Ex03 {
	public static void main(String[] args) {
		Ex03_Student st = new Ex03_Student();
		st.name = "이숭무";
		st.age = 30;
		Ex03_Student st1 = new Ex03_Student();
		// 호출 메서드  : 인자 : 실인자 : argument
		st1.setData("이숭무", "서울", 12341234, 30 , 4, 172.5, false);
		System.out.println(st1.name);
		st1.print();
	}
}