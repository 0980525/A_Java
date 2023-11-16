package day19;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMain {

	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("메뉴에서 기능을 선택하세요");
		int menu = 0;
		private ArrayList<Subject> subList =  new ArrayList<>();
		System.out.print("1.학생등록 |2.학생검색 |3.학생리스트 |4.수강신청 |5.수강철회 |6.종료 ");
		
		do {
			System.out.println("수강관리프로그램");
			System.out.println(" 1.학생등록 |2.학생검색 |3.학생리스트|4.수강신청 |5.수강철회 |6.종료 ");
			System.out.println("메뉴선택 > ");
			menu = scan.nextInt();
			switch (menu) {
			case 1 : 
				System.out.println("학생등록메뉴");
				
				break;
			case 2 :
				System.out.println("학생검색메뉴");
				
				
				break;
			case 3 : 
				System.out.println("학생조회메뉴");
				
				break;
			case 4 : 
				System.out.println("수강신청메뉴");
				
				break;
			case 5 : 
				System.out.println("수강철회메뉴");
				
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
