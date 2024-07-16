package r_20240716;

public class Ex04 {

	public static void main(String[] args) {
		Ex04_Employee emp = new Ex04_Employee("1236", "이상범");
		System.out.println(emp.empNum);
		System.out.println(emp.empName);
		System.out.println(emp.empAddr);
		System.out.println(emp.emPhone);
		System.out.println(emp.empGender);
		Ex04_Employee emp1 = new Ex04_Employee("서울", "012-3654-9874",'M');
		System.out.println(emp1.empNum);
		System.out.println(emp1.empName);
		System.out.println(emp1.empAddr);
		System.out.println(emp1.emPhone);
		System.out.println(emp1.empGender);
	}

}
