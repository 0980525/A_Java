package day19;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Stream02 {

	public static void main(String[] args) {
		/* 문자열(이름)을 담는 리스트 생성 후 스트림으로 생성 
		 * 정렬하여 출력
		 * 
		 */
		ArrayList<String> list = new ArrayList<>();
		list.add("kim");
		list.add("lim");
		list.add("lee");
		list.add("hong");
		list.add("seo");
		list.add("noah");
		list.add("pack");
		
		Stream<String>str = list.stream();
		str.sorted().forEach(n->System.out.println(n));
		System.out.println("--------------------");
		//글자수가 4ㄹ이상인 이름
		list.stream()
		.filter(n->n.length()>=4)
		.forEach(System.out::println);
		
		System.out.println("--------");
		//각자 이름의 글자수 출력 
		list.stream()
		.map(n->n.length())
		.forEach(System.out::print);
		
	}

}
