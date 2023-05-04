package board.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import board.bean.BoardDTO;

@RestController
//자동으로 문자열, json 반환 
public class BoardController {

	public BoardController() {
		System.out.println("BoardController 기본 생성자");
	}
	
	@GetMapping(value ="/board/hello")
	//@ResponseBody
	//@RestController 를 사용하면 @ResponseBody를 작성하지 않아도 된다. 자동으로 문자열 반환 
	//<-> @Controller 를 사용했다면 사용 해야 한다 
	public String hello(String name) {
		return "안년하세요" + name + "님";
	}
	
	@GetMapping(value= "/board/getBoard")
	public BoardDTO getBoard() {
		BoardDTO boardDTO = new BoardDTO();
		boardDTO.setSeq(1);
		boardDTO.setName("허균");
		boardDTO.setSubject("홍길동");
		boardDTO.setContent("의로운 의적!");
		boardDTO.setLogtime(new Date());
		return boardDTO;
	}
	
	@GetMapping(value= "/board/getBoardList")
	public List<BoardDTO> getBoardList() {
		List<BoardDTO> list = new ArrayList<>();
		
		BoardDTO boardDTO = new BoardDTO();
		boardDTO.setSeq(1);
		boardDTO.setName("허균");
		boardDTO.setSubject("홍길동전");
		boardDTO.setContent("의로운 의적!!!!!");
		boardDTO.setLogtime(new Date());
		list.add(boardDTO);
		
		boardDTO = new BoardDTO();
		boardDTO.setSeq(2);
		boardDTO.setName("이우영");
		boardDTO.setSubject("검정고무신");
		boardDTO.setContent("주인공 기영이의 생활");
		boardDTO.setLogtime(new Date());
		
		list.add(boardDTO);
		
		return list;
	}
}



/*
 
 @RestController는 JSP 같은 뷰를 별도로 만들지 않는 대신에 
 컨트롤러 메소드가 리턴하는 데이터 자체를 클라이언트로 보낸다. 
 클라이언트에 전달되는 데이터는 문자열, DTO, 컬렉션 형태의 자바 객체인데, 자바 객체가 전달되는 경우에는
 자동으로 JSON으로 변환하여 처리하게 된다.
 
 */
