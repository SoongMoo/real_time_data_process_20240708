package r_20240715;

public class Ex08_Board {
	int num;
	String subject;
	String contents;
	String writer;
	// 생성자가 정의 되지 않은 경우 기본생성자 존재
	// public Ex08_Board(){} 
	// 멤버를 초기화하기 위해서 생성자를 사용
	public Ex08_Board(int num, String subject, String contents, String writer) {
		this.num = num;
		this.subject = subject;
		this.contents = contents;
		this.writer = writer;
	}
	// 생성자를 정의 하면 기본 생성자는 존재 하지 않는다.
	// 기본생성자를 정의해 줘야 한다.
	public Ex08_Board(){} 
	// 같은 이름의 메서드명을 가진 것을 오버로딩이라고 한다.
	public void print() {
		System.out.println(num);
		System.out.println(subject);
		System.out.println(contents);
		System.out.println(writer);
	}
}
