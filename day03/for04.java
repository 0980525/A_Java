package day03;

import java.util.Scanner;

public class for04 {

	public static void main(String[] args) {
		/*최대공약수 찾기
		 * 약수:1부터 자기자신까지 나누어서 떨어지는 수
		 * 공약수: 두 정수의 공통된 약수
		 * 최대공약수:공약수 중 가장 큰 값
		 * 8:1,2,4,8
		 * 12:1,2,3,4,6,12
		 * 공약수:1,2,4 / 최대공약수는 4
		 * */
		
		//두 정수 num1,num2를 입력받아 최대공약수를 출력
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("최대공약수를 구하고싶은 정수 두개를 입력해주세요.");
		
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		
		int a=0;
		for(int i=1;i<=num1/*큰 의미 없음 어차피 공약수최솟값은 두 숫자의작은숫자임*/;i++) {
			if((num1%i==0/*나누어떨어져야함*/) &&/*공약수를 구하려면 앞의 조건도 뒤의 조건도 참이어야함*/ (num2%i==0)/*나누어떨어져야함*/) {
				a=i;  /* 변수를 하나 더 만들어서(만들지않으면 앞뒤 조건식의 공약수가 다 나옴) i의 값을 !덮어씌우기!
				덮어씌우면 자동적으로 가장 큰수가 남음*/
			}
		}
		System.out.println(a);//굳이 for문에 들어있을 필요 없고 출력 잘되면 됨
		
		
		/* 반복문에서 조건이 맞다면 반복문을 빠져나오는 역할
		 * break;
		 * 중첩 for문일 경우 if문을 포함하는 가장 가까운 for문만 벗어날 수 있음
		 * 벗어나고 싶은 for문에 닉네임을 지어 해당 닉네임의 for문을 벗어날 수 있음.
		 * */
		
		//break구문 사용해서 최대공약수를 출력 
		for(int i=num1; ;i--) {
			if(num1 % i==0 &&num2 % i==0) {
				System.out.println("두수의 최대공약수: "+i);
				break;
			}
			
			
			
		}
//		닉네임생성, 브레이크+닉네임; 예문
//		int i=0;
//		a: for(;;) {
//			for(;;) {
//				for(;;) {
//					i++;
//					if(i==10) {
//						System.out.println(i+"벗어나기");
//						break a;
//					}
//				}
//			}
//		}
//		
//		
		
		
		
		
		
		
		
		scan.close();
		}
		
	}


