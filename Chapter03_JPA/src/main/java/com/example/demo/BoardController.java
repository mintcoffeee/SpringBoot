package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {
	@Autowired
	private BoardService boardService;
	
	@GetMapping(value="/board/write")
	public String write() {
		System.out.println("1111");
		boardService.write();
		return "게시판 등록 성공"; //browser에 문자열을 바로 뿌린다. 
	}
	
	@GetMapping(value = "/board/getBoardList")
	public List<BoardDTO> getBoardList() {
		List<BoardDTO> list = boardService.getBoardList();
		
		return list;
	}
}
