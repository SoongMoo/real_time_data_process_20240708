package board.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import board.service.BoardDeleteService;
import board.service.BoardDetailService;
import board.service.BoardListService;
import board.service.BoardUpdateService;
import board.service.BoardWriteService;

@Controller
public class BoardFrontController {
	@RequestMapping("boardList.miso")
	public String boardList(HttpServletRequest req) {
		BoardListService action = new BoardListService();
		action.execute(req);
		return "boardList";
	}
	@GetMapping("boardWrite.miso")
	public String boardWrite() {
		return "boardForm";
	}
	@RequestMapping("boardDetail.miso") // get/post
	public String boardDetail(HttpServletRequest req) {
		BoardDetailService action = new BoardDetailService();
		action.execute(req);
		return "boardDetail";
	}
	@GetMapping("boardModify.miso")
	public String boardModify(HttpServletRequest req) {
		BoardDetailService action = new BoardDetailService();
		action.execute(req);
		return "boardUpdate";
	}
	@RequestMapping("boardDelete.miso")
	public String boardDelete(HttpServletRequest req) {
		BoardDeleteService action = new BoardDeleteService();
		action.execute(req);
		return "redirect:boardList.miso";
	}
	@PostMapping("boardWrite.miso")
	public String boardWrite(HttpServletRequest req) {
		BoardWriteService action = new BoardWriteService ();
		action.execute(req);
		return "redirect:boardList.miso";
	}
	@PostMapping("boardModify.miso")
	public String boardModify1(HttpServletRequest req) {
		BoardUpdateService action = new BoardUpdateService();
		action.execute(req);
		return "redirect:boardDetail.miso?boardNum="+req.getParameter("boardNum");
	}
}









