package day04;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/*5명의 점수를 입력받아서 배열에 저장하고, 
		 * 점수의 합계와 , 평균을 출력 , 다하면 최고점수 (최고점수 어케하는지 몰겟삼
		 * 
		 * */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("5개의 점수를 입력하세요");
		
//		int num1=scan.nextInt();
//		int num2=scan.nextInt();
//		int num3=scan.nextInt();
//		int num4=scan.nextInt();
//		int num5=scan.nextInt();
//		
//		int arr[]= {num1,num2,num3,num4,num5};
//		
//		int sum = num1+num2+num3+num4+num5;
//		int avg = sum / 5;
//		
//		for (int i=0; i<arr.length;i++) {
//			
//			System.out.println(arr[i]+" ");
//		}
//		
//		System.out.println("합계 : "+sum+", 평균 : "+avg);
		
		/*입력-스캐너
		 * 배열생성-for문은 활용하여 입력받은 점수를 저장
		 * 최댓값-if문으로 비교 / Math.max사용하는 방법*/
		
		
		int arr[]= new int[5];
		int sum = 0;
		double/*처음엔 int로 했었음*/ avg = 0;
		int max = 0;

		for (int i=0; i<arr.length;i++) {
			arr[i]=scan.nextInt();
			sum += arr[i];
			avg=(double)sum/arr.length;
			
			/*최대값구하기
			 *if를 이용*/
			
			if(max<arr[i]) {
				max=arr[i];
				
			}
			
			//Math.max
			max=Math.max(max, arr[i]);
		}
		
		/*최소값구하기*/
		

		
	
		int min = 100;

		for (int i=100; i<arr.length;i++) {
			arr[i]=scan.nextInt();
			
			
			if(min>arr[i]) {
				min=arr[i];
				min=Math.min(min, arr[i]);
		
		
		System.out.println("합계 : "+sum+", 평균 : "+avg+" 최대값 : "+max+", 최소값 : "+min);
		
		//집가서 다시하기
		
		
		
		scan.close();
		
		
		
	}

}
	} }
