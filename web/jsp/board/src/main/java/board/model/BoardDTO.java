package board.model;

public class BoardDTO {
	// 테이블의 컬럼명과 같아야 한다.
	int boardNum;
	String boardWriter;
	String boardSubject;
	String boardContent;
	/// setter
	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}
	public void setBoardWriter(String boardWriter) {
		this.boardWriter = boardWriter;
	}
	public void setBoardSubject(String boardSubject) {
		this.boardSubject = boardSubject;
	}
	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}
	// getter
	public int getBoardNum() {
		return boardNum;
	}
	public String getBoardWriter() {
		return boardWriter;
	}
	public String getBoardSubject() {
		return boardSubject;
	}
	public String getBoardContent() {
		return boardContent;
	}
}









