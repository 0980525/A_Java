package Lotto;



public class LottoE {
	/* 2)LottoE클래스 기존 로또클래스를 상속받아 처리
	 *  =>당첨번호  기존배열 (6자리)+ int bonus만 처리
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
	 * */
	
	private int [] ran =new int [6];
	int cnt=0;
	public void createLottoAuto() {
	for(int i=0;i<ran.length;i++) {
		ran[i]=(int)(Math.random()*45);
		cnt++;
	}
	System.out.println("로또번호 생성완료");
	}

	public int[] getRan() {
		return ran;
	}

	public void setRan(int[] ran) {
		this.ran = ran;
	}
//랜덤 6자리 생성+상속가져와서 보너스만 추가?
//
//다음에 매니저한테 가서 7자리배열로 저장될것 
	
	public void insertLottoAuto() {
		int bonus =(int)(Math.random());
		for (int i=0;i<ran.length)
	}
	
	
	
	
}

	

