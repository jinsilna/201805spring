package kr.or.ddit.ioc;
import static org.junit.Assert.assertNotNull;

import javax.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.or.ddit.board.dao.BoardDaoInf;
import kr.or.ddit.board.service.BoardServiceInf;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={JavaComponentScanConfig.class})
public class JavaComponentScanConfigTest {

	@Resource(name="boardDao")
	private BoardDaoInf boardDao;
	
	
	@Resource(name="boardService")
	private BoardServiceInf boardService;
	
	/**
	 * Method : test
	 * 작성자 : pc07
	 * 변경이력 :
	 * Method 설명 : javaconfig를 통해 스프링 빈이 정상적으로 생성되었는지 테스트 
	 */
	@Test
	public void test() {
		/***Given***/
		

		/***When***/

		/***Then***/
		assertNotNull(boardDao);
		assertNotNull(boardService);
	}

}



















