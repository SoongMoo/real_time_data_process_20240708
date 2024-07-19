package r_20240719_collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LottoEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> lottoNum = new ArrayList<Integer>();
		System.out.println("원하는 수량을 입력하시오.");
		int cnt = sc.nextInt();
		for(int k = 0; k < cnt; k++) {
			for(int i = 1; i <= 45; i ++) {
				lottoNum.add(i); // 
			}
			int size = lottoNum.size() ;
			for(int y = 1; y <= 6; y ++) {
				size--;
				int idx =  (int)(Math.random() * (size + 1)) ; // 0 ~ 44 
				int num = lottoNum.remove(idx); // 0 ~ 44
				System.out.print(num + " " );
			}
			lottoNum.clear();
			System.out.println();
		}
	}
}