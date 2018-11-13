package kr.or.ddit.user.web;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;

import kr.or.ddit.test.ControllerTestConfig;

public class UserControllerTest extends ControllerTestConfig{

	/**
	 * Method : loginViewTest
	 * 작성자 : pc07
	 * 변경이력 :
	 * Method 설명 : loginViewTest
	 * @throws Exception 
	 */
	@Test
	public void loginViewTest() throws Exception {
		/***Given***/
		MvcResult mvcResult = mockMvc.perform(get("/user/loginView")).andReturn();

		/***When***/
		ModelAndView mav = mvcResult.getModelAndView();
		String viewName = mav.getViewName();
		
		/***Then***/
		assertEquals("login/login", viewName);
	}
	
	/**
	 * Method : loginProcessTest
	 * 작성자 : pc07
	 * 변경이력 :
	 * Method 설명 : loginProcessSuccessTest : 아이디와 비밀번호를 올바르게 줬을경우 
	 * @throws Exception 
	 */
	@Test
	public void loginProcessSuccessTest() throws Exception {
		/***Given***/
		MvcResult mvcResult = mockMvc.perform(post("/user/loginProcess")
				.param("userId", "brown")
				.param("pass", "brownpass")).andReturn();

		/***When***/
		ModelAndView mav = mvcResult.getModelAndView();
		String viewName = mav.getViewName();
		
		/***Then***/
			assertEquals("main", viewName);
			
	}
	
	
	/**
	 * Method : loginProcessFailTest
	 * 작성자 : pc07
	 * 변경이력 :
	 * @throws Exception
	 * Method 설명 : loginProcessFailTest : 아이디와 비밀번호 다르게 줬을경우 
	 */
	@Test
	public void loginProcessFailTest() throws Exception {
		/***Given***/
		MvcResult mvcResult = mockMvc.perform(post("/user/loginProcess")
				.param("userId", "browm")
				.param("pass", "brownface")).andReturn();

		/***When***/
		ModelAndView mav = mvcResult.getModelAndView();
		String viewName = mav.getViewName();
			
		/***Then***/
		assertEquals("login/login", viewName);
	}
	
}





