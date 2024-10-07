package board.service;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import board.model.BoardDAO;
import board.model.BoardDTO;

public class BoardUpdateService {
	@Autowired
	BoardDAO boardDAO;
	public void execute(HttpServletRequest req) {
		try {
			req.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		BoardDTO dto = new BoardDTO();
		dto.setBoardNum(
				Integer.parseInt(req.getParameter("boardNum")));
		dto.setBoardWriter(req.getParameter("boardWriter"));
		dto.setBoardSubject(req.getParameter("boardSubject"));
		dto.setBoardContent(req.getParameter("boardContent"));
		boardDAO.boardUpdate(dto);
	}
}
