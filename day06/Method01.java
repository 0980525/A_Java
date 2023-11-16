package day06;

public class Method01 {

	//메서드 선언 위치
	
	public static void main(String[] args) {
		/*메서드 : 기능 / 함수
		 * 접근제어자(제한자) : 접근할 수 있는 주체의 제한 범위
		 * 리턴타입 : 메서드의 실향 결과로 받을 수 있는 정보의 값(자료형)
		 * 메서드 명 : 이름 =>소문자로 시작 (클래스만 대문자)
		 * 매개변수 : 메서드를 실행 하기 위해서 필요로 하는 값 (자료형 변수명)
		 * 
		 * 선언구현
		 * 접근제어자 리턴타입 메서드명(매개변수,매개변수){
		 * 구현;
		 * }
		 * 
		 * 메서드 선언 위치
		 * 클래스 안, 다른 메서드 밖
		 * <메인메서드와 겹치면 안됨>
		 * */
		int sum = sum(3,5);
		System.out.println(sum);
		
		int sum1=sum(sum,2);
		System.out.println(sum1);
		
		double time = time(3,8);
		System.out.println(time);
		
		int time1 = time(2,8);
		System.out.println(time1);
		
		sum3(10,20);

	}

	//메서드 선언 위치
	/* 기능 : 두 정수가 주어지면 두 정수의 합을 알려주는 메서드
	 * 리턴타입 : 알려줘야하는 값 =>합 (Int)
	 * 매개변수 : 두 정수 =>int num1,int num2 -자료형=int/변수명은 임의로
	 * 메서드명 : 관련 기능으로 임의설정 sum 
	 * 
	 * */
	public static int sum(int num1,int num2) {
		int result = num1+num2;
		return result; //선언만 했음
	
	}	
	
	/*기능 : 두 정수가 주어지면 두 정수의 곱을 알려주는 메서드
	 * 리턴타입 :곱 double
	 * 매개변수 :두 정수 int num1,int num2
	 * 메서드명 : time
	 * 
	 * */
	
	public static double time(double num1,double num2) {
		double result = num1*num2;
		return result;
		
	}
	
	public static int time(int num1,int num2) {
		return  num1*num2;
	}
	
	/*기능 : 두 정수가 주어지면 두 정수의 합을 출력하는 메서드
	 * 리턴타입 없음 - void 사용
	 * 매개변수 : 두 정수 int num1, int num2
	 * 메서드명 : sum3
	 * 
	 * sum3의 연산을 다른값에 사용할수 없음 = 리턴이 없기때문
	 * 단순 출력을 하면 리턴을 받지않아도 괜찮다.
	 * 
	 * 리턴=결과값을 돌려줌, 메서드를 빠져나가는 역할(메서드 종료)
	 * */
	
	public static void sum3(int num1,int num2) {
		System.out.println(num1+num2);
	}
	
}
