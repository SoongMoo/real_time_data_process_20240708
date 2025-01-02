package boarder.domain;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("board")
public class BoardDTO {
	Integer boardNum ;
	String boardWriter;
	String boardSubject;
	String boardContent;
}
