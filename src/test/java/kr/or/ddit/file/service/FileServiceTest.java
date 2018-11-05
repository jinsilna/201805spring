package kr.or.ddit.file.service;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.or.ddit.file.model.FileVo;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:kr/or/ddit/config/spring/root-context.xml"})
public class FileServiceTest {

	@Resource(name="fileService")
	private FileServiceInf fileService;

	/*	
	    JUnit
	 	오류가 났었던 이유는? FileService.java에서 @Service 어노테이션을 설정해주지 않았기 때문에.
	 */
	@Test
	public void insertFileTest() {
		
		/***Given***/
		FileVo fileVo = new FileVo();
		
		fileVo.setFile_name("67a8f223-2618-4c46-8629-bc2d5787a111.png");
		fileVo.setOrg_file_name("sally.png");
		fileVo.setFile_ext(".png");
		fileVo.setFile_path("D:\\A_TeachingMaterial\\8.upload");

		/***When***/
		int insertCnt = fileService.insertFile(fileVo);
		
		/***Then***/
		assertEquals(1, insertCnt);
		
	}

}