package kr.or.ddit.mvc;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.or.ddit.user.model.UserVo;

@RequestMapping("/ajax")
@Controller
public class AjaxController {
	
	private Logger logger = LoggerFactory.getLogger(AjaxController.class); 
	/**
	 * Method : view
	 * 작성자 : pc07
	 * 변경이력 :
	 * @return
	 * Method 설명 : ajax의 테스트를 위한 view 요청 
	 */
	@RequestMapping("/view")
	public String view() {
		return"ajax/view";
	}
	
	/**
	 * Method : getRangers
	 * 작성자 : pc07
	 * 변경이력 :
	 * @return
	 * Method 설명 :json ⇒ java객체 (마샬링/ 언마샬링) 
					마샬링 : 어떤 표기법을 java객체로 바꿀때.
	 */
	@ResponseBody
	@RequestMapping(value="/getRangers", produces= {"application/json"})
	public List<UserVo> getRangers(@RequestBody UserVo userVo) {
		List<UserVo> rangers= new ArrayList<UserVo>();
		logger.debug("json : {} ", userVo);
		
		rangers.add(new UserVo("brown","브라운"));
		rangers.add(new UserVo("sally","샐리"));
		rangers.add(new UserVo("cony","코니"));
		
		return rangers;
	}
}














