package kr.or.ddit.mvc;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import java.util.List;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.web.servlet.ModelAndView;

import kr.or.ddit.test.ControllerTestConfig;
   
public class MvcControllerTest extends ControllerTestConfig{

	private Logger logger = LoggerFactory.getLogger(MvcControllerTest.class);

	
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
	@Test
	public void fileuploadTest() throws Exception {
		/***Given***/
		MvcResult mvcResult = mockMvc.perform(get("/mvc/fileupload")).andReturn();

		/***When***/
		ModelAndView mav = mvcResult.getModelAndView();

		/***Then***/
		assertEquals("mvc/fileuploadView", mav.getViewName());
	
	}
}






























