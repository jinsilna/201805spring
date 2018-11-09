package kr.or.ddit.mvc;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.or.ddit.user.model.UserVo;
import kr.or.ddit.user.model.UserVoJsr303;
import kr.or.ddit.user.model.UserVoValidator;

@RequestMapping("/validator")
@Controller
public class VaildatorController {
	// validator를 테스트할 view method 생성 (/WEB-INF/view/validator/view.jsp)
	// view에 대한거라 get방식으로 httpMethod : GET
	@RequestMapping(value="/view",method=RequestMethod.GET)
	public String view() {
		return "validator/view";
	}
		
	// view에서 입력할 값을 처리할 method 생성 
	// 검증절차에서 문제가 있을경우 최초 테스트 view로 가서 메세지를 출력
	// 검증절차에 문제가 없을경우 (WEB-INF/view/validator/result.jsp)로 이동한다.
	// post방식으로 httpMethod : POST
	
	@RequestMapping(value="/validate",method=RequestMethod.POST)
	// BindingResult 객체는 검증하고자 하는 Vo객체 뒤에 메소드 인자로 넣어줘야한다.
	public String validate(UserVo userVo, BindingResult bindingResult , Model model) {
		new UserVoValidator().validate(userVo, bindingResult);
		
		if(bindingResult.hasErrors())
			return "validator/view";
		
		model.addAttribute("userVo",userVo);
		
		return "validator/result";	
		
	}

	@RequestMapping(value="/validateJsr",method=RequestMethod.POST)
	public String validateJsr(@Valid UserVoJsr303 userVoJsr303, BindingResult bindingResult, Model model ) {
		
		if(bindingResult.hasErrors())
			return "validator/view";
		
		model.addAttribute("userVoJsr303",userVoJsr303);
		
		return "validator/result";	
	}
}
