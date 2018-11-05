package kr.or.ddit.file.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.or.ddit.file.dao.FileDao;
import kr.or.ddit.file.dao.FileDaoInf;
import kr.or.ddit.file.model.FileVo;

@Service
public class FileService implements FileServiceInf{

	// 실무에서는 선언적 : 특정환경에서 트랜잭션이 이루어지도록
	// (명시적 : 개발자가 commit, rollback을 직접) 
	// service 이름을 갖는 객체의 모든 메소드에서 트랜잭션이 이루어지도록 예외가 발생하지않으면
	// 자동커밋
	// RuntimeException이 발생하면 자동 rollback
	
	@Resource(name="fileDao")
	private FileDaoInf fileDao;
	
	/**
	 * Method : insertFile
	 * 작성자 : pc07
	 * 변경이력 :
	 * @param fileVo
	 * @return
	 * Method 설명 : 파일 정보 저장 (insert)
	 */
	@Override
	public int insertFile(FileVo fileVo) {
		return fileDao.insertFile(fileVo);
	}

}
