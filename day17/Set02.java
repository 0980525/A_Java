package day17;

import java.util.HashSet;

public class Set02 {

	public static void main(String[] args) {
		// Set 생성후 1-45까지 랜덤수 6개 생성 후 출력
		HashSet<Integer>set = new HashSet<Integer>();

		while(set.size()<6) {
			int r = (int)(Math.random()*45)+1;
			set.add(r);
		}
		System.out.println(set);
	

		for(int i=0;set.size()<6;i++) {
			int r = (int)(Math.random()*45)+1;
			set.add(r);
		}
		System.out.println(set);
	}
}
