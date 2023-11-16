package day07;

import java.util.Scanner;

public class Method05 {

	public static void main(String[] args) {
		/*2-100까지의 소수를 출력
		 * 2-100까지 for문을 돌려서 메서드 호출하여 true 라면 출력
		 * */
		
		for (int i=2;i<=100;i++) {
			if(A(i)) {
				System.out.print(i+" "); //소수 전체 합계
			}
			
		}
		
		//2-100까지 소수의 합계
		int sum=0;
		for(int i=2;i<=100;i++) {
			if(A(i)) {
				sum +=i;
			}
		}
		
		//값을 입력받아서 소수인지 아닌지 출력
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력 : ");
		
		//if문 사용한 방법
		int num = scan.nextInt(); 
		if(A(num)) {
			System.out.println("소수입니다.");
		} else {
			System.out.println("소수가 아닙니다.");
		}
		
		//삼항연산자를 사용한 방법
		System.out.println(A(num)?"소수":"소수아님"); 
		
		scan.close();
		
		
	}
	
	/*기능 : 정수가 주어지면 이 정수가 소수인지 아닌지 판단-if
	 * 약수 %2==0)
	 * 약수의 갯수 카운트/ 갯수가 2개 면 소수 true / 갯수가 3개 이상이면 false
	 * 
	 *  맞으면 true/틀리면false
	 * 소수: 1과 자기자신만 약수로 가지는 수
	 * 리턴 타입: boolean
	 * 매개변수 : int num 
	 * 메서드명 : A //맞는지 아닌지를 보려면 앞에 is를 붙여서 이름을 만듦 ex)isPrime
	 * */

	public static boolean A(int num) {
		int count=0;
		for(int i=1;i<=num;i++) { //1부터 num까지 반복하여 약수의 개수 확인
			if(num%i==0) { //약수 찾기
			count++;
			}
		}
//		if(count==2) {
//			return true;
//		}
//			return false ;
			
	 return count==2 ? true : false; //삼항연산자를 사용할수도 있다
	}
}
	//메서드는 한번에 하나만 기능하도록해서 수정없이 사용할수있도록하기 -수정하면 그 메서드쓴 메인은 망한거

