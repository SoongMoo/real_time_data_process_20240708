package board.service;

import javax.servlet.http.HttpServletRequest;

import board.model.BoardDAO;
import board.model.BoardDTO;

public class BoardDetailService {
	public void execute(HttpServletRequest req) {
		int boardNum = Integer.parseInt(req.getParameter("boardNum"));
		BoardDAO dao = new BoardDAO();
		BoardDTO dto = dao.boardSelectOne(boardNum);
		req.setAttribute("dto", dto);
	}
}







