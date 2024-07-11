package r_20240711;

public class Ex13 {

	public static void main(String[] args) {
		int[] i = {1,2,3,4};
		System.out.println(i.length); // 크기 :4 
		for(int idx = 0; idx < i.length ; idx++) {
			System.out.println(i[idx]); // i[0],i[1],i[2],i[3]
		}
		//foreach
		for( int val : i  ) {
			System.out.println(val);
		}

	}

}
