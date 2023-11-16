package day18;

import java.util.TreeSet;

public class Set03 {

	public static void main(String[] args) {
		/*  이것은 자바다 641p 
		 * 검색: ArrayList 유리, LinkedList : 삽입,삭제에 유리
		 * 어떤 List,Set,Map이든 선언 -> 메서드사용 (선언 후 사용이라는 방법은 같지만 내부에서 동작구조가 달라 보여지는게 달라진다.)
		 * 내부 동작 구조가 좀 다름 
		 * 각 List, Set Map마다 본인만의 메서드가 다름
		 */
		//Set : TreeSet:검색에 유리, 순차로 데이터를 정렬해서 저장
		int []score = {80,89,94,78,59,84,56,60,81};
		TreeSet<Integer> set = new TreeSet<>();
		
		for (int i=0; i<score.length;i++) {
			set.add(score[1]);
		}
		System.out.println(set);
		
		//first():가장 앞에있는 값 출력
		//last() : 가장 뒤에있는 값 출력
		System.out.println("최소값 : "+set.first());
		System.out.println("최대값 : "+set.last());
		
		//headSet : 지정된 객체보다 작은 (앞쪽값) 출력
		//tailSet : 지정된 객체보다 큼 값 출력
		
		System.out.println("80보다 작은값 "+set.headSet(80));
		
		//subSet : 범위를 set으로 추출
		//범위검색 70은 포함, 90은 미포한
		System.out.println("70-90사이 "+set.subSet(70, 90));
		
		//내림차순 정렬
		
		
		
	}

}
