package r_20240711;

public class Ex01 {
	public static void main(String[] args) {
		//0. 
		for(int i = 0; i < 10; i++) {
			System.out.println("이쓰앰님을 전적으로 믿으셔야합니다.");
		}
		int i = 0;
		while(i < 10) {
			System.out.println("이쓰앰님을 전적으로 믿으셔야합니다.");
			i++;
		}
		//1.
		int sum = 0;
		for(i = 10; i < 20; i+=2) {
			sum += i;
		}
		System.out.println(sum);
		//2.
		sum = 0;
		for(i = 20; i > 10; i-=2 ) {
			sum += i;
		}
		System.out.println(sum);
		// 3.
		for(i = 1; i <= 9; i++) {
			if(i % 2 != 0) {
				System.out.println("6 * " + i + " = " + 6 * i);
			}
		}
		i = 1;
		while(i <= 9) {
			if(i % 2 != 0)
				System.out.println("6 * " + i + " = " + 6 * i);
			i++;
		}
		// 4.
		int gop =1;
		for(i = 0 ; i < 9 ; i++) {
			if(gop % 2 != 0)
				System.out.println("7 * " + gop + " = " + 7 * gop);
			gop++;
		}
		for(i = 0, gop=1; i <= 9; i++, gop++) {
			if(gop % 2 != 0)
				System.out.println("7 * " + gop + " = " + 7 * gop);
		}
		// 5.
		i = 0;
		while(i <= 9) {
			i++;
			if(i % 2 == 0) continue;
			System.out.println("6 * " + i + " = " + 6 * i);
		}
		for(i = 1; i <= 9; i++) {
			if(i % 2 == 0) continue;
			System.out.println("6 * " + i + " = " + 6 * i);
		}
		//6.
		int rnd = (int)(Math.random() * 9)+1;
		for(i = 1; i <= rnd; i++) {
			System.out.println("8 * " + i + " = " + 8 * i);
		}
		// 7. 
		int x = 1;
		int z = 10;
		int g = 4;
		for(i = x ; i <= z ; i+=g) {
			System.out.println(i);
		}
		// 8
		for(int dan =6 ; dan <= 7 ; dan++) {
			System.out.println(dan + "단 시작");
			for( gop = 4; gop <= 6; gop ++) {
				System.out.println(dan + " * " + gop + " = " + dan * gop);
			}
			System.out.println(dan + "단 끝");
		}
		// 9. 
		for(int dan =6 ; dan <= 7 ; dan++) {
			System.out.println(dan + "단 시작");
			for( gop = 4; gop <= 6; gop ++) {
				System.out.print(dan + " * " + gop + " = " + dan * gop +"\t");
			}
			System.out.println();
			System.out.println(dan + "단 끝");
		}
		int dan = 6;
		while(dan<=7) {
			System.out.println(dan + "단 시작");
			gop = 4;
			while(gop <= 6) {
				System.out.print(dan + " * " + gop + " = " + dan * gop +"\t");
				gop++;
			}
			System.out.println();
			System.out.println(dan + "단 끝");
			dan++;
		}
		// 10.
		System.out.println("<table>");
		for(int tr = 0; tr < 4; tr++) {
			System.out.print("<tr>");
			for(int td = 0; td < 4 ; td++) {
				System.out.print("<td>" + (td + 1) + "</td>");
			}
			System.out.println("</tr>");
		}
		System.out.println("</table>");
		// 11. 
		for(int cnt = 1 ; cnt <= 5; cnt++) {
			for(int q = 1; q<=6 ; q++) {
				int rnd1 = (int)(Math.random() * 45)+1;
				System.out.print(rnd1 + "\t");
			}
			System.out.println();
		}
		// 12.
		for(gop = 3; gop <= 8 ; gop++) {
			System.out.println("6 * " + gop + " = " + 6 * gop);
		}
		// 13. 
		for(int cnt = 1 ; cnt <= 6; cnt++) {
			int rnd1 = (int)(Math.random() * 45)+1;
			System.out.print(rnd1 + "\t");
		}
		// 14. 
		for(int i1 = 1, y = 1000 ; i1<= 15 && y >= 0 ; i1++, y-=10) {
			System.out.println("자바는 나의 사랑");
		}
	}
}