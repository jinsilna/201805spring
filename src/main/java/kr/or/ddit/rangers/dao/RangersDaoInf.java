package kr.or.ddit.rangers.dao;

import java.util.List;

import kr.or.ddit.rangers.model.RangerVo;

public interface RangersDaoInf {

	/**
	 * Method : selectAllRangJers
	 * 작성자 : pc07
	 * 변경이력 :
	 * @return
	 * Method 설명 : 레인저스 전체정보가져오기
	 */
	List<RangerVo> selectAllRangers();

	/**
	 * Method : insertRanger
	 * 작성자 : pc07
	 * 변경이력 :
	 * @param ranger
	 * @return
	 * Method 설명 : 레인저스 생성하기 
	 */
	int insertRanger(RangerVo ranger);
	
	
}
