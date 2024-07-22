package r_20240722;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class CaluatorAbstract { //  추상클래스
	int first;
	int second;
	
	public int add() {
		return first + second;
	}
	public abstract int div(); // 추상메서드
}
