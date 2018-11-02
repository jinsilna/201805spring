package kr.or.ddit.ioc;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:kr/or/ddit/ioc/application-context-placeholder.xml"})
public class PlaceHolderTest {

	@Resource(name="placeholder")
	private PlaceHolder placeholder;
	
	/**
	 * Method : PlaceHolderTest
	 * 작성자 : pc07
	 * 변경이력 :
	 * Method 설명 : 스프링 설정파일을 통해 placeholder 객체 주입이 정상적으로 이루어지는지 테스트 
	 */
	@Test
	public void PlaceHolderTest() {
	
	/***Given***/
	String user = placeholder.getUser();
	String password = placeholder.getPassword();
	String url = placeholder.getUrl();
	String driver =placeholder.getDriver();
	/***When***/
		
	/***Then***/
	assertEquals("njs",user);
	assertEquals("java",password);
	assertEquals("oracle.jdbc.driver.OracleDriver",driver);
	assertEquals("jdbc:oracle:thin:@localhost:1521:xe",url);
	
	}

}
