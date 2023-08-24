package day07;

public class Method05 {

	public static void main(String[] args) {
		/*2-100까지의 소수를 출력
		 * 2-100까지 for문을 돌려서 메서드 호출하여 true 라면 출력
		 * */
		
		for (int i=2;i<=100;i++) {
			if(A(i)) {
				System.out.print(i+" ");
			}
			
		}

	}
	
	/*기능 : 정수가 주어지면 이 정수가 소수인지 아닌지 판단-if
	 * 약수 %2==0)
	 * 약수의 갯수 카운트/ 갯수가 2개 면 소수 true / 갯수가 3개 이상이면 false
	 * 
	 *  맞으면 true/틀리면false
	 * 소수: 1과 자기자신만 약수로 가지는 수
	 * 리턴 타입: double
	 * 매개변수 : int num1 int num2
	 * 메서드명 : A
	 * */

	public static boolean A(int num1) {
		int count=0;
		for(int i=1;i<=num1;i++) {
			if(num1%i==0) {
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
	

