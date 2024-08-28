package j20240828;

public class Ex05 {
	public static void main(String[] args) {
		/*
		 * 변수 단점 : 하나의 값만 저장할 수 있다.
		 * 배열 : 여러개의 값을 저장할 수 있다.
		 * 배열단점 : 한 종류의 값만 저장할 수 있다.
		 * class : 여러 종류를 저장하기 
		 */
		int i = 10;
		double d = 10.5;
		String str = "이숭무";
		Goods goods = new Goods();
		/*goods
		 * 	String goodsNum;
			int goodsPrice;
			double weight ; // 중량
			String goodsCompony;
			int qty;
		 */
		goods.goodsNum = "miso_100001";
		goods.goodsPrice = 1000;
		goods.weight = 10;
		goods.goodsCompony = "성결회사";
		goods.qty = 100;
		System.out.println(goods.goodsCompony);
		int i2 = 20;
		Goods goods1 = new Goods(); // 객체지향
		/* goods1
		 * String goodsNum;
			int goodsPrice;
			double weight ; // 중량
			String goodsCompony;
			int qty;
		 */
		goods1.goodsCompony = "이숭무";
		
		
	}
}
