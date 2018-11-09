package kr.or.ddit.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.View;

import kr.or.ddit.mvc.view.TimesTablesView;

@Controller
public class CustomViewController {

	// * 안좋은 방법!!!
	// http://localhost:8081/customView 
	@RequestMapping("/customView")
	public View customView() {
		return new TimesTablesView();		
	}
	
	// * 빈 등록하는거 좋은방법!!! **
	// servlet-context.xml에 bean을 등록해준다.
	// http://localhost:8081/customViewBeanName 
	@RequestMapping("/customViewBeanName")
	public String customViewBeanName(Model model) {
		return "timesTablesView";	
	}
}
