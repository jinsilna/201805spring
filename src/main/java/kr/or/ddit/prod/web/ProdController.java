package kr.or.ddit.prod.web;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.or.ddit.prod.model.ProdVo;
import kr.or.ddit.prod.service.ProdServiceInf;
import kr.or.ddit.util.model.PageVo;

@Controller
@RequestMapping("/prod")
public class ProdController {
	
	@Resource(name="prodService")
	private ProdServiceInf prodService;
	
	/**
	 * Method : boardAllList
	 * 작성자 : pc07
	 * 변경이력 :
	 * @return
	 * Method 설명 : prod 전체 글 가져오기 
	 */
	@RequestMapping("/AllList")
	public String prodAllList(Model model) {
		
		List<ProdVo> prodAllList = prodService.BoardCnt();
		model.addAttribute("prodAllList",prodAllList);
		return "prod/prodAllList";
	}
	/**
	 * Method : boardPagingList
	 * 작성자 : pc07
	 * 변경이력 :
	 * @return
	 * Method 설명 : prod 페이지 처리 
	 */
	
	@RequestMapping("/pagingList")
	public String prodPagingList(Model model, PageVo pageVo) {
/*		Map<String, Object> resultMap = prodService.selectBoardPageList(pageVo);
		
		model.addAllAttributes(resultMap);*/
		return "prod/prodPagingList";
	}
	
	
	/**
	 * Method : prodPageListAjax
	 * 작성자 : pc07
	 * 변경이력 :
	 * @param model
	 * @param pageVo
	 * @return
	 * Method 설명 : 페이징처리를 ajax방법으로 (리스트, 페이징처리)
	 */
	@RequestMapping("/prodPageListAjax")
	public String prodPageListAjax(Model model, PageVo pageVo) {
		
		Map<String, Object> resultMap = prodService.selectBoardPageList(pageVo);
		
		model.addAllAttributes(resultMap);
		return "jsonView";
	}
	
	
	
	
	
	/**
	 * Method : boardDetail
	 * 작성자 : pc07
	 * 변경이력 :
	 * @return
	 * Method 설명 : prod 상세 글 가져오기 
	 */
	@RequestMapping("/Detail")
	public String prodDetail(@RequestParam("prod_id") String prod_id, Model model) {
		
		ProdVo prodVo = prodService.selectBoard(prod_id);
		
		model.addAttribute("prodVo",prodVo);
		
		return "prod/prodDetail";
	}
	
	
	
}
