package day05;

import java.util.Scanner;

public class Array04 {

	public static void main(String[] args) {
		/* 5자리의 숫자를 한번에 입력받아서/<-여기부터 막힘/ 입력받은 숫자를 거꾸로 출력
		 * 각자리의 합계 출력
		 * ex) 11458 =>85411 =>1+1+4+5+8
		 * */
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		int num = scan.nextInt(); //->여기에 숫자 한번에 입력
		int []arr= new int[5];
		
		//나누기(/), 나머기(%)사용
		//12345=>%10=>5=>배열에 저장
		//값을 나눈 몫만 다시 나눌 값으로 지정
		//12345/10=>정수만 저장
		//1234 %10 ->4 =>배열에 저장
		//123%10->3=>배열에 저장
		//
		
		int sum=0;
		int i=0;
		
		while(num>0) { //입력받은 num가 0보다 작아지면 false
			int b = num % 10; //마지막 자리를 나머지로 받기
			arr[i]=b;
			sum +=b;
			num=num/10; //몫 저장 =>정수/정수=정수
			System.out.println(arr[i]);
			i++;
           }
		System.out.println("sum"+sum);
		
		
//		arr[0]=
//		arr[1]=
//		arr[2]=
//		arr[3]=
//		arr[4]=
//		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr.length;i++) {
//				if(arr[i]<arr[j]) {
//					int tmp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=tmp;
//				}
//				for(int tmp:arr) {  //12345678910
//					System.out.print(tmp+" ");
//				
//			}
//			
//					
//			
//			   }
//			}
//			System.out.println();
//			System.out.println("----------------");
//		
//		
//			
//		scan.close();}
		
	
		
		
		
		
}
}
	
		
		
		
		


		
