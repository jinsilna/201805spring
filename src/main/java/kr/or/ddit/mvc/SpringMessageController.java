package kr.or.ddit.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringMessageController {
	
	/**
	 * Method : messageView
	 * 작성자 : pc07
	 * 변경이력 :
	 * @return
	 * Method 설명 : 국제화 테스트를 위해서 
	 */
	@RequestMapping("/messageView")
	public String messageView() {
		return "msg/view";
	}
}
