package board.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import board.model.BoardDAO;
import board.model.BoardDTO;

public class BoardListService {
	public void execute(HttpServletRequest req) {
		BoardDAO dao = new BoardDAO();
		List<BoardDTO> list = dao.boardSelectAll();
		req.setAttribute("list", list);
	}
}
