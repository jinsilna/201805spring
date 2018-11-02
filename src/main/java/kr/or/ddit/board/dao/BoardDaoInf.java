package kr.or.ddit.board.dao;

import java.util.List;

import kr.or.ddit.board.model.BoardVo;

public interface BoardDaoInf {
	
	/**
	 * Method : selectBoardList
	 * 작성자 : pc07
	 * 변경이력 :
	 * @return
	 * Method 설명 : boardList 
	 */
	List<BoardVo> selectBoardList();
}
