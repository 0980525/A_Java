package day07;

public class Method04 {

	public static void main(String[] args) {
		/*메서드 : 기능을 하기 위한 코드조각
		 * 
		 * 접근제한자 리턴타입 메서드명(매개변수){
		 * 코드;
		 * return;
		 * ...(실행 X)
		 * }
		 * 
		 * return : 메서드에서 전달해야하는 값을 전달하는 역할
		 * 메서드에서 return을 만나면 리턴타입의 값을 전달하고, 메서드를 종료
		 * 
		 * 1. 1-100까지 랜덤 정수 5개를 배열에 담는 메서드(정수배열을 리턴)
		 * 2. 1번의 배열을 전달받아서 평균을 연산하는 메서드 (평균을 리턴)
		 * 3. 배열의 정수 5개와 평균을 출력하는 메서드 (출력!리턴 X void)
		 * 메인에서는 연산식이 있으면 안됨
		 * 메서드간의 데이터 전달 및 호출만 있어야함
		 * 까페제출
		 * */
		
		//System.out.println(avg());
		int[] d = randomInt();
		for(int dt : d) {
			System.out.println(dt);
		}
		
		
		
		
	}
	/* 1-100까지 랜덤 정수 5개를 배열에 담는 메서드(정수배열을 리턴)
	 * 리턴타입 정수배열->int[]
	 * 매개변수 X
	 * 메서드명 randomint
	 * */
	public static int [] randomInt(){
	int arr[] = new int[5];
	for(int i=0; i</*<=표시 사용 X*/arr.length;i++) {
		arr[i]= (int)(Math.random()*100); //안쪽에 만들어야 다른값으로 돌아감
		}
	
//	arr[0]=(int)Math.random()*100; 이렇게하면 안나옴
//	arr[1]=(int)Math.random()*100;
//	arr[2]=(int)Math.random()*100;
//	arr[3]=(int)Math.random()*100;
//	arr[4]=(int)Math.random()*100;
	
	return arr;

	
	}
	
//	public static double time(double num1,double num2) {
//		double result = num1*num2;
//		return result;}
//
//	public static double n(int num1,int num2) { //div
//			System.out.println(num1/num2);
//			return (double) num1/num2;	}
//	public static double[] rem2(int num1,int num2) { //
//				
//				double arr[]=new double[2]; //배열의 자리를 생성
//				arr[0]=(double)num1 / num2; //0번지에 넣을 값 생성(몫)
//				arr[1]=(double)num1 % num2; //1번지에 넣을 값 생성(나머지)
//				return arr; //return은 배열(arr)을 return한다.
//			}
	/*1번의 배열을 전달받아서 평균을 연산하는 메서드 (평균을 리턴)
	 * 리턴타입 평균 리턴 -> double
	 * 매개변수 배열 int arr[]
	 * 메서드명 avg*/
	
	public static double avg(int arr[]) {
	int sum=0;
	
	 for(int i=0;i<arr.length;i++) {
		 sum=arr[i];
	 }
		return (double) sum / arr.length;
		
	}
		
	
	
	/*배열의 정수 5개와 평균을 출력하는 메서드 (출력!리턴 X void)
	 * 리턴타입 void
	 * 매개변수 정수배열, 평균
	 * 메서드명 print
	 * */
	public static void print(int arr[],double avg) {
		
	}
	
}


	
	

