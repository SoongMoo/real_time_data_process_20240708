package boarder.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import boarder.domain.BoardDTO;

@Mapper
public interface BoardMapper {
	public void boardInsert(BoardDTO dto);
	public List<BoardDTO> boardSelectAll();
	public BoardDTO boardSelectOne(Long boardNum);
	public void boardUpdate(BoardDTO dto);
	public void boardDelete(Long boardNum);
}
