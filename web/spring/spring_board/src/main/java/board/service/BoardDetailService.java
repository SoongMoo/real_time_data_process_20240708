package board.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import board.model.BoardDAO;
import board.model.BoardDTO;

public class BoardDetailService {
	@Autowired
	BoardDAO boardDAO;
	public void execute(HttpServletRequest req) {
		int boardNum = Integer.parseInt(req.getParameter("boardNum"));
		BoardDTO dto = boardDAO.boardSelectOne(boardNum);
		req.setAttribute("dto", dto);
	}
}







