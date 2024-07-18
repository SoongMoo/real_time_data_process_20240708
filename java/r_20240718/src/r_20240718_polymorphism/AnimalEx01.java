package r_20240718_polymorphism;

public class AnimalEx01 {
	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		tiger.move();
		Human human = new Human();
		human.move();
		Animal animal = new Eagle();
		animal.move();
		animal = new Human();
		animal.move();
		animal = new Tiger();
		animal.move();
		animal = new Eagle();
		animal.move();
		Eagle eagle = (Eagle)animal; // 강제형변환 // 강제케스팅
		eagle.flying();
		animal = new Human();
		Human ex01 = (Human)animal;
		ex01.readBook();
	}
}
