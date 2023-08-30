package day08;

public class Method09 {

	public static void main(String[] args) {
		/*메서드 오버로딩 MethodOverloding
		 * 동일한 이름의 메서드를 여러개 만드는것
		 * 규칙 
		 * 1. 매개변수의 개수가 다르면 가능
		 * 2. 매개변수의 종류(자료형)이 다르면 가능
		 * 
		 * 리턴타입은 상관없음
		 * 매개변수명도 상관없음
		 * */
		
		int sum=sum1(1,2,3);
		System.out.println(sum);

	}
	/*더하기 메서드
	 *  */
	
	public static int sum(int num1,int num2) {
		return num1+num2;
	}
	// 매개변수의 개수가 달라서 오버로딩 되는 경우
	public static int sum(int num1,int num2,int num3) {
		return num1+num2+num3;
	}
	// 매개변수의 자료형이 달라서 오버로딩 되는 경우 1
	public static double sum(double num1,double num2) {
		return num1+num2;
	}
	// 매개변수의 자료형이 달라서 오버로딩 되는 경우 2
	public static double sum(int num1,double num2) {
		return num1+num2;
	}
	
	/* 가변길이 메서드
	 * 피연산자의 값이 일정하지 않을경우, 매개변수의 개수와 상관없이 매개값을 줄때 이용
	 *  */
	public static int sum1(int...num) {
		int sum1=0;
		for(int i=0;i<num.length;i++) {
			sum1+=num[i];
		}
		return sum1;
		}
}
