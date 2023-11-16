package day18;

import java.util.HashMap;
import java.util.Scanner;

public class WordQ {

	public static void main(String[] args) { //9.11-9.12
		/* Word 클래스 (단어장)
		 * 단어 : 의미
		 * hello : 안녕
		 * apple : 사과
		 * banana : 바나나
		 * 
		 * 단어를 추가, 출력 (출력시 단어기준 a-z순으로 정렬)
		 * 검색기능,삭제
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("--단어장 --");
		
		
	}
	
	
	//단어 / 의미 / 전체출력 / 
	

}
class Word{
	private HashMap<String, String> map = new HashMap<String, String>(); 
	
	public void insert(Scanner scan) {
		System.out.println("등록할 단어를 입력해주세요");
		String word = scan.next();
		System.out.println("등록한 단어의 뜻을 입력해주세요");
		String mean = scan.next();
		
		map.put(word, mean);
		
	}
	public void print() {
		
	}


	
}


