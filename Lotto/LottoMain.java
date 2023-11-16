package Lotto;

import java.util.Scanner;

public class LottoMain {

	public static void main(String[] args) {
		/* 4)LottoMain =>메뉴처리(입력받기)
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
		int menu;
		Scanner scan = new Scanner(System.in);
		LottoManager LM = new LottoManager();
		
		do {
			System.out.println("--Lotto menu--");
			
			System.out.println(" |1.로또번호 입력(수동) |2.로또번호 생성(자동) |3.당첨번호 생성(자동) ");
			System.out.println(" |4.당첨번호 등수체크   |5.당첨번호 리스트 확인 |6.종료 ");
			System.out.println("메뉴선택 > ");
			menu = scan.nextInt();
			switch (menu) {
			case 1 : 
				System.out.println("로또 번호 입력");
				LM.createLotto(scan); 
				break;
			case 2 :
				System.out.println("로또번호 생성(자동)");
				LM.createLottoAuto();
				break;
			case 3 : 
				System.out.println("당첨번호 생성");
				LM.insertLottoAuto();
				break;
			case 4 : 
				System.out.println("당첨번호 등수체크");
				
				break;
			case 5 : 
				System.out.println("당첨번호 리스트 확인");
				LM.printLotto();
				break;
			case 6 : 
				System.out.println("종료합니다.");
				break;
				}
	}
		while(menu != 6);
		System.out.println("프로그램 종료");
		scan.close();

	}

}
