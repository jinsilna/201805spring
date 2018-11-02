package kr.or.ddit.ioc;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.or.ddit.board.dao.BoardDaoInf;
import kr.or.ddit.board.model.BoardVo;
import kr.or.ddit.board.service.BoardServiceInf;

public class IocMain {
	
	private static Logger logger = LoggerFactory.getLogger(IocMain.class);
		
	public static void main(String[] args) {
	
		// Spring 컨테이너 생성   
		ApplicationContext context = 
				new ClassPathXmlApplicationContext(new String[] {
						"classpath:kr/or/ddit/ioc/application-context.xml"
		});
		
		// 스프링 컨테이너에서 boardDao 스프링 빈을 요청(DL : Dependency lookup)
		// 실제 web프로그래밍을 사용할때에는 DL을 사용하는 경우는 없다.
		BoardDaoInf boardDao = (BoardDaoInf)context.getBean("boardDao");
		List<BoardVo> boardList = boardDao.selectBoardList();
	
		// 향상된 for문
		for(BoardVo boardVo : boardList)
			
			// logger 의 시초는 (log4j)
			logger.debug("boardVo : {}",boardVo);
		
			// syso은 실무에서 쓰면안된다! 
			// syso의 단점 필요없을때에도 게속 나옴. 지워야 지워진다.. 
			//System.out.println("boardVo : " + boardVo);
	
		//--------------------------------------------------------------------		 
		 /*
		 	스프링 컨테이너에서 boardService 스프링 빈을 요청후 
		 	selectBoardList 결과를 logger를 이용해 console로 출력 
		 */
	
		BoardServiceInf boardService = 
				(BoardServiceInf)context.getBean("boardService");
		List<BoardVo> boardList2 = boardService.selectBoardList();
		for(BoardVo boardVo : boardList)
			logger.debug("boardVo : {}",boardVo);
		
		//---------------------------------------------------------------------
		/*
		   application-context-xml에서 생성 
		    생성자 주입을 통해 생성된 boardService 스프링 빈을 요청 
		*/
		BoardServiceInf boardServiceConst = 
				(BoardServiceInf)context.getBean("boardServiceConst");
		List<BoardVo> boardList3 = boardServiceConst.selectBoardList();
		for(BoardVo boardVo : boardList)
			logger.debug("boardVo : {}",boardVo);
		
		//spring scope-prototype test
		BoardDaoInf boardDaoPrototype1 = 
				context.getBean("boardDaoPrototoype1",BoardDaoInf.class);
		
		BoardDaoInf boardDaoPrototype2 = 
				context.getBean("boardDaoPrototoype1",BoardDaoInf.class);

		logger.debug("spring prototype bean test : {}",boardDaoPrototype1==boardDaoPrototype2);
		
		//spring scope-singleton test
		BoardDaoInf boardDaoSingleton1 = 
				context.getBean("boardDaoSingleton",BoardDaoInf.class);
	
		BoardDaoInf boardDaoSingleton2 = 
				context.getBean("boardDaoSingleton",BoardDaoInf.class);
		
		logger.debug("spring prototype bean test : {}",boardDaoSingleton1==boardDaoSingleton2);
	
	}
}
















