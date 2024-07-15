package r_20240715;

public class Ex10_QnA {
	// setter/getter , 생성자
	// 객체생성시 생성자를 이용하고 생성한 후 setter를 이용해서 멤버값을 변경하고 
	//getter를 이용해서 맴버값을 출력
	/*
	 * 상담정보는 상담 번호:inquireNum, 상담종류 : inquireKind,
                상담 제목:inquireSubject, 상담내용:inquireContent
                상담일 : inquireDate , 답변:inquireAnswer
                답변일: inquireAnswerDate 
	 */
	int inquireNum;
	String inquireKind;
	String inquireSubject;
	String inquireContent;
	String inquireDate;
	String inquireAnswer;
	String inquireAnswerDate;
	public int getInquireNum() {
		return inquireNum;
	}
	public void setInquireNum(int inquireNum) {
		this.inquireNum = inquireNum;
	}
	public String getInquireKind() {
		return inquireKind;
	}
	public void setInquireKind(String inquireKind) {
		this.inquireKind = inquireKind;
	}
	public String getInquireSubject() {
		return inquireSubject;
	}
	public void setInquireSubject(String inquireSubject) {
		this.inquireSubject = inquireSubject;
	}
	public String getInquireContent() {
		return inquireContent;
	}
	public void setInquireContent(String inquireContent) {
		this.inquireContent = inquireContent;
	}
	public String getInquireDate() {
		return inquireDate;
	}
	public void setInquireDate(String inquireDate) {
		this.inquireDate = inquireDate;
	}
	public String getInquireAnswer() {
		return inquireAnswer;
	}
	public void setInquireAnswer(String inquireAnswer) {
		this.inquireAnswer = inquireAnswer;
	}
	public String getInquireAnswerDate() {
		return inquireAnswerDate;
	}
	public void setInquireAnswerDate(String inquireAnswerDate) {
		this.inquireAnswerDate = inquireAnswerDate;
	}
}
