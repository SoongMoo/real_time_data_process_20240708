package j20240828;

public class Ex08 {
	public static void main(String[] args) {
		Board board1 = new Board();
		// board1.boardNum = 1;
		board1.setBoardNum(1);
		board1.setBoardSubject("제목");
		board1.setBoardContent("내용");
		board1.setReadCount(0);
		//System.out.println(board1.boardNum);
		System.out.println(board1.getBoardNum());
 	}
}
