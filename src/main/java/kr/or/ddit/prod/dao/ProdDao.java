package kr.or.ddit.prod.dao;

import java.util.List;

import kr.or.ddit.prod.model.ProdVo;
import kr.or.ddit.config.db.SqlFactoryBuilder;
import kr.or.ddit.user.model.UserVo;
import kr.or.ddit.util.model.PageVo;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;
@Repository
public class ProdDao implements ProdDaoInf{
	
	
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
		SqlSessionFactory factory = SqlFactoryBuilder.getSqlSessionFactory();	
		SqlSession session = factory.openSession();
		// selectOne : 데이터가 한건일때 사용하는것.
		// selectList : 데이터가 여러건일때
		// 메소드 인자  :  문자열 = 네임스페이스( 모듈명 )  , 쿼리 아이디 ( 쿼리) 
		List<ProdVo> boardList = session.selectList("prod.boardCnt");
		session.close();
		return boardList;
	}

	@Override
	public ProdVo selectBoard(String prod_id) {

		SqlSessionFactory factory = SqlFactoryBuilder.getSqlSessionFactory();	
		SqlSession session = factory.openSession();
		// selectOne : 데이터가 한건일때 사용하는것.
		// selectList : 데이터가 여러건일때
		// 메소드 인자  :  문자열 = 네임스페이스( 모듈명 )  , 쿼리 아이디 ( 쿼리) 
		 ProdVo boardvo = session.selectOne("prod.selectBoard",prod_id);
		session.close();
		return boardvo;
	}

	@Override
	public List<ProdVo> selectBoardPageList(PageVo pageVo) {
		SqlSessionFactory factory = SqlFactoryBuilder.getSqlSessionFactory();
		SqlSession session = factory.openSession();
		// selectOne : 데이터가 한건일때 사용하는것.
		// selectList : 데이터가 여러건일때
		// 메소드 인자  :  문자열 = 네임스페이스( 모듈명 )  , 쿼리 아이디 ( 쿼리) 
		List<ProdVo> boardList = session.selectList("prod.selectBoardPageList",pageVo);
		
		session.close();
		return boardList;
	}


	@Override
	public int getBoardCnt() {
		SqlSessionFactory factory = SqlFactoryBuilder.getSqlSessionFactory();
		SqlSession session = factory.openSession();
		// selectOne : 데이터가 한건일때 사용하는것.
		// selectList : 데이터가 여러건일때
		// 메소드 인자  :  문자열 = 네임스페이스( 모듈명 )  , 쿼리 아이디 ( 쿼리) 
		int totalUserCnt= session.selectOne("prod.getBoardCnt");
		session.close();
		
		return totalUserCnt;
	}

}
