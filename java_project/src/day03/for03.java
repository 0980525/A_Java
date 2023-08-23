package day03;

import java.util.Scanner;

public class for03 {

	public static void main(String[] args) {
		/* 3단을 입력받아서 입력받은 단을 출력
		 * ex) 2 =>
		 * 2*1=2
		 * 2*2=4
		 * ...
		 * 
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("알고싶은 구구단의 단수를 입력해주세요");
		
		int d=scan.nextInt();
		
		for (int i=1;i<=9;i++) {
			System.out.println(d+"*"+i+"="+(d*i));
		}
		scan.close();
		System.out.println();
		System.out.println("-----------");
		
		
	}
	

}
