package day16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class List01 {

	public static void main(String[] args) {
		// 하루 일과를 저장한ㄴ list를 생성 < String>
		List<String> time = new ArrayList<>();
		time.add("낮잠자기");
		time.add("점심먹기");
		time.add("공부하기");
		time.add("잠자기");
		
		//향상된 for문으로 출력
		for(String tmp : time) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		System.out.println("----------");
		//Iterator 로 출력
		
		Iterator<String> tt = time.iterator();
		while(tt.hasNext()) { //hasnext 요소다음이 있는지 체쿠
			String tmp = tt.next(); //다음 요소 가져오기
			System.out.print(tmp+" ");
		}
		
		//Collection.sort(list); // 오름차순만 가능
		Collections.sort(time);
		System.out.println();
		System.out.println("----------");
		System.out.println(time);
		
		//sort(Comparator c)  //오름차순, 내림차순 가능
		time.sort(new Test());
		System.out.println(time);
		
	}

}
class Test implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		//compareTo메서드 사용 o2.compareTp(o1) : 내림차순
		
		return o2.compareTo(o1);
	}
	
}