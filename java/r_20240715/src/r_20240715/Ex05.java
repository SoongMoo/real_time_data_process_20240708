package r_20240715;

public class Ex05 {

	public static void main(String[] args) {
		Ex05_Board board = new Ex05_Board();
		board.setData(1, "제목1", "내용1", "이숭무");
		board.print();
		Ex05_Board board1 = new Ex05_Board();
		board1.setData(2, "재목2", "내용2", "이상범");
		board1.print();
		//board1.subject = "제목2"; // 은닉
		board1.setSubject("제목2");
		board1.print();		
		//              2
		int num = board1.getNum(); // 호출메서드
		// System.out.println(board1.num);
		System.out.println(num);
		System.out.println(board1.getNum());
	}

}
