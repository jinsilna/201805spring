package kr.or.ddit.user.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.annotation.Resource;

import kr.or.ddit.file.dao.FileDaoInf;
import kr.or.ddit.test.ServiceDaoTestConfig;
import kr.or.ddit.user.model.UserVo;
import kr.or.ddit.util.model.PageVo;

import org.junit.Before;
import org.junit.Test;
import org.springframework.stereotype.Repository;

public class UserDaoTest extends ServiceDaoTestConfig{
	
	/*
	   원래는 new 연산자를 통해 불러왔지만 
	   Spring 에서는 @Resource를 통해서 가져온다.
	   그리고 UserDao에서는 @Repository 설정을 해줘야한다. 
	 */
	
	@Resource(name="userDao")
	private UserDaoInf userDao;
	
	private final String TEST_USERID = "natrue";
		
	@Before
	public void setup(){
		userDao.deleteUser(TEST_USERID);
	}
	
	@Test
	public void selectUserAll(){	
	
		/***Given***/ 
		/* UserDao 객체를 생성 */

		/***When***/
		List<UserVo> list = userDao.selectUserAll();
		System.out.println("list : " + list.size());
		System.out.println("list : " + list);
		
		/***Then***/
		           // 예상값 , 결과값 
		assertEquals(118, list.size());
	}
	
	@Test
	public void selectUser(){
		/***Given***/ 
		/* UserDao 객체를 생성 */

		/***When***/
		UserVo userVo = userDao.selectUser("brown");
		
		/***Then***/
		// 예상값 , 결과값 
		assertNotNull(userVo);
		assertEquals("비라운", userVo.getName());
		assertEquals("brown", userVo.getUserId());
	}
	@Test
	public void selectUserByVo(){
		
		/***Given***/ 
		/* UserDao 객체를 생성 */
		
		/***When***/
		UserVo userVo = userDao.selectUser("brown");
		
		System.out.println("brown : " + userVo.toString());
		/***Then***/
	
		assertNotNull(userVo);
		assertEquals("비라운", userVo.getName());
		// 예상값 , 결과값 
		assertEquals("brown", userVo.getUserId());
	}
	
	@Test
	public void slectUserPageList(){
		
		PageVo pagevo = new PageVo();
		
		pagevo.setPage(1);
		pagevo.setPageSize(10);
		
		List<UserVo> userList = userDao.selectUserPageList(pagevo);
		
		assertEquals(1, pagevo.getPage());
		assertEquals(10, pagevo.getPageSize());
		
		
	}
	/**
	 * Method : getUserCntTest
	 * 작성자 : pc07
	 * 변경이력 :
	 * Method 설명 : 사용자 전체 건수 조회 테스트 
	 */
	@Test
	public void getUserCntTest(){
		
		/***Given***/

		/***When***/
		int totalUserCnt = userDao.getUserCnt();
		
		/***Then***/
		assertEquals(118, totalUserCnt);
	}
	
	
	@Test
	public void insertUserTest(){
		
		/***Given***/
		//userVo 준비
		UserVo userVo = new UserVo();
		
		userVo.setUserId("natrue");
		userVo.setPass  ("jinsilna");
		userVo.setName  ("너진실");
		userVo.setAdd1  ("addr1");
		userVo.setAdd2 ("addr2");
		userVo.setZip   ("zip");
		GregorianCalendar gc = new GregorianCalendar(2018,7,8);
		userVo.setBirth(new Date(gc.getTimeInMillis()));
		userVo.setEmail ("email");
		userVo.setTel   ("tel");
		//userVo.setProfile("/path/sally.png");
		      
		/***When***/
		// userDao.insertUser()
		int cnt = userDao.insertUser(userVo);
		
		/***Then***/
		// 입력 건수 비교
		
		assertEquals(1, cnt);
		
		// 필요 X 
		//userDao.deleteUser("userId");
		}
		
//	
//	@Test
//	  // 필요 X 
//	public void deleteUserTest(){
//		//***Given***//
//		UserVo userVo = new UserVo();
//		
//		//***When***//
//		int dlt = userDao.deleteUser("userId");
//		
//		//***Then***//
//		assertEquals(1, dlt);
//	}

}

























