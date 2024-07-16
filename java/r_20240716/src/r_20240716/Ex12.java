package r_20240716;

public class Ex12 {

	public static void main(String[] args) {
		int i1 = 10;
		int i2 = 20;
		int i3 = 30;
		int i4 = 40;
		int [] i = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		for(int val : i) {
			System.out.println(val);
		}
		// 학생을 5명
		Ex12_Student st1 = new Ex12_Student(100001,"이숭무", 4, "성남");
		
		Ex12_Student [] st = new Ex12_Student[3];
		st[0] = new Ex12_Student(100001,"이숭무", 4, "성남");
		st[1] = new Ex12_Student(100002,"이상범", 4, "성남");
		st[2] = new Ex12_Student(100003,"이장범", 4, "성남");
		for(Ex12_Student obj : st) {
			obj.print();
		}
	}
}
