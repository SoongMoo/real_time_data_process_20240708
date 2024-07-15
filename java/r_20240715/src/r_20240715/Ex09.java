package r_20240715;

public class Ex09 {

	public static void main(String[] args) {
		// 3명의 회원을 입력하시오. 2명은 생성자를 이용해서 초기화
		// 1명은 기본생성자를 이용해서 객체생성한 후 초기화
		Ex09_Member member1 = new Ex09_Member(1, "이숭무","high", "1234" , 
				"010-7146-1970", "서울", 'M');
		Ex09_Member member2 = new Ex09_Member(2, "이상무","highland", "1234" , 
				"010-1234-1234", "성남", 'M');
		Ex09_Member member3 = new Ex09_Member();
		member3.setMemberNum(3);
		member3.setMemberName("이장범");
		member3.setMemberId("land0");
		member3.setMemberPw("1234");
		member3.setPhone("010-9874-9874");
		member3.setGender('F');
		member3.setMemberAddr("부산");
		member1.print();
		member2.print();
		member3.print();
	}
}
