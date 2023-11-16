package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Set01 {

	public static void main(String[] args) {
		/* Set : 순서보장 X (index가 없음), 중복 X(중복 걸러주는 일로 사용됨)
		 * HashSet 
		 * 
		 * */
			HashSet<String>set = new HashSet<String>();
			set.add("apple");
			set.add("banana");
			set.add("apple");
			set.add("홍길동 ");
			
			System.out.println(set);
			
			for(String tmp:set) {
				System.out.println(tmp+" ");
			}
			System.out.println();
			System.out.println("--iterator출력--");
			Iterator<String>it = set.iterator();
			
			while(it.hasNext()) {
				String tmp = it.next();
				System.out.println(tmp+" ");
			}
			
			//set을 list로 변환후 정렬
			
			System.out.println();
			System.out.println("------------");
			List<String>list = new ArrayList<String>(set);
			System.out.println(list);
			
			Collections.sort(list);
			System.out.println(list);
			
			
			list.sort(new Comparator<String>() {

				@Override
				public int compare(String o1, String o2) {
					// compareTo
					return o2.compareTo(o1);
				}
				
				
			});
			System.out.println("--");
			System.out.println(list);
	}

}
