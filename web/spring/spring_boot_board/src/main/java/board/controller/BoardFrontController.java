package board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import board.service.BoardDeleteService;
import board.service.BoardDetailService;
import board.service.BoardListService;
import board.service.BoardUpdateService;
import board.service.BoardWriteService;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class BoardFrontController {
	@Autowired
	BoardListService boardListService;
	@Autowired
	BoardDetailService boardDetailService;
	@GetMapping("boardList.miso")
	public String boardList(HttpServletRequest req) {
		boardListService.execute(req);
		return "boardList";
	}
	@GetMapping("boardWrite.miso")
	public String boardWrite() {
		return "boardForm";
	}
	// Get/Post
	@RequestMapping("boardDetail.miso")
	public String boardDetail(HttpServletRequest req) {
		boardDetailService.execute(req);
		return "boardDetail";
	}
	@GetMapping("boardModify.miso")
	public String boardModify(HttpServletRequest req) {
		boardDetailService.execute(req);
		return "boardUpdate";
	}
	@Autowired
	BoardDeleteService boardDeleteService;
	@GetMapping("boardDelete.miso")
	public String boardDelete(HttpServletRequest req) {
		boardDeleteService.execute(req);
		return "redirect:boardList.miso" ;
	}
	@Autowired
	BoardWriteService boardWriteService;
	@PostMapping("boardWrite.miso")
	public String boardWrite(HttpServletRequest req) {
		boardWriteService.execute(req);
		return "redirect:boardList.miso";
	}
	@Autowired
	BoardUpdateService boardUpdateService;
	@PostMapping("boardModify.miso")
	public String boardModify1(HttpServletRequest req) {
		boardUpdateService.execute(req);
		return "redirect:boardDetail.miso?boardNum=" +req.getParameter("boardNum");
	}
}





