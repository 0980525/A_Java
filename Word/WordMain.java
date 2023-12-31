package Word;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordMain {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// 자료구조는 객체를 담는 변수
		//객체는 반드시 생성(new)해서 list에 add
		ArrayList<Word/*클래스값을 리스트에 저장*/> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		int menu = -1; //
		do {
			//메뉴의 값이 0이면 그만입력, 그 전까지는 계속입력
			System.out.println("단어를 입력하시겠습니까? (계속:1, 그만:0");
			menu = scan.nextInt();
					if(menu == 0) {
						System.out.println("종료");
						break;
					}else {
						System.out.println("단어입력 : ");
						String word = scan.next();
						System.out.println("의미입력");
						String mean = scan.next();
						
						Word w = new Word(word,mean);
						list.add(w);
					}
			
			
		} while (menu !=0);
		//정렬
		Collections.sort(list);
		for (Word tmp : list) {
			System.out.println(tmp);
		}
		scan.close();
	}

}
