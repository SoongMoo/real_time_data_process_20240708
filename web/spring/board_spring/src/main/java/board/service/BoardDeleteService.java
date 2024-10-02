package board.service;

import javax.servlet.http.HttpServletRequest;

import board.model.BoardDAO;

public class BoardDeleteService {
	public void execute(HttpServletRequest req) {
		int boardNum =
				Integer.parseInt(req.getParameter("boardNum"));
		BoardDAO dao = new BoardDAO();
		dao.boardDelete(boardNum);
	}
}