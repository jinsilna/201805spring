package kr.or.ddit.board.service;

import java.util.List;

import kr.or.ddit.board.dao.BoardDaoInf;
import kr.or.ddit.board.model.BoardVo;

public interface BoardServiceInf {

	
	/**
	 * Method : selectBoardList
	 * 작성자 : pc07
	 * 변경이력 :
	 * @return
	 * Method 설명 : boardList 
	 */
	List<BoardVo> selectBoardList();
	
	
	/**
	 * Method : getBoardDao
	 * 작성자 : pc07
	 * 변경이력 :
	 * Method 설명 :  boardService.getBoarDao()를 통해 리턴받은 boardDao와
	 * 				 ComponentScanTest의 boardDao객체가 동일한 객체인지 확인하는 테스트 코드
	 * @return 
	 */
	BoardDaoInf getBoardDao();


	/**
	 * Method : setBoardDao
	 * 작성자 : pc07
	 * 변경이력 :
	 * @param boardDao
	 * Method 설명 : boardService spring bean 등록을위해 setBoardDao
	 */
	void setBoardDao(BoardDaoInf boardDao);
}
