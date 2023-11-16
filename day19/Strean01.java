package day19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Strean01 {

	public static void main(String[] args) {
		/* Stream (스트림) : 자료의 대상과 관계없이 동일한 연산을 수행할 수 있도록 해주는 반복자
		 * 요소가 하나씩 흘러가는 형태로 처리
		 * 스트림을 생성하여 연산을 수행하면 스트림은 소모가 된다
		 * 재사용 불가 -> 다른 연산 수행하려면 다시 스트림 생성해야함
		 * 스트림 연산은 기존 자료를 변경하지 않음
		 * 
		 * 중간연산 : filter (조건에 맞는 요소만 추출),distinct(중복제거)
		 * 			sorted(정렬), map(추출) ....
		 * 최종연산 : sum(),forEach(),reduce(계산)....
		 * 
		 */
		Stream<Integer> integerStream = Stream.of(1,2,3,4,5,6,7,8,9);
		
		int []arr = {10,20,30,40,50};
		IntStream arrStream = Arrays.stream(arr); //Arrays.stream(arr);요 구문만 사용함
		Long cnt = arrStream.count(); //스트림 소모
		//int sum = arrStream.sum(); 한번쓴 스트림은 다시 사용불가
		System.out.println(cnt);
		//System.out.println(sum);
		
		int sum = Arrays.stream(arr).sum();
		System.out.println(cnt);
		System.out.println(sum);
		
		OptionalDouble avg = Arrays.stream(arr).average();
		System.out.println(avg);
		
		int sum1 = Arrays.stream(arr).filter(b->b>=30).sum();
		System.out.println(sum1);
		
		String []str = {"A","B","C","D"};
		Stream <String> stringStream = Arrays.stream(str);
		
		//성적배열에서 70이상인 점수만 합계를 출력
		System.out.println("--------------");
		int [] numArr = {50,78,96,85,46,22,56};
		//기존방식으로 출력
		int sum3 = 0;
		for(int i=0;i<numArr.length;i++) {
			if(numArr[i]>=70) { //실행문 하나면 중괄호 안찍어도됨
				sum3 += numArr[i];
			}
		}
		System.out.println(sum3); //for문 밖에 출력을 찍어줘야 한다
		System.out.println("------------");
		//stream 으로 출력
		int sum2 = Arrays.stream(numArr).filter(n->n>=70).sum();
		System.out.println(sum2);
		System.out.println("----------------");
		//리스트로 스트림 생성
		//리스트로 성적리스트 생성 70이상인 점수만 합계
		ArrayList<Integer> list = new ArrayList<>();
		list.add(79);
		list.add(80);
		list.add(30);
		list.add(16);
		list.add(94);
		list.add(60);
		list.add(44);
		
		//sum = int 스트림에서만 사용가능 map으로 형변환시켜준 후에 sum사용가능
		int listSum = list.stream()
				.filter(n->n>=70)
				.mapToInt(t->t.intValue())
				.sum();
		System.out.println("Integer Stream "+listSum);
		
		Stream<Integer> s = list.stream(); //리스트에서 스트림 사용하는 경우가 가장 많음
		s.filter(b->b>=70).forEach(n->System.out.println(n+" "));
		
		System.out.println(
				list.stream()
				.mapToInt(n->n.intValue())
				.count());
	}

}
