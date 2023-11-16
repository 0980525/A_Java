package Lotto;

import java.util.Scanner;

public class LottoManager {
	/* 3)LottoManager =>메뉴의 메서드 처리
	 * 
	 * /* menu
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
	 * */
	
	Lotto us = new Lotto(); //클래스가 왜필요한가 어딜 쪼개야하는가
	LottoE rn = new LottoE();
	
	
	public void createLotto(Scanner scan) {
		us.creatLotto(scan); //중복체크하기
		
	}
	public void  createLottoAuto() {
		rn.createLottoAuto();//중복체크하기
	}		
	public void insertLottoAuto() { //얜 뭘까
		
		
			
					
	}
				
	public void checkLotto() { //등수체크
		
	}
	public void printLotto() { //전체리스트확인
		for(int l : us.getLotto()) {
			System.out.print(l+" ");
		}
	}
	
	
}
