package day02;

public class switch01 {

	public static void main(String[] args) {
		/*switch 문 : 값에 따라 케이스를 달리주는 형식
		 * 
		 * switch(변수/식){
		 * case 값1 : 실행문1; break;
		 * case 값2 : 실행문2; break;
		 * case 값3 : 실행문3; break;
		 * default : 나머지 실행문 ;
		 * }
		 * break; : switch 문을 빠져나갈때 사용
		 * */
		
		int num = 3;
		switch(num) {
		case 1:
			System.out.println("num는 1입니다.");
			break;
		case 2:
			System.out.println("num는 2입니다.");
			break;
		case 3:
			System.out.println("num는 3입니다.");
			break;
			default:
				System.out.println("잘못된 입력입니다.");
		}
		
		//1-6까지의 수를 랜덤으로 추출하여 "주사위 : 0 "출력하기
		/*숫자(변수)이름 지정
		 * Math.random은 double이라 앞에 int 붙임*/
		 num = (int)(Math.random()*6)+1;
		//int r=(int)(Math.random()*6+1);
		 
		switch(num){
		case 1:System.out.println("주사위 : 1칸 전진 ");
		//case 1 : System.out.println("주사위:"+변수이름+"칸 전진"); break;
			break;
		case 2:
			System.out.println("주사위 : 2칸 전진 ");
			break;
		case 3:
			System.out.println("주사위 : 3칸 전진 ");
			break;
		case 4:
			System.out.println("주사위 : 4칸 전진 ");
			break;
		case 5:
			System.out.println("주사위 : 5칸 전진 ");
			break;
		case 6:
			System.out.println("주사위 : 6칸 전진 ");
			break;
			default: //System.out.println("잘못된 주사위 값")					
		}
		
	}

}
