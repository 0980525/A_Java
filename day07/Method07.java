package day07;

import java.util.Scanner;

public class Method07 {

	public static void main(String[] args) {
		/* 숫자와 기호를 주고 기호를 숫자만큼 출력하는 메서드
		 * ex)
		 * 3 ,*을 주면 =>***출력
		 * 5 ,o =>OOOOO출력
		 * 
		 * 
		 * main에서 숫자와 기호를 입력받아 메서드 호출 =>출력
		 * */
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자와 기호를 입력하세요");
		int num = scan.nextInt();
		String str = scan.next();
		insert(num,str);
		
		scan.close();

	}

	/*기능  
	 *  리턴X
	 *  매개변수 int num
	 *  메서드명 insrt
	 * */
	
	public static void insert (int num,String ch) { //리턴 없이 출력, 기호를 숫자만큼!->for문
		for(int i=1;i<=num;i++) {
			System.out.print(ch);
		}
		
	}
	
}
