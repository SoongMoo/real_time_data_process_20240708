package j20240828;

public class Board {
	private int boardNum;
	private String boardSubject;
	private String boardContent;
	private int readCount;
	// getter
	public int getBoardNum() {
		return boardNum;
	}
	public String getBoardSubject() {
		return boardSubject;
	}
	public String getBoardContent() {
		return boardContent;
	}
	public int getReadCount() {
		return readCount;
	}
	
	// setter
	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}
	public void setBoardSubject(String boardSubject) {
		this.boardSubject = boardSubject;
	}
	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}
	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}
	
	
	
}
