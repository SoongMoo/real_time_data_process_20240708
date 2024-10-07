package board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import board.command.BoardCommand;
import board.service.BoardWriteService;

@Controller
public class BoardContoller {
	@Autowired
	BoardWriteService boardWriteService;
	@RequestMapping("boardList")
	public String boardList() {
		return "thymeleaf/board/boardList";
	}
	@GetMapping("boardWrite")  // doGet
	public String boarWrite() {
		return "thymeleaf/board/boardForm";
	}
	@PostMapping("boardWrite") //doPost
	public String boardWrite(BoardCommand boardCommand) {
		boardWriteService.execute(boardCommand);
		return "redirect:boardList";
	}
	
	
}







