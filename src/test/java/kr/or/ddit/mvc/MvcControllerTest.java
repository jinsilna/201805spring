package kr.or.ddit.mvc;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:kr/or/ddit/config/spring/servlet-context.xml"})
@WebAppConfiguration      
public class MvcControllerTest {

	private Logger logger = LoggerFactory.getLogger(MvcControllerTest.class);
	@Autowired
	private WebApplicationContext ctx; 	 //spring ioc 컨테이너 
	
	private MockMvc mockMvc;             // dispatcher servlet(front Controller 역할)
	
	@Before 
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();
	}
	
	/**
	 * Method : mvcViewTest
	 * 작성자 : pc07
	 * 변경이력 :
	 * Method 설명 : mvcViewTest
	 * @throws Exception 
	 */
	@Test
	public void mvcViewTest() throws Exception {
		/***Given***/
		MvcResult mvcResult = mockMvc.perform(get("/mvc/view")).andReturn();

		/***When***/
		ModelAndView mav = mvcResult.getModelAndView();
		String viewName = mav.getViewName();
		List<String> rangers = (List<String>) mav.getModel().get("rangers");

		/***Then***/
		assertEquals("mvc/view",viewName);
		
		// model 객체에서 rangers 리스트 속성을 받아 사이즈가 3인지 체크하기 
		assertEquals(4, rangers.size());
		
		
		
	}
	
	@Test
	public void mvcViewTest2() throws Exception {
		/***Given***/
		MvcResult mvcResult = mockMvc.perform(get("/mvc/view2")).andReturn();

		/***When***/
		ModelAndView mav = mvcResult.getModelAndView();
		String viewName = mav.getViewName();
		List<String> rangers = (List<String>) mav.getModel().get("rangers");

		/***Then***/
		assertEquals("mvc/view2",viewName);
		
		// model 객체에서 rangers 리스트 속성을 받아 사이즈가 3인지 체크하기 
		assertEquals(3, rangers.size());
		
		
		
	}

}






























