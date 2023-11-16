package day17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map01 {

	public static void main(String[] args) {
		/* Map 객체/배열 구분 /map은 객체/
		 * -값을 2개 저장, 값의이름 key / value 
		 * -key중복 불가 / value는 중복을 따지지않음 key에 속해있음
		 * -HashMap을 가장 많이 사용
		 * 
		 * HashMap<String, Integer>map = new HashMap</*String,Integer 생략가능>();
		 * Map은 값이 2개여서 Iterator를 map 자체로는 사용 불가
		 * 향상된 for / Iterator =>set으로 key값 추출 후 사용
		 * 
		 * list,set => .add() 사용
		 * map =>.put() 사용 / KeySet() key값얻어오기 , Values() value값얻어오기
		 */
		HashMap<String,Integer>map = new HashMap<String,Integer>();
		map.put("햄버거", 7000);
		map.put("피자", 8000);
		map.put("goods", 2000);
		System.out.println(map);
		
		System.out.println(map.keySet()); //set
		System.out.println(map.values()); //collection
		
		//key가 햄버거인 가격을 출력
		System.out.println(map.get("햄버거"));
		
		System.out.println("--향상된 for문 출력--");
		//향상된 for문
		for(String tmp : map.keySet()) {
			System.out.println(tmp+":"+map.get(tmp));
		}
		System.out.println("--Iterator 출력--");
		Iterator<String>it = map.keySet().iterator();
		while(it.hasNext()) {
			String tmp = it.next();
			System.out.println(tmp+":"+map.get(tmp));
		}
		//for 문에 Entry - 인터페이스 사용 / entrySet사용
		System.out.println(map.entrySet()); //key밸류가 하나로 묶임
		for(Map.Entry<String, Integer>tmp : map.entrySet()) {
			System.out.println(tmp.getKey()+":"+tmp.getValue());
		}
		System.out.println();
		System.out.println("------");
		
	}

}
