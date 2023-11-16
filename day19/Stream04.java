package day19;

import java.util.ArrayList;
import java.util.Arrays;

public class Stream04 {

	public static void main(String[] args) {
		//Student 클래스를 가지는 List생성
		//5명 정도의 값을 추가
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("홍길동", 60));
		list.add(new Student("김동준", 85));
		list.add(new Student("윤시아", 77));
		list.add(new Student("백도하", 94));
		list.add(new Student("바둑이", 37));
		//stream 구성후 출력
		//toString이 존재할 경우
		list.stream().forEach(System.out::println); //.forEach(n->System.out.println(n+" "));로 해도 toString 있어서 구현됨
		System.out.println("------------");
		//toString이 존재하지않을 경우
		list.stream().forEach(n->{
			String name = n.getName(); //이름, 점수 변수를 만들어 get으로 가져오기
			int score = n.getScore();
			System.out.println(name+" : "+score);
		}); 
		
		//성적 합계출력
		System.out.println("-----------0------------");
		int listSum = list.stream()
				.mapToInt(t->t.getScore()) //점수의 자료형 변환
				.sum();
		System.out.println("--성적에 대한 합계--");
		System.out.println(listSum);
		
		
		//점수가 70점 이상인 인원수 출력
		System.out.println("-----------0------------");
		Long count = list.stream()
				.mapToInt(n->n.getScore())
				.filter(a->a>=70)
				.count();
		
		System.out.println(count);
		//.filter(n->n.getScore()>=70)
		//.forEach(System.out::println);//인원수를 안셈,,ㅎ
		
		
		
		
		
		
		
		
	}

}
