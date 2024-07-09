package r_20240708;

public class Ex17 {
	public static void main(String[] args) {
		// 100~90:A, 89~80:B, 79~70:C, 69~60 : D, 59이하 :F
		int score = 74;
		if(score >= 90) {
			System.out.println("A");
		}else { // 90미만
			if(score >= 80) {
				System.out.println("B");
			}else {// 80미만
				if(score >= 70) {
					System.out.println("C");
				}else {// 70미만
					if(score >= 60) {
						System.out.println("D");
					}else {
						System.out.println("F");
					}
				}
			}
		}
		
	}

}
