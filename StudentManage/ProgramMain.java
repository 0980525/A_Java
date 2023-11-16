package StudentManage;

import java.util.Scanner;

public class ProgramMain {

	public static void main(String[] args) {
		/* 메뉴를 출력하여 사용자로 부터 어떤 기능을 수행할 것인지 처리
		 * 1.학생 등록
		 * 2,학생검색
		 * 3.학생리스트
		 * 4.수강신청
		 * 5.수강철회
		 * 6.종료
		 * 
		 */
		Manager m = new Manager();
		Scanner scan = new Scanner(System.in);
//		Student std = new Student();
//		Subject sub = new Subject(); //toString
//		std.Student(2017100598, "이길동",null);
//		System.out.println(std); //toString
//		sub.subprint(070, "국어", 2, "유길동");
		
	
		int menu = 0;
		
		System.out.print("1.학생등록 |2.학생검색 |3.학생리스트 |4.수강신청 |5.수강철회 |6.종료 ");
		
		do {
			System.out.println("수강관리프로그램");
			System.out.println(" 1.학생등록 |2.학생검색 |3.학생리스트 ");
			System.out.println(" |4.수강신청 |5.수강철회 |6.종료 ");
			System.out.println("메뉴선택 > ");
			menu = scan.nextInt();
			switch (menu) {
			case 1 : 
				System.out.println("학생등록메뉴");
				m.insertStudent(scan);
				break;
			case 2 :
				System.out.println("학생검색메뉴");
				m.searchStudent(scan);
				
				break;
			case 3 : 
				System.out.println("학생조회메뉴");
				m.printStudent();
				break;
			case 4 : 
				System.out.println("수강신청메뉴");
				m.registerSubject(scan);
				break;
			case 5 : 
				System.out.println("수강철회메뉴");
				m.deleteSubject(scan);
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


/* menu
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
 * 
 * 클래스에 대한 설명
 * 1)Lotto클래스 6개 배열 생성하는 로또클래스
 *  +추가 수동생성에 대한 메서드
 * 2)LottoE클래스 기존 로또클래스를 상속받아 처리
 *  =>당첨번호  기존배열 (6자리) int bonus만 처리
 * 3)LottoManager =>메뉴의 메서드 처리
 * 4)LottoMain =>메뉴처리(입력받기)
 * */
