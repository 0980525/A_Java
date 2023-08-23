package day04;

public class 이중for01 {

	public static void main(String[] args) {
		/* 별찍기
		 * 
		 * *****
		 * *****
		 * *****
		 * *****
		 * *****
		 * 5*5로 별찍기
		 * 
		 * 바깥쪽의 for문이 먼저 실행되고 안쪽의 for문은 순서대로 진행된다. 
		 * 
		 * */
		
		for (int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print("*");
			}
			System.out.println();
			
			
		}
		
		System.out.println("-------------");
		
		/*
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 * 
		 * */
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
		System.out.println();
		}
		
		System.out.println("-------------");
		
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.println("*");
				if (i==j) {break;}
			}
		}
		System.out.println("---------------");
		
		/*
		 * i=1,0=4,*=1
		 * i=2,0=3,*=1
		 * i=3,0=2,*=1
		 * i=4,0=1,*=1
		 * i=5,0=0,*=1
		 * 
		 * */
		//if문
		for(int i=1 ;i<=5 ;i++) {
			
			for (int j=1;j<=5;j++) {
				
				if(j<=5-i) {System.out.print(" ");}
				else { System.out.print("*");}
					
				
			}
			System.out.println();
		}
				
		System.out.println("---------");
		//for문
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5-i;j++){  //j는 공백 1~4까지 돈다
			System.out.print(" ");}
			for(int k=1;k<=i;k++){  //K는 별
				System.out.print("*");}
		System.out.println();
		}
			
		
	}

}
