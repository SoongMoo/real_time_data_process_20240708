package board.service;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import board.model.BoardDAO;
import board.model.BoardDTO;

public class BoardUpdateService {
	public void execute(HttpServletRequest request) {
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		BoardDTO dto = new BoardDTO();
		dto.setBoardContent(request.getParameter("boardContent"));
		dto.setBoardNum(
				Integer.parseInt(request.getParameter("boardNum")));
		dto.setBoardSubject(request.getParameter("boardSubject"));
		dto.setBoardWriter(request.getParameter("boardWriter"));
		BoardDAO dao = new BoardDAO();
		dao.boardUpdate(dto);
	}
}




