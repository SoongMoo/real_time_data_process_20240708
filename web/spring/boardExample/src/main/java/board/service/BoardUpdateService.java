package board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import board.command.BoardCommand;
import board.domain.BoardDTO;
import board.mapper.BoardMapper;

@Service
public class BoardUpdateService {
	@Autowired
	BoardMapper boardMapper;
	public void execute(BoardCommand boardCommand ) {
		BoardDTO dto = new BoardDTO();
		dto.setBoardContent(boardCommand.getBoardContent());
		dto.setBoardNum(boardCommand.getBoardNum());
		dto.setBoardSubject(boardCommand.getBoardSubject());
		dto.setBoardWriter(boardCommand.getBoardWriter());
		boardMapper.boardUpdate(dto);
	}
}
