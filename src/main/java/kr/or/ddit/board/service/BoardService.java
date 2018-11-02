package kr.or.ddit.board.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.or.ddit.board.dao.BoardDaoInf;
import kr.or.ddit.board.model.BoardVo;

// annotation을 통해 빈 스캔이 될수 있도록 설정
@Service("boardService")
public class BoardService implements BoardServiceInf {
	
	@Resource(name="boardDao")
	private BoardDaoInf boardDao;
	// 나는 이부분에서 private BoardDaoInf boardDao = new BoardDao(); 
	// 라고 해줘서 오류가 안생김. 그치만 new연산자를 사용하는건 spring이 안됌. 
	// new를안쓰려고 spring을 하는것. 
	
	
	public BoardService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BoardService(BoardDaoInf boardDao) {
		this.boardDao = boardDao;
	}
	
	@Override
	public List<BoardVo> selectBoardList() {
		return boardDao.selectBoardList();
	}

	public BoardDaoInf getBoardDao() {
		return boardDao;
	}

	public void setBoardDao(BoardDaoInf boardDao) {
		this.boardDao = boardDao;
	}

	

	
}
