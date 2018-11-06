package kr.or.ddit.main;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.web.servlet.ModelAndView;

import kr.or.ddit.test.ControllerTestConfig;

public class MainControllerTest extends ControllerTestConfig{

	private Logger logger = LoggerFactory.getLogger(MainControllerTest.class);
	
	
	@Test
	public void MainTest() throws Exception {
		/***Given***/
		MvcResult mvcresult = mockMvc.perform(get("/main")).andReturn();
	
		/***When***/
		ModelAndView mav = mvcresult.getModelAndView();
		
		/***Then***/
		assertEquals("main", mav.getViewName());	
	}	
}
	