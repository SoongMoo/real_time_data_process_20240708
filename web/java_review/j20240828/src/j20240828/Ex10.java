package j20240828;

public class Ex10 {

	public static void main(String[] args) {
		int i0 = 10;
		int i1 = 20;
		int i2 = 30;
		int i [] = new int[3];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		String str0 = new String("이숭무");
		String str1 = new String("이상범");
		String str2 = new String("이장범");
		// 객체배열 
		String str [] = new String[3];
		str[0] = new String("이숭무");
		str[1] = "이상범";
		str[2] = "이장범";
		Inquire inq0 = new Inquire(1, "제목", "배송", "답변");
		Inquire inq1 = new Inquire(2, "제목1", "상품", "답변1");
		Inquire inq2 = new Inquire(3, "제목2", "금액", "답변2");
		// 객체배열
		Inquire inq [] = new Inquire[3];
		inq[0] = new Inquire(1, "제목", "배송", "답변");
		inq[1] = new Inquire(2, "제목1", "상품", "답변1");
		inq[2] = new Inquire(3, "제목2", "금액", "답변2");
		System.out.println(inq0.inqNum);
		System.out.println(inq[0].inqNum);
	}

}
