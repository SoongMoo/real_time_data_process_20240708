package r_20240715;

import r_20240715_1.Person1;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex06_Person p =  new Ex06_Person();
		p.setData("이숭무", "01071461970", "서울", 30, 175.5, false);
		//p.gender = false; // 직접 접근
		p.setGender(false);
		System.out.println(p.isGender());
		Person1 p1 = new Person1();
		// p1.gender = false; 직접접근이 안되므로 setter를 이용해야 한다.
	}
}
