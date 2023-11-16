package day05;

public class Array03 {

	public static void main(String[] args) {
		/*
		 * 1-10담고있는 배열 arr 를 생성후 출력*/
		
		
			int arr[] = new int[10]; //배열 생성
			for(int i=0;i<arr.length;i++) {
				
				arr[i]=i+1; //0부터 시작이라 저장된 값을 1부터 10까지로 만들어줌
				System.out.print(arr[i]+" "); //1-10 순서대로 출력됨
				}
				
			System.out.println();
			System.out.println("------------");
			
			for(int i=0;i<arr.length-1;i++) {
				for(int j=i+1;j<arr.length;j++) {
					if (arr[i]>arr[j]){//오름차순
						int tmp = arr[i];
						arr[i]= arr[j];
						arr[j]=tmp;
					}
					
				}
				for(int tmp:arr) {  //12345678910
					System.out.print(tmp+" ");
					}
			
				 
				}
		
		

}
}