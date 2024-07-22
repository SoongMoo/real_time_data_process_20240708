package r_20240722;

import java.util.ArrayList;
import java.util.List;

public class StudentArrayListEx01 {
	public static void main(String[] args) {
		// 배열의 단점 : 크기가 고정
		//             collection(list)
		Student [] stu = new Student[3]; // 객체 배열
		stu[0] = new Student(10001, "이숭무", 176.5, false, 3);
		stu[1] = new Student(10001, "이숭무", 176.5, false, 3);
		stu[2] = new Student(10001, "이숭무", 176.5, false, 3);
		//ArrayIndexOutOfBoundsException
		//stu[3] = new Student(10001, "이숭무", 176.5, false, 3);
		List<String> list = new ArrayList<String>();
		list.add("이숭무");
		// 1. 객체리스트 선언
		List<Student> stuList = new ArrayList<Student>();
		// 2. 객체 저장
		stuList.add(new Student(10001, "이숭무", 176.5, false, 3)); //0
		stuList.add(new Student(10002, "이상범", 177.5, false, 3)); //1
		stuList.add(new Student(10003, "이장범", 178.5, false, 3)); //2
		stuList.add(new Student(10004, "오연의", 176.5, true, 3));  //3
		// 3.수정
		stuList.set(1, new Student(10005, "김찬중", 177.5, false, 3));
		//4. 크기 
		System.out.println(stuList.size());
		//5. 삭제
		Student stu1 = stuList.remove(3);
		System.out.println(stu1.getStudentName());
		//6.출력
		System.out.println(stuList);
		for(Student s : stuList) {
			System.out.println(s.getStudentName());
		}
	}
}