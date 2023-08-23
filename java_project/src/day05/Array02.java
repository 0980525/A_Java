package day05;

public class Array02 {

	public static void main(String[] args) {
		/*Array 예제
		 * 5개의 값을 가지는 배열 형선
		 * 1-50사이의 랜덤값을 저장한 후 출력
		 * 
		 * */
		

		
	
//		int arr[]=new int[5];
//		
//		for (int i=0; i<=arr.length;i++) {
//			arr[i]=;
//			
//			int r=(int)(Math.random()*50);
//			System.out.print(arr[i]);
//			System.out.println();}
//
//	}
		int arr[] = new int[5];
		
		for(int i=0; i</*<=표시 사용 X*/arr.length;i++) {
			arr[i]= (int)(Math.random()*50)+1; //안쪽에 만들어야 다른값으로 돌아감
			System.out.print(arr[i]+" ");
		}//뭔가 잘못되었다. 랜덤에 arr대신 int있었음 
		
		System.out.println("----------------");
		
		/*정렬 (오름차순) 이중for문 필요
		 * 임시변수 tmp
		 * int tmp =a;
		 * a=b;
		 * b=tmp;
		 * 
		 * if(arr[0]>arr[1])*/
		
		for(int i=0;i<arr.length-1;i++) {
			
			for(int j=i+1;j<arr.length; j++){
				if (arr[i]>arr[j]){//오름차순
					int tmp = arr[i];
					arr[i]= arr[j];
					arr[j]=tmp;
				}
			}
			
		}
		
		for (int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" "); //또 뭔가 잘못됨
		}
		System.out.println("----------------");
		
		//향상된 for문 
		for(int tmp:arr) {  //12345678910
			System.out.println(tmp+" ");
			
			
		}
				
		
		
		
}
}
