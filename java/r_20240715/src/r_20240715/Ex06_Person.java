package r_20240715;

public class Ex06_Person {
	String name; // 은닉
	String phone;
	String addr;
	int age;
	double height;
	boolean gender;
	//setter / getter
	//setData/print
	public void setData(String name, String phone, String addr,
			int age, double height, boolean gender) {
		this.addr= addr;
		this.age = age;
		this.gender = gender;
		this.height = height;
		this.name = name;
		this.phone = phone;
	}
	public void print() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(addr);
		System.out.println(height);
		System.out.println(phone);
		System.out.println(gender);
	}
	// setter
	public void setName(String name) {
		this.name = name;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddr() {
		return addr;
	}
	public int getAge() {
		return age;
	}
	public double getHeight() {
		return height;
	}
	public boolean isGender() {
		return gender;
	}
}
