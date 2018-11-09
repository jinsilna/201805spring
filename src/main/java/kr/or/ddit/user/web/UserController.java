package kr.or.ddit.user.web;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import kr.or.ddit.user.model.UserVo;
import kr.or.ddit.user.service.UserServiceInf;
import kr.or.ddit.util.model.PageVo;

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

/**
 * UserController.java
 *
 * @author pc07
 * @version 1.0
 * @see
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 * 수정자 수정내용
 * ------ ------------------------
 * pc07 최초 생성
 *
 * </pre>
 */
@RequestMapping("/user")
@Controller
public class UserController {
	
	// @Resource 어노테이션을 통해 userService 를 주입 
	@Resource(name="userService")
	private UserServiceInf userservice;
	
	
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
	
	/**
	 * Method : userAllList
	 * 작성자 : pc07
	 * 변경이력 :
	 * @param model
	 * @return
	 * Method 설명 : 사용자 전체 리스트 
	 */
	@RequestMapping("/userAllList")
	public String userAllList(Model model) {
	
		// userService 사용자 전체 정보조회
		// userService 에서 전체 정보를 가져온다.
		List<UserVo> userList = userservice.selectUserAll();
		model.addAttribute("userList",userList);
		return"user/userAllList";
	}
	
	/**
	 * Method : userPageList
	 * 작성자 : pc07
	 * 변경이력 :
	 * @param model
	 * @return
	 * Method 설명 : 사용자 페이지 리스트
	 */
	@RequestMapping("/userPageList")
	public String userPageList(/*Model model, PageVo pageVo*/) {
		// spring 컨테이너로 부터 bean을 주입받기 때문에 new 연산자를 통해 생성할 필요가 없다.
		
		// PageVo를 메소드 인자로 받아온다.PageVo pageVo 선언
		
		// Map<String, Object> userList = userservice.selectUserPageList(pageVo);
		// addAllAttributes
		// model.addAllAttributes(userList);
		
		return "user/userPageList";
	}
	
	/**
	 * Method : userPageListAjax
	 * 작성자 : pc07
	 * 변경이력 :
	 * @return
	 * Method 설명 : 페이징처리를 Ajax방법으로 (리스트, 페이징)
	 */
	@RequestMapping("/userPageListAjax")
	public String userPageListAjax(Model model, PageVo pageVo) {
		
		Map<String, Object> userList = userservice.selectUserPageList(pageVo);
		
		model.addAllAttributes(userList);
		
		return "jsonView";
	}
	
	/**
	 * Method : userPageListAjaxHtml
	 * 작성자 : pc07
	 * 변경이력 :
	 * @param model
	 * @param pageVo
	 * @return
	 * Method 설명 :페이징처리를 Ajax방법으로 (HTML) 리스트
	 */
	@RequestMapping("/userPageListAjaxHtml")
	public String userPageListAjaxHtml(Model model, PageVo pageVo) {
		
		Map<String, Object> userList = userservice.selectUserPageList(pageVo);
		model.addAllAttributes(userList);
		
		return "user/pageListHtml";
	}
	
	/**
	 * Method : UserPagenationHtml
	 * 작성자 : pc07
	 * 변경이력 :
	 * @param model
	 * @param pageVo
	 * @return
	 * Method 설명 : 페이징처리를 Ajax방법으로 (HTML) 페이징 
	 */
	@RequestMapping("/userPagenationHtml")
	public String UserPagenationHtml(Model model, PageVo pageVo) {
		
		Map<String, Object> userList = userservice.selectUserPageList(pageVo);
		model.addAllAttributes(userList);
		return "user/pagenationHtml";
	}
	
	
	/**
	 * Method : userDetail
	 * 작성자 : pc07
	 * 변경이력 :
	 * @param userId
	 * @return
	 * Method 설명 : 사용자 페이지 리스트 상세 
	 */
	@RequestMapping("/userDetail")
	public String userDetail(@RequestParam("userId") String userId, Model model) {
		
		// @RequestParam 어노테이션을 통해 설정
		
		// 사용자 정보 조회 
		UserVo userVo = userservice.selectUser(userId);
		
		model.addAttribute("userVo", userVo);
		
		return "user/userDetail";
		
	}
	
	
	/**
	 * Method : userFormView
	 * 작성자 : pc07
	 * 변경이력 :
	 * @return
	 * Method 설명 : servlet에서 forword해줬던 그 역할 
	 * return 값에 있는 jsp로 보낸다.
	 * GET 방식 (왜냐? URL을 전송하는것이기 때문
	 */
	@RequestMapping(value="/userForm", method= RequestMethod.GET)
	public String userFormView() {
		return "user/userForm";
	}
	
	/**
	 * Method : userForm
	 * 작성자 : pc07
	 * 변경이력 : 
	 * @return
	 * Method 설명 : 사용자 등록 (프로필도)
	 * POST 방식 
	 */
	
	// profilePic :  profile 이랑 이름이 동일하면안됌. 그래서 prodfile을 profilePic으로 바꿈.
	@RequestMapping(value="/userForm", method=RequestMethod.POST)
	public String userForm(@RequestPart("profilePic") MultipartFile part ,
												HttpServletRequest request,
												UserVo userVo) {
		
		// 인코딩은 따로안해줘도된다. web.xml에서 해줌 
		// Servlet과는 다르게 contentDisposition(파일이름가져오는거) 사용하지않아도됨
	
		// * 한글파일을 추가했을때 한글이 깨지면 ==> Server에 8081부분에 URIencoding="utf-8" 해주기
		
		try {
			if(part.getSize()>0) {
				String path = request.getServletContext().getRealPath("/profile");
				
				String fileName = part.getOriginalFilename();
				
				part.transferTo(new File(path + File.separator + fileName));
							
				// profile
				userVo.setProfile("/profile/"+fileName);
			}else {
				userVo.setProfile("");
			}
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// insert 
		int insertCnt = userservice.insertUser(userVo);
		
		// Servlet : Redirect
		
		return "redirect:/user/userPageList?page=1&pageSize=10";
	}
	
	/**
	 * Method : userUpdate
	 * 작성자 : pc07
	 * 변경이력 :
	 * @return
	 * Method 설명 : 상세화면에서 jsp로 forword하는 처리 
	 * GET 방식 
	 */
	@RequestMapping(value="/userUpdatejsp", method= RequestMethod.GET)
	public String userUpdatejsp(@RequestParam("userId") String userId, Model model) {
		
		UserVo userVo = userservice.selectUser(userId);
		model.addAttribute("userVo",userVo);
		
		return "user/userUpdate";
	}
	
	/**
	 * Method : userUpdate
	 * 작성자 : pc07
	 * 변경이력 :
	 * @return
	 * Method 설명 : 상세화면에서 수정
	 * POST 방식 
	 */
	@RequestMapping(value="/userUpdate", method=RequestMethod.POST)
	public String userUpdate(@RequestPart("profilePic") MultipartFile part,
														HttpServletRequest request,
														UserVo userVo) {
	
		// insert부분이랑 동일하게 했음. 
		try {
			if(part.getSize()>0) {
				String path = request.getServletContext().getRealPath("/profile");
				
				String fileName = part.getOriginalFilename();
				
				part.transferTo(new File(path + File.separator + fileName));
							
				// profile
				userVo.setProfile("/profile/"+fileName);
			}
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		int updateCnt = userservice.updateUser(userVo); 
		
		return "redirect:/user/userDetail?userId="+ userVo.getUserId();
		//return "user/userDetail";
	}
}
























