package day06;


public class Method02 {

	public static void main(String[] args) {
		/*메서드를 활용하여 계산기를 작성
		 * 
		 * 기능 : +,-,*,/
		 * 리턴타입 : int, viod-중 /는 double
		 * 매개변수 : 두 정수 int num1 , int num2
		 * 메서드명 : 
		 * + 일때 호출 ->메인에서 출력
		 * - 일때 호출 ->메인에서 출력
		 * 
		 * void 사용
		 * * 일때 호출 ->메서드에서 출력
		 * / 일때 호출 ->메서드에서 출력 =>리턴 double
		 * % 일때 호출 ->메인에서 출력
		 * */
		 
		
		int sum= p(3,9);
		System.out.println(sum);
		
		int M=M(6,8);
		System.out.println(M);
		
		t(6,9);
		
		n(9,3);
		
		a(9,3);
		
		int method01 = Method01.sum(30, 20); //Method01 클래스에서 정의한 메서드
		System.out.println(method01);
		
		//다른클래스에 있는 메서드를 사용 (static이 있는 경우 =(클래스명.메서드명)을 적어 불러올수 있음
		//클래스 => 정의서 => 객체를 생성해서 메서드를 사용
		//현재시점에서 객체생성없이 메서드를 사용할수 있는 이유는 static때문
		//static이 없는 경우 선언만 해놓고 생성이 안되어있다는 것을 의미->객체를 생성 ->클래스가 필요
		Method02 me = new Method02();
		int s=me.p(3,45);
		System.out.println("me객체 생성후 p 호출"+s);
				

	}
	
	public static int p (int num1,int num2) { //add
		return num1+num2;
	}

	public static int M (int num1,int num2) { //sub
		int result = num1-num2;
		return result;
	}
	
	public static void t(int num1,int num2) { //mul
		System.out.println(num1 * num2);
	}
	
	public static double n(int num1,int num2) { //div
		System.out.println(num1/num2);
		return (double) num1/num2;
	}
	
	public static void a(int num1,int num2) { //rem
		System.out.println(num1%num2);
	}
	
	
}
