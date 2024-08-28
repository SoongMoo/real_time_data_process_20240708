package j20240828;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data // getter/setter
//@Setter // setter
//@Getter // getter
@AllArgsConstructor // 생성자
@NoArgsConstructor // 디펄트 생성자
public class Inquire {
	int inqNum;
	String inqSubject;
	String inqKind;
	String inqAnswer;
}
