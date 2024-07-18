package r_20240718_polymorphism;

public class Tiger extends Animal {
	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다. ");
	}
	public void hunting() 
	{
		System.out.println("호랑이가 사냥을 합니다. ");
	}
}
