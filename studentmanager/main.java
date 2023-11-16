package studentmanager;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		/* 학생관리프로젝트
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		StudentManager sm = new StudentManager();
		int menu=0;
		do {
			System.out.println("--메뉴--");
			System.out.println("1.학생추가 | 2.학생리스트 | 3.학생검색
	 * 4.학생수정 | 5. 학생삭제 | 6.과목추가
	 * 7.점수수정 | 8. 과목삭제 | 9.종료");
			menu=scan.nextInt();
	 	switch (menu) {
	 	case 1 :sm.addStd(scan); 	
	 		break;
	 	case 2 :sm.printStd();
	 		break;
	 	case 3 :sm.searchStd(scan);
	 		break;
	 	case 4 :sm.modStd(scan);
	 		break;
	 	case 5 :sm.delStd(scan);
	 		break;
	 	case 6 :sm.addSub(scan);
	 		break;
	 	case 7 :sm.modSub(scan);
	 		break;
	 	case 8 :sm.delSub(scan);
	 		break;
	 	case 9 : break;
	 	}	
		} while (menu != 9);
		System.out.println("종료합니다.");
		
	
	}
	
}
