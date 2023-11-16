package day17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class MapEx02_T {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Subject sb = new Subject();
		int menu = -1;
		do {
			sb.print
			menu = scan
			switch(menu) {
			case 1 :break;
			case 2 :break;
			case 3 :break;
			case 4 :break;
			case 5 :break;
			case 6 :break;
				default:
					System.out.println("잘못된 메뉴");
			}
		} while (menu!= 6)
			System.out.println("프로그램 종료"););
	}

}
class Sub{
	private HashMap<String, Integer>map = new HashMap<String, Integer>();
	
	public void printMenu() {
		System.out.println("--성적관리프로그램--");
		System.out.println("1.성적추가 2.성적조회 3.성적조회 | 4.성적수정(서치 후 수정) \\r\\n\"\r\n"
				+ "					+ \"5.성적삭제\\r\\n\"\r\n"
				+ "					+ \"6.종료");
	}
	//성적추가
	public void insert(Scanner scan) {
		System.out.println("과목 / 성적");
		String subject = scan.next();
		int score = scan.nextInt();
		
		if(score <0 || score>100) {
			System.out.println("잘못된 성적입니다.");
			return;
		}
		if(map.get(subject)==null) {
			map.put(subject, score);
		}else {
			System.out.println(subject + " 는 이미 존재합니다.");
		}
		
	}
	//전체출력
	public void print() {
		int sum = 0;
		Iterator<String>it = map.keySet().iterator();
		while(it.hasNext()) {
			String subject = it.next();
			sum+=map.get(subject);
			System.out.println(subject+":"+map.get(subject));
		}
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+(double)sum/map.size());
	}
	
	public void printSub(Scanner scan) {
		System.out.println("조회할 과목 입력 : ");
		String subject = scan.next();
		Integer score = map.get(subject);
		if(score ==null) {
			System.out.println(subject+"는 없는 과목입니다.");
		}else {System.out.println(subject+":"+score);
			}
	}
	
	//과목 수정
	public void modify(Scanner scan) {
		System.out.println("수정할 과목 과 성적 입력");
		String subject = scan.next();
		Integer score = map.get(subject);
		map.put(subject, score);
		map.replace(subject, score); //key 키를 수정
	}
	
	//성적 삭제
	public void delete(Scanner scan) {
		System.out.println("삭제할 과목을 입력");
		String subject = scan.next();
		if(map.get(subject)==null) {
			System.out.println(subject+"없는 과목입니다.");
		}else {
			map.remove(subject);
			System.out.println(subject+"과목이 삭제되었습니다.");
		}
		
		
	}
	
	
	
	
	
	
}