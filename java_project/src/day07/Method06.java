package day07;

import java.util.Scanner;

public class Method06 {

	public static void main(String[] args) {
		/* 구구단 출력
		 * 단 1개 주기, 구구단 출력
		 * 
		 * ----------------
		 * 2-9까지 반복하여 모든 단 출력
		 * 
		 * */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("알고싶은 구구단의 단수를 적어주세요.");
		int num=scan.nextInt();
		mul(num);
		
		scan.close();
		
		System.out.println("----------------------");
		mul(5); //그냥 메서드에 숫자값만 입력해도 출력됨
		System.out.println();
		System.out.println("----------------------");
		System.out.println("2단부터 9단까지");
		for(int i=2;i<=9;i++) {
			mul(i);
			
		}
		
	}
	/* 기능 : 단을 주면 그 단의 구구단을 출력 
	 * 
	 * 리턴없음 void
	 * 매개변수 int num
	 * 메서드명 mul
	 * */

	public static void mul(int num) {
		
	  for (int i=1;i<=9;i++){
		   System.out.println(num+"*"+i+"="+(i*num));
	}
		
		
	}
}
