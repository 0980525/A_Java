package Lotto;

import java.util.Scanner;

public class Lotto {
	/*1)Lotto클래스 6개 배열 생성하는 로또클래스
	 *  +추가 수동생성에 대한 메서드
	 *  
	 *  /* menu
 * 1. 로또번호 생성 (수동) : 사용자가 직접입력
 *    -메서드 createLotto(scan) : 
 * 
 * 2. 로또번호 생성 (자동) : 랜덤 6자리
 *    -메서드 createLottoAuto()
 * 3. 당첨번호 생성 (자동) : 랜덤 7자리 ->배열에 저장
 *    -메서드 insertLottoAuto()
 * 4. 당첨번호 리스트 내역 확인 : 1개만 확인 (가장 최신것) =>등수 체크
 *    -메서드 checkLotto()
 *    
 * 5. 당첨번호 리스트 전체확인 
 *   -현재회차 당첨번호가 가장 마지막으로 (위에) 출력
 *   -배열+배열복사 사이즈늘리기
 *   -printLotto()
 * 6. 종료
	 *  */
	//멤버변수배열
	
// 필요없다고 하심,,ㅎ	
//	/*생성자*/
//	public Lotto(String[] lotto) {
//		this.lotto = lotto;
//	}
//
//	//getter/setter
//	public String[] getLotto() {
//		return lotto;
//	}
//	
//	
//	public void setLotto(String[] lotto) {
//		this.lotto = lotto;
//	}
//	

	//사용자의 로또번호
	//1-45까지의 숫자중에 입력을 받아야함
	//입력값이 배열에 저장되어야함
	//저장된 값 출력까지 
	private int []lotto = new int [6];
	
	public void creatLotto(Scanner scan) { 
		//배열 new 만들기!
		
		System.out.println("1-45까지 로또번호 6개를 입력해주세요");
			
		for (int i=0;i<lotto.length;i++) {
		lotto[i]=scan.nextInt();
		
		}
		//System.out.println(lotto[1]); //배열에 값이 들어가는지 확인
		
		}

	public int[] getLotto() {
		return lotto;
	}

	public void setLotto(int[] lotto) {
		this.lotto = lotto;
	}
	

}

