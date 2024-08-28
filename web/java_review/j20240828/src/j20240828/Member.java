package j20240828;

public class Member {
	String memerNum; // 맴버변수, 멤버필드
	int memberAge;
	double memberHeight;
	String memberName;
	
	public Member() { //생성자 
	}
	public Member(String memerNum,int memberAge, String memberName ) {
		this.memerNum = memerNum;
		this.memberAge = memberAge;
		this.memberName = memberName;
	}
}
