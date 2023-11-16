package day03;

import java.util.Scanner;

public class for02 {

	public static void main(String[] args) {
		/*num=6 6의 약수를 출력
		 * 약수:나누어서 떨어지는 수/나머지가 0
		 * 6의 약수:1,2,3,6
		 * 12의 약수:1,2,3,4,6,12
		 * 
		 * */
		
		int num=24;
		for(int i=1;i<=num/*1부터 num까지*/;i++) {
			if(num%i==0/*num을 i로 나눠서 나머지가 0이 되어야함!약수를 구해야하니까!*/) {
				System.out.print(i+" ");
			}
		}
		
		
		System.out.println( );
		System.out.println("----------------");
		
		//num을 입력받아서 그 수의 약수를 출력
		Scanner scan=new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num1=scan.nextInt();
		
		for(int i=1;i<=num1;i++) {
			if(num1%i==0) {
				System.out.print(i+" ");
			}
		}
		
		
		
		scan.close();

	}

}
