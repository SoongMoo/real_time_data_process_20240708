package board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import board.domain.BoardDTO;
import board.mapper.BoardMapper;
@Service
public class BoardDetailService {
	@Autowired
	BoardMapper boardMapper;
	public void execute(String boardNum, Model model) {
		BoardDTO dto = boardMapper.boardSelectOne(boardNum);
		model.addAttribute("dto", dto);
	}
}
