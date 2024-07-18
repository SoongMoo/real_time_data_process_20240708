package r_20240718_polymorphism;

public class Human extends Animal {
	@Override
	public void move()
	{
		System.out.println("사람이 움직입니다.");
	}
	public void readBook()
	{
		System.out.println("사람이 책을 읽습니다. ");
	}
}
