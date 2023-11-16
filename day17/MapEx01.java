package day17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class MapEx01 {

	public static void main(String[] args) {
		/* map을 이용한 성적관리 프로그램을 생성
		 * --menu--
		 * 1.성적추가
		 * 2.성적조회(전체출력-합계,평균 같이 출력)
		 * 3.성적조회(과목조회-국어=>98점 서치 후 일치하는 과목 출력
		 * 4.성적수정(서치 후 수정) 
		 * 5.성적삭제
		 * 6.종료
		 * CRUD 
		 * C(create-생성) R(read-읽기,조회) U(update-수정) D(delete-삭제)
		 */
		
		/* 스위치사용 메인에 띄우고눌럿을때 수행되도록
		 * 근데 반복이니까 while
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		int exit = -1;
		int choice;
		while(exit != 0) {
			System.out.println("--menu--");
			System.out.println("1.성적추가\r\n"
					+ "2.성적조회(전체출력-합계,평균 같이 출력)\r\n"
					+ "3.성적조회(과목조회-국어=>98점 서치 후 일치하는 과목 출력\r\n"
					+ "4.성적수정(서치 후 수정) \r\n"
					+ "5.성적삭제\r\n"
					+ "6.종료");
			System.out.println("원하는 기능의 숫자를 입력해주세요.");
			choice = scan.nextInt();
			
			String subject;
			int score;
			switch(choice) {
			case 1 : 
				System.out.println("과목과 점수를 입력하세요.");
				subject = scan.next();
				score = scan.nextInt();
				map.put(subject,score);
				break;
			case 2 :
				
				int sum=0;
				for (String key : map.keySet()) {
				sum += map.get(key);
				
				System.out.println("과목 > "+key+" , 점수 > "+map.get(key));
				}
				System.out.println("합계 : "+sum);
				System.out.println("평균 : "+((double)sum/map.size()));
				break;
			case 3 :
				Iterator<String>it = map.keySet().iterator();
				while(it.hasNext()) {
					subject = it.next();
				System.out.println("과목 : "+ subject +" 점수 : "+ map.get(subject));}
				
				break;
			case 4 :
				
				break;
			case 5 : 
				break;
			case 6 : 
				System.out.println("프로그램 종료");
				break;
				
				}//switch
			}//while
		
		}
	
	
}
