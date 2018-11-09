package kr.or.ddit.prod.dao;

import java.util.List;
import java.util.Map;

import kr.or.ddit.prod.model.ProdVo;
import kr.or.ddit.user.model.UserVo;
import kr.or.ddit.util.model.PageVo;

public interface ProdDaoInf {
	
	/**
	 * Method : selectBoard
	 * 작성자 : pc07
	 * 변경이력 :
	 * @param boardVo
	 * @return
	 * Method 설명 : 게시판 전체 가져오기 
	 */
	List<ProdVo> BoardCnt();

	
	ProdVo selectBoard(String prod_id);
	
	
	List<ProdVo> selectBoardPageList(PageVo pageVo);
	
	int getBoardCnt();
	
	
}