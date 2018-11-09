package kr.or.ddit.main.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	
	/**
	 * Method : main
	 * 작성자 : pc07
	 * 변경이력 :
	 * @return
	 * Method 설명 : main 화면 요청
	 */
	@RequestMapping("/main")
	public String main() {
		return  "main";

		/* 
		 viewName "main"
		 우선순위에 따라서 viewResolver를 검색
		 
		 1.   beanNameViewResolver를 찾는다.
		 1-1. bean id (name)가 "main"인 bean이 있는지를 확인한다. 
		 2.   tilesViewResolver
		 2-1. tiles-config.xml에서 main이라는 이름의 defination이 있는지를 확인. ==> 있다!
		 2-2. 해당 defination에 맞는 layout이 적용된 jsp를 결합하여 응답을 생성.
	
		*/
		
	}
}
