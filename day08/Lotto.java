package day08;

public class Lotto {

	public static void main(String[] args) {
		/* 로또 번호 생성 1-45
		 * 로또번호 => 1-45까지 6개 => 사용자번호 (랜덤
		 * 당첨번호 => 1-45까지 7개 => 보너스번호 (랜덤
		 * 
		 * 출력
		 * 사용자번호 6자리 1 2 3 4 5 6
		 * 당첨번호 6+1자리 1 2 3 4 5 6 [7] 끝자리 표식
		 * 
		 * 랜덤수 둘다 중복나오면 안됨
		 * 
		 * 로또 등수 확인 
		 * 6자리 일치=1등
		 * 5자리 +보너스번호 =2등
		 * 5자리 =3등
		 * 4자리 =4등
		 * 3자리 = 5등
		 * 나머지 = 꽝
		 * */
		
		int lotto[] = new int[7]; //당첨번호
		int user[] = new int [6]; //my random number
		
	
	}
	
	/*기능 : 1-45까지 배열 6
	 * 리턴타입 int[]
	 * 매개변수 배열의 개수
	 * 메서드명 ranNum
	 * */
	public static int ranNum() {
		return (int)(Math.random()*45)+1;
	}

	/*번호를 배열에 저장 */
	public static void randomArray(int arr[]) {
		
		for (int i=0;i<arr.length;i++) { 
			arr[i]=ranNum();
			}
		}
	
	/*출력*/
	public static void printArray(int arr[]) {
		for (int i=0;i<arr.length;i++) {
			;
		}
		
	}
	
	
	/*기능 : 중복확인 중복-true 아니면false
	 * 리턴 boolean
	 * 매개변수 : int arr[],random
	 * 메서드명 : isContain 어려워 몰라 집가서 다시하기
	 * */
	
	/*기능 : 등수 체크*/
	
		
	 //}

   
}
