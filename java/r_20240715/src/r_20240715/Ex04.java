package r_20240715;

public class Ex04 {

	public static void main(String[] args) {
		Ex04_Board board = new Ex04_Board();
		board.setData(1, "제목1", "내용1", "이숭무");
		board.print();
		Ex04_Board board1 = new Ex04_Board();
		board1.setData(2, "재목1", "내용1", "이상범");
		board1.print();
		board.print();
		board1.print();
		//board1.setData(2, "제목1", "내용1", "이상범");
		board1.setSubject("제목1");
		board1.print();
		Ex04_Board board2 = new Ex04_Board();
		board2.setData(2, "제목2", "내용2", "이장범");
	}

}
