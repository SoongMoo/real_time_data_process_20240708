package board.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import board.model.BoardDAO;
import board.model.BoardDTO;

public class BoardListService {
	@Autowired
	BoardDAO boardDAO;
	public void execute(HttpServletRequest req) {
		List<BoardDTO> list = boardDAO.boardSelectAll();
		req.setAttribute("list", list);
	}
}
