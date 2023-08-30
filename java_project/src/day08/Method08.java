package day08;

public class Method08 {

	public static void main(String[] args) {
		/*배열이 주어졌을때 배열을 출력하는 메서드 생성
		 * */
		
		int arr[]=new int[] {1,2,9,13,7,5,6,10,4,8,3,11,12,14,15};
		printArray(arr);
		
		/*배열을 받아서 콘솔에 출력하는 메서드
		 * 매개변수 : int arr[]
		 * 리턴타입 : void
		 * 메서드 명 : printArray()
		 * 옆으로 출력 / 5개씩 한줄로 나열
		 * 
		 * */
		System.out.println("------------------");
		list(arr); //배열을 정렬하고
		printArray(arr); //출력
		
		

	}

	public static void printArray(int arr[]) { //5줄씩 만들어주는 메서드
		
		for(int i=0;i<arr.length;i++) {
			if(i%5==0 && i!=0) { //i가 0부터 시작이라 출력이 한줄 비고 시작되는데 그걸 막으려면 i가 0부터시작하지 않도록한다.
				System.out.println();
			}
			System.out.print(arr[i]+" ");
			
		}
//		int row=(int)Math.ceil((double)arr.length / 5);
//		int cnt = 0;
//		for(int i=1;i<=row;i++) { //행
//			for(int j=1;j<=5;j++) { //열
//				System.out.print(arr[cnt]+" ");
//				cnt++;
//				if(cnt==arr.length) {
//					break;
//				}
//			}
//		} -위의 for문과 같다!
		System.out.println();
		
	}
	
	/* 주어진 정수배열을 정렬하는 기능
	 * 배열받아서 리턴X 변수명 
	 * for (;;)
	 * */
	public static void list(int arr[]) { //정렬해주는 메서드
		
//		for(int i=0;i<arr.length;i++) { //
//			
//			
//			if (i%5==0) {
//				System.out.println();
//			}
//			System.out.print(arr[i]+" "); //1-10 순서대로 출력됨
//			}
//			
//		System.out.println();
//		System.out.println("------------");
		
		for(int i=0;i<arr.length-1/*왜 -1까지인가*/;i++) { //정렬을 만들어줌 요거 좀더 자세히 보고 이해해야할듯
			for(int j=i+1;j<arr.length;j++) {
				if (arr[i]>arr[j]){//오름차순
					int tmp/*임시변수*/ = arr[i];
					arr[i]= arr[j]; //덮어쓰기
					arr[j]=tmp;
				}
				
			}
//			for(int tmp:arr) {  //12345678910
//				System.out.print(tmp+" ");
//				}
		}
	}
	
	/* 새로운 배열을 만들어서 랜덤수를 채워 리턴하는 메서드 정렬
	 * 랜덤수 범위 1-100
	 * 배열의 개수 = 매개변수 -매개변수 5개 주면 랜덤 5번 돌아가게끔 int size
	 * 리턴타입 : 배열
	 * 메서드명 : ranArray() 
	 * */
	
	public static int [] ranArray(int size) {
/*	int r =(int) (Math.random()*100)+1;
		int arr1[] = new int[6];
		
		for (int i=1;i<arr1.length;i++) {
			arr1[i]=r;
		System.out.print(arr[r]+" ");}
		--------------------------------------
		int r =(int) (Math.random()*100)+1;
		int arr[] = new int[5];
		
		for (int i=1;i<arr.length;i++) {
			arr[i]=r;
		}
	----------
	public static int [] ranArray() {
		int r =(int) (Math.random()*100)+1;
	int arr1[] = new int[6];
	
	for (int i=1;i<arr1.length;i++) {
		arr1[i]=r;
	System.out.print(arr[r]+" ");}
		return ;
	}
	
	*/
	
	
	
} //class
	

