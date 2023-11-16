package day17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

public class Map03 {

	public static void main(String[] args) {  //집가서,,완성하기
		/* 과목, 점수 입력받아 과목 :점수, 합계, 평균 출력
		 * 종료 키워드가 나올때 까지 반복 (키워드 0)
		 * 과목 > 국어 점수 > 89
		 * 다시입력? 종료(0) >
		 * 종료후 과목 : 점수, 합계, 평균 출력
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		System.out.println("--과목이름과 점수를 입력");
		
		int exit =-1;
		while(exit!=0) {
		//입력
		System.out.println("과목, 점수");
//		String subject1 = scan.next();
//		int score = scan.nextInt();
		map.put(scan.next(),scan.nextInt()); //상관없음
		for (String info : map.keySet()) {
		
		System.out.println("과목 > "+info+"점수 > "+map.get(info));
		}
		int sum=0;
		Iterator<String>it = map.keySet().iterator();
		while(it.hasNext()) {
			String subject = it.next();
			sum+=map.get(subject);
			System.out.println(subject+":"+map.get(subject));
					
		}
		
		
		for(String key : map.keySet()) {
			sum=map.get(key);
			//System.out.println(key+":"+map.get(key));
			System.out.println("합계 : "+sum);
			System.out.println("평균 : "+((double)sum/map.size()));
		}
		}
		}
		}
		
	


