package day21;

import java.io.IOException;
import java.util.Scanner;

public class WordMain {

	public static void main(String[] args) throws IOException {
		/* Word package 에서 생성한 Word클래스를 사용하여 단어장 프로그램 작성
		 * 1.단어 등록 |2.단어검색 |3.단어수정 |4.단어출력 |5.단어 삭제 |6.단어파일출력 | 7.종료
		 * Word class ArrayList 로 구성
		 * 기본단어 몇개 등록
		 * 출력시 정렬
		 */
		Scanner scan = new Scanner(System.in);
		WordManager02 wm = new WordManager02();
		int menu = 0;
		
		do {
			System.out.println("--단어장--");
			System.out.println(" 1.단어 등록 |2.단어검색 |3.단어수정 |4.단어출력 |5.단어 삭제 |6.단어파일출력 | 7.종료 ");
			
			System.out.println("메뉴선택 > ");
			menu = scan.nextInt();
			switch (menu) {
			case 1 : 
				wm.addWord(scan);
				
				break;
			case 2 :
				wm.searchWord(scan);
				
				break;
			case 3 : 
				wm.modWord(scan);
				
				break;
			case 4 : 
				wm.printWord();
				
				break;
			case 5 : 
				wm.delWord(scan);
				
				break;
			case 6 : 
				wm.printFile();
				System.out.println("단어 파일 출력!");
				break;
			case 7 : 
				System.out.println("종료!");
				break;
				default:
					System.out.println("잘못된 메뉴입니다.");
				}
	}
		while(menu != 7);
		System.out.println("프로그램을 종료합니다.");
		scan.close();
		
		
	}
}

