package board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import board.model.BoardDAO;
import board.model.BoardDTO;
import jakarta.servlet.http.HttpServletRequest;
@Service
public class BoardDetailService {
	@Autowired
	BoardDAO boardDAO;
	public void execute(HttpServletRequest req) {
		int boardNum = Integer.parseInt(req.getParameter("boardNum"));
		BoardDTO dto = boardDAO.boardSelectOne(boardNum);
		req.setAttribute("dto", dto);
	}
}







