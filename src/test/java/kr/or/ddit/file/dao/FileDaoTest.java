package kr.or.ddit.file.dao;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.or.ddit.file.model.FileVo;
import kr.or.ddit.test.ServiceDaoConfig;

public class FileDaoTest extends ServiceDaoConfig{

	// jsp와 다르게 new 연산자 X --> @Resource로 주입을 받는다.
	@Resource(name="fileDao")
	private FileDaoInf fileDao;
	
	/*
	 * Method : insertFileTest
	 * 작성자 : pc07
	 * 변경이력 :
	 * Method 설명 : 파일 정보 입력 테스트 
	 */
	@Test(timeout=5000)
	public void insertFileTest() {
		/***Given***/
		FileVo fileVo = new FileVo();
		
		fileVo.setFile_name("67a8f223-2618-4c46-8629-bc2d5787a111.png");
		fileVo.setOrg_file_name("sally.png");
		fileVo.setFile_ext(".png");
		fileVo.setFile_path("D:\\A_TeachingMaterial\\8.upload");

		/***When***/
		int insertCnt = fileDao.insertFile(fileVo);
		
		/***Then***/
		assertEquals(1, insertCnt);
	}

}
