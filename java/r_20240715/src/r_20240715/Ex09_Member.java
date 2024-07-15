package r_20240715;

// 회원 가입
public class Ex09_Member {
	// 회원번호
	// 회원이름
	// 회원아이디
	// 회원비밀번호
	// 회원연락처
	// 회원 주소
	// 회원 성별 : char
	int memberNum;
	String memberName;
	String memberId;
	String memberPw;
	String phone;
	String memberAddr;
	char gender;
	
	//생성자 / 기본생성자
	public Ex09_Member() {}

	public Ex09_Member(int memberNum, String memberName, String memberId, String memberPw, String phone,
			String memberAddr, char gender) {
		this.memberNum = memberNum;
		this.memberName = memberName;
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.phone = phone;
		this.memberAddr = memberAddr;
		this.gender = gender;
	}
	// setter / getter
	public void setMemberNum(int memberNum) {
		this.memberNum = memberNum;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setMemberAddr(String memberAddr) {
		this.memberAddr = memberAddr;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	//////
	public int getMemberNum() {
		return memberNum;
	}
	public String getMemberName() {
		return memberName;
	}
	public String getMemberId() {
		return memberId;
	}
	public String getMemberPw() {
		return memberPw;
	}
	public String getPhone() {
		return phone;
	}
	public String getMemberAddr() {
		return memberAddr;
	}
	public char getGender() {
		return gender;
	}
	// print
	public void print() {
		System.out.println(memberNum);
		System.out.println(memberName);
		System.out.println(memberId);
		System.out.println(memberPw);
		System.out.println(phone);
		System.out.println(memberAddr);
		System.out.println(gender);
	}
}
