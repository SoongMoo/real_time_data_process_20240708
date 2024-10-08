package board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import board.domain.BoardDTO;

@Mapper
public interface BoardMapper {
	public void boardInsert(BoardDTO dto);
	public List<BoardDTO> boardSelectAll();
	public BoardDTO boardSelectOne(String boardNum);
}
