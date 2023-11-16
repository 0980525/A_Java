package day19;

import java.util.Arrays;

public class Stream03 {

	public static void main(String[] args) {
		/* 배열에서 짝수만 정렬해서 출력
		 * 
		 */
		int [] arr = {5,4,6,8,25,1,9,258,24,5,3};
		Arrays.stream(arr)  //IntStream arrStream = Arrays.stream(arr); 요거는 선언한거 
		.filter(n->n%2==0)//.으로 이어진 중간연산!!
		.sorted() //정렬
		.distinct() //중복제거
		.forEach(System.out::println); //출력 /비슷한 방법(=.forEach(a->System.out.println(a+" "));
		
		System.out.println();
		System.out.println("--------------");
		
		Arrays.stream(arr)  //IntStream arrStream = Arrays.stream(arr); 요거는 선언한거 
		.filter(n->n%2==1)//.으로 이어진 중간연산!!
		.sorted() //정렬
		.distinct() //중복제거
		.forEach(System.out::println); //출력 /비슷한 방법(=.forEach(a->System.out.println(a+" "));
	
		System.out.println();
		System.out.println("--------------");
		
		//배열로 리턴
		int [] result = Arrays.stream(arr)
				.filter(n->n%2==0)
				.sorted()
				.distinct()
				.toArray(); //배열로 리턴
		for(int tmp : result) {
			System.out.println(tmp);
		}
		System.out.println();
		System.out.println("-------------");
		//reduce() : 계산 a =a-b
		//int a = 1; 초기값
		int sum = Arrays.stream(arr)
				.filter(n->n%2==0)
				.distinct()
				.reduce(1, (a,b)->a*b);
		System.out.println(sum);
		
		
		
		
		
		
		
		}
}
