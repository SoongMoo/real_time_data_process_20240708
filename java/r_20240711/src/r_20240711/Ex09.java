package r_20240711;

public class Ex09 {

	public static void main(String[] args) {
		int i [] = {1,2,3,4,5,6,6,6,6,6,6,6,100};
		/// 마지막요소의 값을 출력
		System.out.println("크기 : " + i.length);
		System.out.println(i[i.length - 1]);
		//  마지막 요소에 값을 저장
		i[i.length - 1] = 200;
		int idx = i.length -1;
		i[idx] = 200;
		System.out.println(i[idx]);

	}

}
