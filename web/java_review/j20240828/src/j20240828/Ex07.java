package j20240828;

public class Ex07 {

	public static void main(String[] args) {
		int i =10;
		String [] memerNums = {"mio_1","mio_2","mio_3"};
		int [] memberAges = {15,16,17};
		String [] memberNames = {"이숭무", "김찬중","이상희"};
		
		Member member1 = new Member();
		member1.memerNum = "mio_1";
		member1.memberAge = 15;
		member1.memberName = "이숭무";
		Member member2 = new Member("mio_2", 16, "김찬중");
		System.out.println(member1.memberName);
		System.out.println(member2.memberName);
		

	}

}
