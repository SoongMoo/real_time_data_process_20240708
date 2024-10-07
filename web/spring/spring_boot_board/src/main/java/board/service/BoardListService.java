package board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import board.model.BoardDAO;
import board.model.BoardDTO;
import jakarta.servlet.http.HttpServletRequest;
@Service
public class BoardListService {
	@Autowired
	BoardDAO boardDAO;
	public void execute(HttpServletRequest req) {
		List<BoardDTO> list = boardDAO.boardSelectAll();
		req.setAttribute("list", list);
	}
}
