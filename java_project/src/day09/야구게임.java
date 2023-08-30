package day09;

import java.util.Scanner;



public class 야구게임 {

	public static void main(String[] args) {
		/*선생님이하신거
		 * 야구게임
		 * 컴-3자리 숫자를 랜덤생성 (1-9까지) => 중복 X
		 * 유저-3자리 숫자를 맞추는 게임
		 * 
		 * 자리와 숫자가 일치하면 strike
		 * 숫자만 일치하면 ball
		 * 둘다 일치하지않으면 out
		 * =>C-258 U-256=> 2s
		 * =>C-846 U-684=> 3b
		 * =>C-258 U-326=> 1b
		 * =>C-258 U-176=> out
		 * 
		 * --야구게임 시작
		 * 컴퓨터가 숫자를 정했습니다
		 * 숫자입력 1-9까지 : 
		 *  3자리
		 * 결과
		 * 2s
		 * ...
		 * 다맞으면 종료
		 * 게임 횟수 출력 메인에서만 */
		//1.입력을 위한 스캐너
		Scanner scan = new Scanner(System.in);
		//2.변수선언
		int comNum []=new int [3]; //컴퓨터배열
		int myNum []=new int [3]; //user배열
		int count =0; //게임 횟수 출력용 변수
		//3.컴퓨터가 결정한 숫자3가지를 중복되지 않게 추출
		for (int i=0; i<comNum.length;i++) {
			comNum[i]=(int)(Math.random()*9)+1;
			for (int j=0;j<i;j++) {
				if (comNum[i]==comNum[j]) {
					i--;
					break; //for(j) 구문을 빠져나감
				}
			}
		}
		
		//출력확인용
//		for (int tmp:comNum) {
//			System.out.print(tmp+" ");
//		}
		
		//lotto메서드의 randomArray배열과 printArray배열을 호출
		//static메서드는 객체생성없이 클래스명.메서드명()으로 호출 가능.
		System.out.println();
//		Lotto.ranNum(comNum);  이름만있고 내용물 없음..ㅎ 프린트는 없음,,ㅎㅎ
//		Lotto.printArray(comNum); 어쨌든 이렇게 두개 부르면 호출해서 출력됨
		
		//static이 아닌경우, 객체를 생성하여 객체명,메서드명()호출가능
//		Lotto l = new Lotto; //객체생성
//		l.randomArray(comNum);
//		l.printArray(comNum);
		
		System.out.println("야구게임 시작 > ");
		System.out.println("컴퓨터가 숫자를 결정하였습니다.");
		
		//4. 사용자의 숫자 입력받기
		while(true/*조건을 주기 애매한경우 사용*/) {
			int s=0;
			int b=0;
			System.out.println("숫자입력(1-9,숫자 3개) > ");
			
			for(int i=0; i<myNum.length; i++) {
				myNum[i]=scan.nextInt();
			}
			count++; //게임횟수 카운트 증가
			
		//5.숫자비교
			for(int i=0;i<comNum.length;i++) { //com기준
				for(int j=0;j<myNum.length;j++) {
					//스트라이크 기준 자리와 숫자가 일치
					if(comNum[i]==myNum[j] && i==j) {
						s++;
					}else if (comNum[i]==myNum[j]&&i!=j) {
						b++;
					}
				}
				
			}
			//출력
			if(s==0 &&b==0) {
				System.out.println("out!!");
			}
			else {
				System.out.println(s+"s "+b+"b ");
				
			}
			if(s==3 ) {
				System.out.println("정답!!");
				System.out.println("게임횟수 "+count);
				break; //while구문을 벗어남
			}
		}
		

		

		scan.close();
	}

}
