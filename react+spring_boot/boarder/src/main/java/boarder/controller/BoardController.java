package boarder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import boarder.domain.BoardDTO;
import boarder.mapper.BoardMapper;
//@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api/boards")
public class BoardController {
	@Autowired
	BoardMapper boardMapper;

    @GetMapping
    public List<BoardDTO> getAllBoards() {
        return boardMapper.boardSelectAll();
    }

    @PostMapping
    public void creatBoard(@RequestBody BoardDTO boardDTO) {
    	System.out.println("저장");
        boardMapper.boardInsert(boardDTO);
    }

    @GetMapping("/{id}")
    public BoardDTO getBoardById(@PathVariable Long id) {
        return boardMapper.boardSelectOne(id);
    }

    @PutMapping("/{id}")
    public void updateBoard(@PathVariable Long id, @RequestBody BoardDTO boardDTO) {
        boardMapper.boardUpdate(boardDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteBoard(@PathVariable Long id) {
    	boardMapper.boardDelete(id);
    }
}
