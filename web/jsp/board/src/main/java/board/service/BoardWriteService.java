package board.service;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import board.model.BoardDAO;
import board.model.BoardDTO;

public class BoardWriteService {
	public void execute(HttpServletRequest request) {
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		String boardWriter = request.getParameter("boardWriter");
		String boardSubject = request.getParameter("boardSubject");
		String boardContent = request.getParameter("boardContent");
		BoardDTO dto = new BoardDTO();
		dto.setBoardContent(boardContent);
		dto.setBoardSubject(boardSubject);
		dto.setBoardWriter(boardWriter);
		BoardDAO dao = new BoardDAO();
		dao.boardInsert(dto);
	}
}
