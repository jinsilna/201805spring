package kr.or.ddit.user.web;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.or.ddit.user.service.UserServiceInf;

	/*
	  	[사용자 로그인]
		kr.or.ddit.user.web.UserController
		
		/user/loginView ==> /WEB-INF/view/login/login.jsp
		/user/loginProcess ==> userId == brown / brwonPass
		                       이면 /WEB-INF/view/main.jsp
							   그렇지 않으면 
							   /WEB-INF/view/login/login.jsp
		login.jsp, main.jsp 화면을 jsp/servlet
		수업시간에 만든 결과물과 동일하게 브라우저에
		표시될 수 있도록 개발
	 */
	
@RequestMapping("/user")
@Controller
public class UserController {
	
	private static final String Id = "brown";
	private static final String Pass = "brownpass";
	
	@RequestMapping("/loginView")
	public String loginView() {
		
		/*
		    prefix + viewName + suffix 위치의 리소스로 응답을 위임한다.
		    prefix : /WEB-INF/view/
	        suffix : .jsp
		    viewName : login/login
		    
		    /WEB-INF/view/login/login.jsp   
		 */
		
		return "login/login";		
	}	
	
	@RequestMapping(value="/loginProcess" , method=RequestMethod.POST)
	public String loginProcess(HttpServletRequest request) {
		String userId = request.getParameter("userId");
		String pass = request.getParameter("pass");
		String url; 
		
		if(Id.equals(userId) && Pass.equals(pass)) {
			url = "main";
		}else{
			url = "login/login";
		}
		
		return url;
	}	
}






