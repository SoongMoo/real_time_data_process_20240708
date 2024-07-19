package r_20240719_wrapper;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {
	String bookName;
	String author;
	public void print() {
		System.out.println("책이름은 " + bookName + "이고 저자는 " + author);
	}
}
