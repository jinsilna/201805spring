package kr.or.ddit.mvc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

@Controller
public class JsonViewController {
	
	@ModelAttribute
	public void modelAttribute(Model model) {
		
		List<String> rangers= new ArrayList<String>();
		rangers.add("conny");
		rangers.add("brown");
		rangers.add("sally");
		// {rangers :["brown","cony","sally"]};
		
		
		// json을 생성하는 view 
		model.addAttribute("rangers",rangers);
	}
	
	/**
	 * Method : jsonView
	 * 작성자 : pc07
	 * 변경이력 :
	 * @return
	 * Method 설명 : json 응답을 생성하는 url 요청 
	 // 레인저스 정보를 json으로 응답을 생성한다.
	 */
	@RequestMapping("/rangersJsonView")
	public String jsonView() {
		
		// json은 하나하나 입력하기가 힘들다.. 
		// 직접작성해야할 문자열을 collection, object 정보를 json문자열로 생성한다.
		//----------------위에 model로 뺐음-------------------------
		// return 하는거 bean name 
		return "jsonView";
		
		/*  
			  controller에서 리턴하는 viewName(jsonview)를 처리하기 위해서 
			  처리해줄 viewResolver를  우선순위에 따라서
			  1.beanNameViewResolver를 통해 view를 생성하려고 시도하게됌.
			  2. jsonView라고 하는 이름의 빈이 있는지 확인 ==> 존재
			  3. 해당 viewName과 동일한 이름의 빈이 있으므로 
			  internalResourceViewResolver까지 가지않고 beanNameViewResolver에서 처리하게됌. 
		*/
		
		/*
		     * 만약 viewName이 "hello"인 경우
		 	   처리해줄 viewResolver를  우선순위에 따라서
			 1. beanNameViewResolver를 통해 view를 생성하려고 시도하게됌.
			 2. jsonView라고 하는 이름의 빈이 있는지 확인 ==> 존재하지않음!
			 	<bean id= "hello"...이런 bean이 있는지?
			 3. 다음 우선순위인 internalResourceViewResolver가 처리하게됌
			 	internalResourceViewResolver는 해당 리소스(hello.jsp)가 있는지 여부를 
			 	상과하지않고 prefix, suffix를 무조건 반영하여 forward를 실행
			 	
			    - 그렇기 때문에 오타, 혹은 존재하지 않는 파일(jsp)을 리턴하게 되면
			 	에러가 발생
			 	- 그런이유로 internalResourceViewResolver는 viewResolver설정시
			 	우선순위를 최 하위로 둔다.
		 */
		

	}
	
	@RequestMapping("/rangersJsonViewObj")
	public View rangersJsonViewObj() {
	
		// json생성을 담당하는 view 
		return new MappingJackson2JsonView();
	}
}































