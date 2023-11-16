package Test;

import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("난수의 개수를 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		
		int u=scan.nextInt();
		int	sum = 0;
		
		for(int i=0;i<u;i++) {
			int r=(int)(Math.random()*99)+1;
			sum+=r;
			
		}
		System.out.print("난수 "+u+"개의 합은"+sum );
		
		
	}

}
