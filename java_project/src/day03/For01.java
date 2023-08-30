package day03;

public class For01 {

	public static void main(String[] args) {
		/* 반복문 : 규칙적인 작업을 반복적으로 할때 사용하는 문법
		 * For , while, do~while
		 * -for, while 문은 동작방식이 같음.
		 *  => 조건에 맞지 않으면 한번도 실행 안될 수 도 있음.
		 * -do~while 문은 두 방식과 동작방식이 조금 다름.
		 *  => 조건에 맞지 않아도 무조건 1번은 실행.
		 * for(변수초기화;조건식비교;증감식비교){실행문;}
		 * -초기화:조건식이나 실행문에서 사용할 변수를 초기화 / 처음 1번만 실행 : 생략가능
		 * -조건식:반복문의 반복을 결정하는 식(true =>반복) : 생략가능
		 * -증감식:조건식에서 사용되는 변수를 증가 / 감소시켜 반복횟수를 조절
		 * */

		//1~10까지 출력하는 예제
		//초기화 :i변수 사용,i=1
		//조건식 :10이 될때까지 =>i < 10(i가 10하고 같으면 실행 안됨) / i <= 10;(이건 됨)
		//증감식 : i가 1씩 증가 =>i++; (i=i+1)
		//실행문 :i 출력
		
		
		for(int i=1;i<=10;i++) {
			System.out.print(i+" ");
		}
		System.out.println(); // 줄바꿈
		System.out.println("---------------------");
		//10~1까지
		for(int i=10;i>=1;i--) { 
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("---------------------");	
		
		//2부터 10까지 짝수만 출력
		for(int i=2;i<=10;i=i+2) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("---------------------");
		
		//1부터 20까지중 짝수만 출력 
		//if문을 사용하여 조건에 맞는 자료만 출력
		for(int i=1;i<=20;i++) {
			if(i % 2==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println("---------------------");
		//1부터 10까지 홀수만 출력 / 짝수일 때는 짝수pass~!!라는 문구 출력
		for(int i=1;i<=10;i++) {
			if(i%2==1) { System.out.print(i+" ");}
			else {System.out.print("짝수pass~!!");}
			
		}
		System.out.println();
		System.out.println("---------------------");
		
		//1부터 10까지 합계 / 실행문 : 누적더하기 / 실행 후 출력
		int sum=0;
		for(int i=1;i<=10;i++) { //초기화:1부터, 조건식:10까지,증감식:1씩 증가
			 sum/*누적해야하는곳*/ = sum + i;  //0+1+2+3+4+5+....+10 누적 됨
		}
		System.out.print(sum);
		
		/*i를 설정, 합계를 구하는 sum 설정, 누적 더하기는 처음부터 끝까지 각 값이 살아있어야하고 더해져야함
		 * 지역변수for문 (){생성  소멸}-소멸하지않도록 누적해야하는곳에 넣는다.
		 * */
		
		System.out.println();
		System.out.println("---------------------");
		
		//1부터 10까지 짝수의 합과 홀수의 합을 출력
		int a=0;
		int b=0;
		for(int i=1;i<=10;i++ ) {
			if (i%2==1) {
				a=a+i;
			}else {
				b=b+i;
			}
		}
		System.out.println(a);
		System.out.println(b);
		
		
	}

}
