package kr.or.ddit.ioc;

import static org.junit.Assert.*;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.or.ddit.board.dao.BoardDaoInf;
import kr.or.ddit.board.model.BoardVo;
import kr.or.ddit.board.service.BoardServiceInf;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:kr/or/ddit/ioc/application-context-scan.xml"})
public class ComponentScanTest {

	// class 정보를 가져오기위해서 .class 
	private Logger logger = LoggerFactory.getLogger(ComponentScanTest.class);
	
	@Resource(name="boardDao")
	private BoardDaoInf boardDao;
	
	@Resource(name="boardService")
	private BoardServiceInf boardService;
	
	/**
	 * Method : componentScanTest
	 * 작성자 : pc07
	 * 변경이력 :
	 * Method 설명 : spring annotation scan을통해 (boardDao)
	 * 				 스프링 빈 생성이 정상적으로 되었는지 테스트
	 */
	@Test
	public void componentScanTest() {
		/***Given***/
			

		/***When***/
		List<BoardVo> boardList = boardDao.selectBoardList();
		for(BoardVo boardVo : boardList)
			logger.debug("{}",boardVo);

		
		/***Then***/
		assertNotNull(boardDao);

	}

	
	/**
	 * Method : componentScanTest2
	 * 작성자 : pc07
	 * 변경이력 : spring annotation scan을통해 (boardService)
	 * 				 스프링 빈 생성이 정상적으로 되었는지 테스트
	 * Method 설명 : service
	 */
	@Test
	public void componentScanTest2() {
		
		/***Given***/
		

		/***When***/
		List<BoardVo> boardList2 = boardService.selectBoardList();
		for(BoardVo boardvo : boardList2)
			logger.debug("{}",boardvo);

		/***Then***/
		assertNotNull(boardService);
	}
	
	/**
	 * Method : componentScanTest3
	 * 작성자 : pc07
	 * 변경이력 :
	 * Method 설명 : boardService.getBoarDao()를 통해 리턴받은 boardDao와
	 * 				 ComponentScanTest의 boardDao객체가 동일한 객체인지 확인하는 테스트 코드 
	 */
	@Test
	public void componentScanTest3() {
	
		/***Given***/
		
		/***When***/
			
		/***Then***/
		assertEquals(boardDao, boardService.getBoardDao());
	}
}


































