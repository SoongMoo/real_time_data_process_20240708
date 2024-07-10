package r_20240710;

public class Ex11 {

	public static void main(String[] args) {
		// 1 ~ 5까지의 합을 구하시오.
		int i = 1;
		int sum = 0;
		sum = sum + i;
		i = i + 1;
		sum = sum + i;
		i = i + 1;
		sum = sum + i;
		i = i + 1;
		sum = sum + i;
		i = i + 1;
		sum = sum + i;
		i = i + 1;
		System.out.println(sum);
		i = 1;
		sum = 0;
		sum = sum + i++;
		sum = sum + i++;
		sum = sum + i++;
		sum = sum + i++;
		sum = sum + i++;
		System.out.println(sum);
		// 1 ~ 100까지 합을 구하시오.
		sum = 0;
		for(int y = 1; y <= 100 ; y++) {
			sum = sum + y;
		}
		System.out.println(sum);
	}
}
