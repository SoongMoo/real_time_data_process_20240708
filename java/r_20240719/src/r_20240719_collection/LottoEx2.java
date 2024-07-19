package r_20240719_collection;

import java.util.Arrays;

public class LottoEx2 {
	public static void main(String[] args) {
		int lottoNum [] = new int[6];
		for(int i = 0 ; i <= 5 ; i++) {
			boolean b = true;
			int num = (int)(Math.random() * 45) +1;
			for(int k = 0; k <=5 ; k++) {
				if(lottoNum[k] == num) {
					i--; b = false; break;
				}
			}
			if(b == true)lottoNum[i] = num;
		}
		Arrays.sort(lottoNum);
		for(int i : lottoNum) {
			System.out.print( i +" ");
		}
	}
}
