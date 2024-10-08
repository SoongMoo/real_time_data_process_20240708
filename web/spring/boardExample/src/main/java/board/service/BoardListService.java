package board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import board.command.BoardCommand;
import board.domain.BoardDTO;
import board.mapper.BoardMapper;

@Service
public class BoardListService {
	@Autowired
	BoardMapper boardMapper;
	public void execute(BoardCommand boardCommand, Model model) {
		List<BoardDTO> list = boardMapper.boardSelectAll();
		model.addAttribute("list", list);
	}
}







