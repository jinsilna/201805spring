package kr.or.ddit.prod.dao;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.or.ddit.prod.model.ProdVo;
import kr.or.ddit.util.model.PageVo;
@Repository
public class ProdDao implements ProdDaoInf{
	
	@Resource(name="sqlSessionTemplate")
	private SqlSessionTemplate sqlSessionTemplate;
	
	/**
	 * Method : BoardCnt
	 * 작성자 : pc07
	 * 변경이력 :
	 * @param boardVo
	 * @return
	 * Method 설명 : 게시판 전체 가져오기 
	 */
	@Override
	public List<ProdVo> BoardCnt() {
		return sqlSessionTemplate.selectList("prod.boardCnt");
	}

	@Override
	public ProdVo selectBoard(String prod_id) {
		return sqlSessionTemplate.selectOne("prod.selectBoard",prod_id);
	}

	@Override
	public List<ProdVo> selectBoardPageList(PageVo pageVo) {
		return sqlSessionTemplate.selectList("prod.selectBoardPageList",pageVo);
	}
	
	@Override
	public int getBoardCnt() {
		return sqlSessionTemplate.selectOne("prod.getBoardCnt");
	}

}
