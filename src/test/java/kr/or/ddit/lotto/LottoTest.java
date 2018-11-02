package kr.or.ddit.lotto;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class LottoTest {

	private LottoTest lottotest;
	
	/**
	 * Method : lottoTest
	 * 작성자 : pc07
	 * 변경이력 :
	 * Method 설명 : 로또 당첨번호 테스트 
	 */
	@Test
	public void lottoTest() {
		
	/***Given***/
	Lotto lotto = new Lotto();
	lotto.setMaxnum(45);
	lotto.setBallnum(5);
	int[] result = lotto.excute();
	
	/***When***/
	
	System.out.println(Arrays.toString(result));
	/***Then***/	
	assertEquals(5, lotto.getBallnum());
	
	}
}
