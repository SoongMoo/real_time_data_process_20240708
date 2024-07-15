package r_20240715;

public class Ex04_Board {
	int num;
	String subject;
	String contents;
	String writer;
	public void setData(int num, String subject, String contents,
			String writer) {
		this.num = num;
		this.subject = subject;
		this.contents = contents;
		this.writer = writer;
	}
	// setter
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
	public void print() {
		System.out.println(num);
		System.out.println(subject);
		System.out.println(contents);
		System.out.println(writer);
	}
}
