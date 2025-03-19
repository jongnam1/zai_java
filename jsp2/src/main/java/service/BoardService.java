package service;

import DAO.BoardDao;
import DTO.Board;
import jakarta.servlet.http.HttpServletRequest;

public class BoardService {

	public void save(HttpServletRequest request) {
		//request 객체에서 파라미터 값 가져와 Board 클래스 객체에저장
		// Board클래스 객체를 DAO에 넘겨주기
		
		
		String writer = request.getParameter("writer");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
	
		Board board= new Board();
		board.setContent(content);
		board.setTitle(title);
		board.setWriter(writer);
		
		BoardDao dao = new BoardDao();
		dao.insert(board);
		
	}
}
