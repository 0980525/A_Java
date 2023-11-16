package day16;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Collection01 {

	public static void main(String[] args) {
		// 컬렉션 프레임워크 : 표준화된 방식의 자료구조
		//List, set Map
		//데이터를 묶러서 관리할때 사용 (배열 대신으로 List)
		/*List
		 * -배열과 동일
		 * -값을 하나씩 저장
		 * -중복을 허용
		 * -index 를 가짐
		 * -배열 대신 가장 많이 사용
		 * 
		 * Set
		 * -값을 하나씩 저장
		 * -중복을 허용 X
		 * -index가 없음 - for문 사용 X, 순서를 보장할 수 없음
		 * 
		 * Map
		 * -값을 두개씩 저장 , key/value 쌍으로 묶어서 저장
		 * -key는 중복 불가, value는 중복가능
		 * -key가 중복되면 덮어쓰기됨
		 * -아이디, 패스워드처럼 같이 묶어서 하나의 자료로 저장할때 사용됨
		 * -순서 보장 X  
		 * 
		 * int arr[] = new int [5]; -기본
		 * collection 에서는 클래스로 데이터를 관리
		 * int -> Integer, String 을 제외한 나머지 자료형은 첫글자만 대문자로 변환하면 클래스가 됨
		 * long->Long, byte ->Byte, double->Double 등
		 * 
		 * 클래스를 지정하지 않으면 Object가 자동 들어간다
		 */
		List<Integer>list = new ArrayList<Integer>(); //일반적인 선언
		ArrayList<Integer>list2 = new ArrayList<Integer>();
		List list3 = new ArrayList(); //Object가 자동 들어간 케이스
	
		//add():리스트에 요소를 추가
		list.add(10);
		list.add(30);
		System.out.println(list);
		
		// size() : list의 개수 리턴 
		
		System.out.println(list.size());
		
		List<String>list4 = new ArrayList</*String 안적어도 ㄱㅊ 앞에만 잘 적으면 됨*/>();
		list4.add("가");
		list4.add("나");
		list4.add("다");
		System.out.println(list4);
		System.out.println(list4.size());
				
		//list2 번에 1-10까지 입력하고 출력
		for(int i=1;i<=10;i++) {
			list2.add(i);
		}
		for(int i=1;i<=10;i++) { //list의 값은 중복 가능
			list2.add(i);
		}
		System.out.println(list2);
		
		//get(index) : index번의 값을 가져오는것 
		System.out.println(list2.get(0) );
		//set(index, 값) : index번의 값을 변경하는 것
		list2.set(0, 3);
		System.out.println(list2);
		//list2 의 모든 요소를 출력
		for(int i=0;i<list2.size();i++) {
			
			//System.out.println( list2.get(i)+" ");
			if(list2.get(i)%2==0) {
				System.out.println(list2.get(i));
			}
		}
		//remove(index) : index 번지값 삭제, remove(object) : object객체 삭제
		list2.remove(0); //0번지의 값 삭제
		System.out.println(list2);
		Integer a = 10;
		list2.remove(a); //지나가다 처음만나는 10을 지움 한번더 반복한다면 두번째 10을 지움
		System.out.println(list2);
		
		//contains (object) : list에 값이 있는지 검사 true/false
		System.out.println("---------------------------");
		System.out.println(list2.contains(a));
		//clear() : 리스트 비움
		list2.clear();
		System.out.println(list2);
		//isEmpty() : list가 비었는지 체크 true/false
		System.out.println(list2.isEmpty());
		//list2에 1-5까지의 값을 추가하고 각 요소를 출력
		for (int i=1;i<=5;i++) {
			list2.add(i);
			
		}
		//향상된 for문
		for(int tmp : list2) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		
		//index를 사용 할 수 없는 컬렉션을 추가하기위해 사용하는 객체
		//Iterator : index가 없는 컬렉션 출력하기 위해 사용
		/* list는 index가 있시때문에 get(i)사용 가능
		 * set, map은 순서를 보장하지 않기때문에 for사용불가
		 * 향상된 for문 Iterator처럼 순서와 상관없이 값을 가져올수 있는 구문에서 출력
		 * 
		 */
		
		System.out.println("> Iterator 출력");
		Iterator<Integer> it = list2.iterator();
		while(it.hasNext()) { //요소가 있는지 체쿠
			Integer tmp = it.next(); //다음 요소 가져오기
			System.out.print(tmp+" ");
		}
		
		System.out.println();
		//indexOf(값) : 값의 index번지를 리턴/ 없으먼-1리턴
		Integer b=5;
		System.out.println(list2.indexOf(b));
		
		//sort(객체)
		/* 객체 : compare인터페이스를 구현한 객체를 넣어야함
		 * 
		 * 
		 */
		list.sort(new Comparator<Integer>() {
			return 02-01;
		});
		
		
		
		
		
	}

}
