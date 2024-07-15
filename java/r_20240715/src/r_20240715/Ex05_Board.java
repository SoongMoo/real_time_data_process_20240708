package r_20240715;

public class Ex05_Board { // 캡슐화 
	// 캡슐화를 하므로써 멤버들을 은닉시킬 수 있다.
	// 접근지정자 : 엑세스를 할수 있도록 하는 권한
	private int num; 
	private String subject;
	private String contents;
	private String writer;
	public void setData(int num, String subject, String contents,
			String writer) {
		this.num = num;
		this.subject = subject;
		this.contents = contents;
		this.writer = writer;
	}
	// setter : 은닉멤버를 엑세스하여 값을 저장하기 위해 사용
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	//getter
	     //반환형
	public int getNum() { // 피호출 메서드
		return num;  // return 은 호출메서드쪽으로 값을 전달
	}
	public String getSubject() {
		return subject;
	}
	public String getContents() {
		return contents;
	}
	public String getWriter() {
		return writer;
	}
	
	public void print() {
		System.out.println(num);
		System.out.println(subject);
		System.out.println(contents);
		System.out.println(writer);
	}
}
