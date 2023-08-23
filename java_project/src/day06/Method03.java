package day06;

import java.util.Scanner;

public class Method03 {

	public static void main(String[] args) {
		/* 메서드를 활용한 계산기 작성
		 * 연산자는 + - * / % 만 허용 
		 * 두 수와 연산자를 입력받아서 메서드 활용하여 연산
		 * 
		 * 스캔-입력받기num1,2,연산자
		 * 메서드만들기
		 * 스위치만들어서 케이스별로 각 부호나오게
		 * 
		 * */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자-> 연산자->숫자 순서대로 입력해주세요");
		
		int num1 = scan.nextInt();
		String O = scan.next();
		int num2 = scan.nextInt();
		
		
		switch (O){
		 case "+" :
			 System.out.println(num1 +"+"+num2+"="+ add(num1, num2)); //밑에 만든 void 로 출력하면 add(num1+O+num2); 이렇게 작성해주면 됨
			break;
		case "-" :
			System.out.println(num1+"-"+num2+"="+sub(num1,num2));
		    break;	
		case "*" :
			System.out.println(num1+"*"+num2+"="+mul(num1,num2));
		    break;	
		case "/" :
			System.out.println(num1+"/"+num2+"="+div(num1,num2));
		    break;	
		case "%" :
			//rem2 메서드를 사용해서 몫과 나머지를 출력
			double[] a=rem2(num1,num2);
			System.out.println(num1+"%"+num2+" 몫 "+a[0]);
			System.out.println(num1+"%"+num2+"나머지"+a[1]);
			
			//rem 메서드사용 
			System.out.println(num1+"%"+num2+"="+rem(num1,num2));
		    break;
		default:	
			System.out.println("잘못된 연산자입니다.");
		
		}
		
		scan.close();

	}
	
	public static int add(int num1,int num2) { 
		return num1+num2;
		/*void로 가능 //add에 연산자 같이 받을수 있음
		 * 값을 연산자까지 매개변수로 받아 리턴없이 출력한 메서드 , 매개변수의 순서의 의미는 없음-해당 변수출력시 자료형이 달라질수있으므로 주의
		 * void add( int num1,String O,int num2){
		 * System.out.println(num1+O+num2+"="+(num1+num2))
		 * */
	}
	public static int sub(int num1,int num2) {
		return num1-num2;
	}
	public static int mul(int num1,int num2) {
		return num1*num2;
	}
	public static int div(int num1,int num2) {
		return num1/num2;
	}
	public static int rem(int num1,int num2) {
		return num1%num2;
	}
	/* 기능 : 두 정수를 입력받아 두 정수의 몫과 나머지를 double로 리턴
	 * 리턴타입 : double타입의 배열 ->double[] 
	 * 매개변수 : 두 정수
	 * 변수명 : rem2
	 * 
	 * */
	public static double[] rem2(int num1,int num2) { //
		
		double arr[]=new double[2]; //배열의 자리를 생성
		arr[0]=(double)num1 / num2; //0번지에 넣을 값 생성(몫)
		arr[1]=(double)num1 % num2; //1번지에 넣을 값 생성(나머지)
		return arr; //return은 배열(arr)을 return한다.
	}

}
