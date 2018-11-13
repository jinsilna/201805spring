package kr.or.ddit.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.or.ddit.util.dao.UtilDaoInf;

public class SpringTask {
	
	@Resource(name="utilDao")
	private UtilDaoInf utilDao;
	
	private Logger logger = LoggerFactory.getLogger(SpringTask.class);

	public void logging() {
		logger.debug("LogTask.logging()");
		
	}
	
	/**
	 * Method : makeMothlyCalender
	 * 작성자 : pc07
	 * 변경이력 :
	 * Method 설명 : 매달 마지막날 월 단위 달력 생성하기 
	 * 				 이 메소드가 실행되는 시점은 매달  마지막날 생성
	 * 				 다음달 년월 파라미터를 생성하여 실행 
	 * 				 (2018년 11월 30일 실행==> 201812)
	 **/
	public void makeMothlyCalender() {
		
		Date now = new Date();
		
		//내일 날짜
		GregorianCalendar gc = new GregorianCalendar(Locale.KOREA);
		//GregorianCalendar.DAY_OF_MONTH
		gc.add(GregorianCalendar.DAY_OF_MONTH, 1);
		
		// date --> String (yyyyMM)
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");
		String ym = sdf.format(gc.getTime());
	
		logger.debug("ym : {}", ym);
		utilDao.makeMothlyCalender(ym);
		
	}
}
























