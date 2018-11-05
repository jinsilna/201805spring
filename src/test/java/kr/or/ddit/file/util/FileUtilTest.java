package kr.or.ddit.file.util;

import static org.junit.Assert.*;

import org.junit.Test;

import kr.or.ddit.file.util.FileUtil;

public class FileUtilTest {


	// 테스트 코드를 운영코드보다 먼저 작성하는 방법
	// Test Driven Development (TDD)
	
	/**
	 * Method : getFileExtExists
	 * 작성자 : pc07
	 * 변경이력 :
	 * Method 설명 : 파일 확장자 추출(확장자가 있는경우)
	 */
	@Test
	public void getFileExtExists() {
		/***Given***/
		String fileName = "sally.png";

		/***When***/
		String ext = FileUtil.getFileExt(fileName);
		
		/***Then***/
		assertEquals(".png",ext);
	}
	
	/**
	 * Method : getFileExtNotExists
	 * 작성자 : pc07
	 * 변경이력 :
	 * Method 설명 : 확장자가 없는경우
	 */
	@Test
	public void getFileExtNotExists() {
		/***Given***/
		String fileName = "sally";

		/***When***/
		String ext = FileUtil.getFileExt(fileName);
		
		/***Then***/
		assertEquals("",ext);
	}
	
	/**
	 * Method : getFileExtExistsMultiDot
	 * 작성자 : pc07
	 * 변경이력 :
	 * Method 설명 : 파일명에 . 이 들어가는 경우에 
	 */
	@Test
	public void getFileExtExistsMultiDot() {
		/***Given***/
		String fileName = "sally.bronw.png";

		/***When***/
		String ext = FileUtil.getFileExt(fileName);
		
		/***Then***/
		assertEquals(".png",ext);
	}
}
