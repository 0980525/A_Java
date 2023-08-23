package day04;

public class Array01 {

	public static void main(String[] args) {
		/* Array 배열 : 같은 타입, 같은 의미를 가지는 변수의 집합(참조변수)
		 * -참조변수는 초기화가 미리되어있음. null or 0
		 * -기본형변수는 초기화를 해주지 않음. 직접해야함
		 * -배열 선언 방법
		 * 타입[]배열이름;
		 * 타입 배열이름[];
		 * 
		 * */
		int[] arr;
		arr=new int[5];
		System.out.println(arr);
		
		
		/*-배열선언 & 초기화
		 * 타입[]배열이름 = new 타입[길이]; //반드시 길이를 붙여줘야한다. 가장 일반적인 방법
		 * 타입[]배열이름 = new 타입[]{값,값,값,값,...}
		 * 타입[]배열이름 = {값,값,값,값,...} //선언과 동시에 초기화를 할때만 가능
		 * -배열의 길이는 0 이상이어야함 (-안됨)
		 * -배열의 길이를 알고싶을때 length 함수로 확인가능
		 * -배열의 시작번지는 0번지부터 시작
		 * 배열 [3] => 0 1 2
		 * -배열의 마지막 번지는 항상 length-1
		 * */
		
		int arr1 [];
		int arr2[]=new int[] {1,2,3,4,5};
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		System.out.println(arr2[3]);
		System.out.println(arr2[4]);
		
		System.out.println(arr2);
		int arr3[]= {1,2,3};
		
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
			}
		
		/*
		 * 배열을 사용하는 이유
		 * 반복문을 이용할 수 있기 때문에 편리함
		 * 관리가 쉽다.
		 * */
		System.out.println();
		System.out.println(arr[0]);
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		for (int i=0; i<arr.length;i++) {
			arr[i]=(i*10)+10;
		}
		
		
		for (int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("-----------------");
		System.out.println("-----------------");
		/*배열 생성, for문으로 1-5로 저장, 출력
		 * */
		int []arr5=new int[5]; //가장 일반적인 방식
		for (int i=0/*배열이 0번지부터라 0으로 시작*/; i<arr5.length;i++) {
			arr5[i]=i+1;
			System.out.print(arr5[i]);
			System.out.println();
		}
		
		System.out.println("-----------------");
		System.out.println("-----------------");
		//arr6번 생성/짝수만 저장하고 출력 
		
//		int[] arr6 = new int[10];
//		for (int i=0;i<arr6.length;i++) {
//			if(i%2==0) { //짝수번지일때만 값을 넣을수 있어서 지금 사용 X
//				arr6[i]=i; //(i+1)*2
//			System.out.println(arr6[i]);}
//			
//			else {continue;}
//		}
		
		int[] arr6 = new int[5];
		for (int i=0;i<arr6.length;i++) {
			arr6[i]=(i+1)*2;
			System.out.println(arr6[i]);}
			

	}

}
