package board.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import board.model.BoardDAO;

public class BoardDeleteService {
	@Autowired
	BoardDAO boardDAO;
	public void execute(HttpServletRequest req) {
		int boardNum =
				Integer.parseInt(req.getParameter("boardNum"));
		boardDAO.boardDelete(boardNum);
	}
}