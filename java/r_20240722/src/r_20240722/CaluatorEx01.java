package r_20240722;

public class CaluatorEx01 {
	public static void main(String[] args) {
		// CaluatorAbstract ex01 = new CaluatorAbstract(10, 20);
		FourCalculatorExtends ex02=new FourCalculatorExtends(10, 20);
		// 다향성 : 변수 : 부모 클래스인 변수
		CaluatorAbstract ex03 = new FourCalculatorExtends(10, 20);
	}
}
// 객체 지향의 특징 
// 1 캡슐화 : 은닉
// 2 상속 : 오버라이딩 , 추상화(abstract)
// 3 다향성 : 같은 부모 클래스로 상속 받은 객체가 부모 이름으로 같이 쓸수 있는 것 