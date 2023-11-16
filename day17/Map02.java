package day17;

import java.util.HashMap;
import java.util.Map;

public class Map02 {

	public static void main(String[] args) {
		/* map을 이용하여 과목과 점수를 입력하고, 합계와 평균을 출력
		 * 
		 * map - 한사람의 점수
		 * --홍길동
		 * 국어 75
		 * 영어 68
		 * 수학 87
		 * 합계 : 
		 * 평균 : 
		 */
		
		HashMap<String,Integer>map = new HashMap<String,Integer>();
		map.put("국어", 75);
		map.put("영어", 68);
		map.put("수학", 87);
		int sum=0;
		double avg=0;
		
		for(String key : map.keySet()) {
			sum=map.get(key);
			System.out.println(key+":"+map.get(key));
		}
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+((double)sum/map.size));
		

		

	}
}


