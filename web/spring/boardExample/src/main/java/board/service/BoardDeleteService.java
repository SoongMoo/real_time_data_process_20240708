package board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import board.mapper.BoardMapper;

@Service
public class BoardDeleteService {
	@Autowired
	BoardMapper boardMapper;
	public void execute(Integer boardNum) {
		boardMapper.boardDelete(boardNum);
	}
}
