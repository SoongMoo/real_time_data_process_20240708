package board.service;

import javax.servlet.http.HttpServletRequest;

import board.model.BoardDAO;
import board.model.BoardDTO;

public class BoardDetailService {
	public void execute(HttpServletRequest request) {
		int boardNum = Integer.parseInt(request.getParameter("boardNum"));
		BoardDAO dao = new BoardDAO();
		BoardDTO dto = dao.boardSelectOne(boardNum);
		request.setAttribute("dto", dto);
	}
}
