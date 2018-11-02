package kr.or.ddit.lotto;

import java.util.Arrays;
import java.util.Random;

	/* <lotto 요구사항>
	 1. 사용자로부터 공의 갯수를 입력받을 수 있다.
	    (한국 로또의 경우 45, 미국의 경우 55)
	 2. 추첨 공의 갯수도 사용자로 부터 입력 받을수 있다.
	 3. 실행시 추첨 공의 갯수만큼의 정수를 담은 배열을 리턴 해준다.
	 4. 추첨된 공은 중복 될 수 없다.
	 5. 실행할 수 있는 테스트 코드를 같이 만든다. 
	 */

public class Lotto {

	private int ballnum; // 5
	
	
	private int maxnum;  // 45

	public int[] excute() {
		
		int[] lotto = new int[ballnum];

		for(int i =0 ; i<ballnum ; i++){
			lotto[i] = (int)(Math.random()*maxnum)+1;

			for(int j = 0; j < i; j++){               
				if(lotto[i] == lotto[j]){  
					i--;                                 
					break;                              
				}
			}
		}
		Arrays.sort(lotto); //정렬 
		return lotto;
	}

	public int getMaxnum() {
		return maxnum;
	}

	public void setMaxnum(int maxnum) {
		this.maxnum = maxnum;
	}

	public int getBallnum() {
		return ballnum;
	}

	public void setBallnum(int ballnum) {
		this.ballnum = ballnum;
	}

	public Lotto() {
		super();
	}

}
