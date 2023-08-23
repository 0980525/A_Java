package day02;

public class Mathclass {

	public static void main(String[] args) {
		/*Math.method
		 * 자주쓰는것
		 * 반올림 (Math.round) : 소숫점의 자리수는 무조건 0 
		 * 올림 (Math.ceil) , 버림 (Math.floor)
		 */
		double num = 59.256546;
		
		//int roundNum = Math.round(num); //리턴이 롱형이라 불가능
		int roundNum = (int)Math.round(num); //가능
		long roundNum01 = Math.round(num); //가능 (위에 나오는거랑 이름이 같아서 안되었었는데 이름 바꾸고 됨 
		System.out.println(Math.round(num));
		System.out.println(Math.ceil(num));
		System.out.println(Math.floor(num));

		/*Math.max 최대값 , Math.min 최솟값 , 매개변수가 2개 이상 필요 (double,int,float,long), 
		 * 리턴에 오는 클래스확인 잘하기/해야하는 선언이 달라질수 있음, 내가 사용하고 있는 클래스자료형 확인(int=정수, double=소숫점자리도 가능)
		 * ,매개변수 갯수도 잘 확인하기
		 */
		System.out.println(Math.max(5,9));
		System.out.println(Math.min(5,8));
		
		/*Math.rondom : 0과 1사이의 아무 값을 리턴
		 * 0<=random <1
		 * (int)(Math.random()*10)+1 : 1부터 10개의 정수를 얻는 공식
		 */
		System.out.println(Math.random());//0은 포함 1은 미포함
		System.out.println((int)(Math.random()*10)+1);  //랜덤으로 숫자나오는거 확인
		
		
		
		
	}

}
