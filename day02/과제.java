package day02;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/*카페에 제출
		 * 정수 2개와 연산자 하나를 입력받아 두 정수의 연산을 출력
		 * 연산자는 +,-,*,/,% 
		 * ex) 3,2,+(입력)=>3+2=5(출력)
		 * 만약 연산자의 종류가 다른 연산자가 들어오면 잘못된 입력
		 * */

		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수 두 개와 연산자 한 개를 입력해주세요.");
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		String r = scan.next(); //char op=scan.next().chaarAt(0);  한글자 입력받기 / char는 정수라 문자열 변환필요 ''
		
		/* int a = num1+num2;
		 * int b = num1-num2;
		 * int c = num1*num2;
		 * double d = (double)num1/num2;
		 * int e = num1%num2;
		 * 
		 * switch(op){
		 * case '+': System.out.println(""+num1+op+num2+"="+a); num숫자+char 자료형은 앞에 의미없는 ""를 +해줘서 문자열로 만들어준다
		 * break;
		 * case '-':System.out.println(""+num1+op+num2+"="+b); / case '-':System.out.println(""+num1+op+num2+"="+(num1-num2)); 두가지 방법 다 쓸수 있음
		 * break;
		 * case '*':System.out.println(""+num1+op+num2+"="+c);
		 * break;
		 * case '/':System.out.println(""+num1+op+num2+"="+d);
		 * break;
		 * case '%':System.out.println(""+num1+op+num2+"="+e);
		 * break;
		 * default:
		 * System.out.println("잘못된 연산자입니다.")
		 * 
		 * }
		 * */

	
		switch(r){
		case "+" :System.out.println(num1+num2);
			break;
		case "-" :System.out.println(num1-num2);
		break;	
		case "*" :System.out.println(num1*num2);
		break;	
		case "/" :System.out.println(num1/num2);
		break;	
		case "%" :System.out.println(num1%num2);
		break;
		default:
		System.out.println("잘못된 입력입니다.");	}
	
		
		scan.close();
		/*입력데이터 파악, 스캐너 임폴트해야 사용가능, 스캔 닫기
		 * 안내문구 작성, char는 작은따옴표 / string은 큰따옴표
		 * */
	}

}
