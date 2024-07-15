package r_20240715;

public class Ex08 {

	public static void main(String[] args) {
		Ex08_Board board = new Ex08_Board(); // 기본생성자 
		// 기본 생성자로 만든 객체는 멤버에 값을 저장하기 위해서 setter
		
		board.print();
		Ex08_Board board1 = new Ex08_Board(2, "제목1", "내용1", "이상범");
		board1.print();
	}

}
