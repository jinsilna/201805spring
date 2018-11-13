package kr.or.ddit.user.dao;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.or.ddit.user.model.UserVo;
import kr.or.ddit.util.model.PageVo;

@Repository
public class UserDao implements UserDaoInf{
	
	@Resource(name="sqlSessionTemplate")
	private SqlSessionTemplate sqlSessionTemplate;
	
	// jspuser 테이블 데이터 전체 조회 
	// Map이 아니고 List로 
	public List<UserVo> selectUserAll(){
		return sqlSessionTemplate.selectList("user.selectUserAll");
	}

	public UserVo selectUser(String userid){
		return sqlSessionTemplate.selectOne("user.selectUser",userid);
		
	}
	
	public UserVo selectUserByVo(UserVo userVo){
		return sqlSessionTemplate.selectOne("user.selectUserByVo",userVo);
		
	}

	@Override
	public List<UserVo> selectUserPageList(PageVo pageVo) {
		return sqlSessionTemplate.selectList("user.selectUserPageList",pageVo);
	}

	/**
	 * Method : getUserCnt
	 * 작성자 : pc07
	 * 변경이력 :
	 * @return
	 * Method 설명 : 사용자 전체 건수 조회 
	 */
	@Override
	public int getUserCnt() {
		return sqlSessionTemplate.selectOne("user.getUserCnt");
	}

	/**
	 * Method : insertUser
	 * 작성자 : pc07
	 * 변경이력 :
	 * @param userVo
	 * @return
	 * Method 설명 : 사용자 등록 
	 */
	@Override
	public int insertUser(UserVo userVo) {
		return sqlSessionTemplate.insert("user.insertUser",userVo);
	}

	/**
	 * Method : deleteUser
	 * 작성자 : pc07
	 * 변경이력 :
	 * @param userId
	 * @return
	 * Method 설명 : 사용자 삭제 
	 */
	@Override
	public int deleteUser(String userId) {
		return sqlSessionTemplate.delete("user.deleteUser",userId);
	
	}
	

	/**
	 * Method : updateUser
	 * 작성자 : pc07
	 * 변경이력 :
	 * @param userId
	 * @return
	 * Method 설명 : 사용자 수정 
	 */
	@Override
	public int updateUser(UserVo userVo) {
		return sqlSessionTemplate.update("user.updateUser",userVo);
	}
}
