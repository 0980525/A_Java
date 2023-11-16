package day09;
//class 의 public은 파일명과 일치하는 class에만 가능
//한 파일에 1개만 public class존재
public class MethodEx01 {
	//멤버변수 자리

	//메서드 자리
	public static void main(String[] args) {
		/* num1,num2 숫자 두개를 주고 두수의 합을 리턴
		 * 
		 * 메서드는 메서드를 선언하는 것으로 일을 하지 않음
		 * 
		 * */
		int a = 3;
		int b = 6;
		//호출 : 반복적으로 (여러번) 호출 가능
		int hap = sum(a,b);
		System.out.println(hap);
		
		sum1(b,hap);
		
		//static 이 없는 메서드 호출 ->객체생성이 필요 - 클래스는 MethodEx01
		//같은 클래스안인데도 객체를 생성하는 이유는
		//현재 실행 Method가 static을 포함하는 main메서드이기 때문에
		MethodEx01 me = new MethodEx01(); //객체생성
		int hap2 = me.sum2(b, hap);
		System.out.println(hap2);
		
		

	}
	//다음 메서드자리
	/* 기능 : 두 정수의 합을 리턴하는 메서드
	 * 리텅타입 : 타입만 =>int
	 * 매개변수 : 두 정수 =>int num1, int num2
	 * 
	 * */
	
	public static int sum(int num1,int num2) {
		return num1+num2;
	}
	
	//두수의 합을 리턴하는 메서드 -static빼고
	public int sum2(int num1, int num2) {
		return num1+num2;
	}
	
	
	/* 기능 : 두 정수의 합을 출력하는 메서드
	 * 리턴타입 : void
	 * 매개변수 : int num1,int num2
	 * 
	 * */
	public static void
	sum1(int num1,int num2) {
		System.out.println(num1+num2);
	}
	
	/*메서드 오버로딩 : 같은 이름의 메서드를 여러개 정의하는것
	메서드 오버로딩이 가능하려면 매개변수의 종류가 다르거나, 개수가 다르거나
	메서드는 무슨 값을 받아서 어떤기능을 뽑아쓸지 설계해서 해야함
	리턴타입, 매개변수가 가장 중요! (처리구문까지)*/

}
//클래스자리