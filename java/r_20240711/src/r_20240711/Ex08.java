package r_20240711;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dd [] = new double[3];
		int size = 0;
		// 10.5,20.5,30.5를 넣고 저장된 값을 출력하고 싶다.
		// 단 숫자와 length 사용하지 않고 반복문을 사용해서 출력하시오.
		dd [0] = 10.5;size++;
		dd [1] = 20.5;size++;
		dd [2] = 30.5;size++;
		for(int idx = 0; idx < size ; idx++) {
			System.out.println(dd[idx]);
		}
	}

}
