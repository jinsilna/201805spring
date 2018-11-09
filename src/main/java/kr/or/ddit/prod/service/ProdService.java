package kr.or.ddit.prod.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.or.ddit.prod.dao.ProdDao;
import kr.or.ddit.prod.dao.ProdDaoInf;
import kr.or.ddit.prod.model.ProdVo;
import kr.or.ddit.board.model.BoardVo;
import kr.or.ddit.user.dao.UserDaoInf;
import kr.or.ddit.user.model.UserVo;
import kr.or.ddit.util.model.PageVo;

@Service
public class ProdService implements ProdServiceInf {

	@Resource(name="prodDao")
	private ProdDaoInf prodDao;
	
	@Override
	public List<ProdVo> BoardCnt() {
		return prodDao.BoardCnt();
	}

	@Override
	public ProdVo selectBoard(String prod_id) {
		return prodDao.selectBoard(prod_id);
	}

	@Override
	public  Map<String, Object> selectBoardPageList(PageVo pageVo){
		List<ProdVo> prodList = prodDao.selectBoardPageList(pageVo);
		int totalBoardCnt = prodDao.getBoardCnt();
		
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("prodList", prodList);
		resultMap.put("pageCnt", (int)Math.ceil((double)totalBoardCnt/pageVo.getPageSize()));
		
		return resultMap;
	}
	
	
	@Override
	public int getBoardCnt() {
		return prodDao.getBoardCnt();
	}

}
