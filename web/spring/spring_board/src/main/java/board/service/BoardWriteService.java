package board.service;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import board.model.BoardDAO;
import board.model.BoardDTO;

public class BoardWriteService {
	@Autowired
	BoardDAO boardDAO;
	public void execute(HttpServletRequest req) {
		try {
			req.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		BoardDTO dto = new BoardDTO();
		dto.setBoardContent(req.getParameter("boardContent"));
		dto.setBoardSubject(req.getParameter("boardSubject"));
		dto.setBoardWriter(req.getParameter("boardWriter"));
		boardDAO.boardInsert(dto);
	}
}

