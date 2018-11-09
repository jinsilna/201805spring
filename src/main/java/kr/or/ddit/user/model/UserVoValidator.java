package kr.or.ddit.user.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class UserVoValidator implements Validator{

	private Logger logger = LoggerFactory.getLogger(UserVoValidator.class);
	// 메소드 인자로 들어온 clazz 객체가 UserVo로부터 생성 가능한지 여부를 판단
	@Override
	public boolean supports(Class<?> clazz) {
		return UserVo.class.isAssignableFrom(clazz);
	
	}

	//실제 검증 로직 (값이 비어있는지, 글자 수 제한, 정규식, 핸드폰 번호 formatting)
	@Override
	public void validate(Object target, Errors errors) {
		
		// target :  실제 validate를 할 객체 
		// target --> userVo
		UserVo userVo = (UserVo)target;
		
		// 사용자 아이디가 공백이거나 null일때 
		if(userVo.getUserId()==null || userVo.getUserId().equals("")) 
			errors.rejectValue("userId","required");
		
		// pass길이가 null이거나 5보다 작으면 
		if(userVo.getPass()==null || userVo.getPass().length()<5) 
			errors.rejectValue("pass","lengthNotEnough");
			
    	// 사용자 이름이 null이거나 
		if(userVo.getName()==null || userVo.getName().equals("")) 
			errors.rejectValue("name","required"); 
		
	}
}
