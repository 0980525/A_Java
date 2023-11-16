package day03;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* up/down게임
		 * 1-50사이의 랜덤수를 생성하여 맞추는 게임
		 * ex)컴퓨터가 랜덤수를 생성 ->그 랜덤수를 유저가 맞추는 게임
		 * 컴-35 입력-10 출력-up
		 * 입력-20 출력-up
		 * 입력-40 출력-down
		 * 입력-35 출력-정답
		 * */
		
		//스캐너 임폴트 / 랜덤 수 만들기 / 입력칸 / 입력 후 for-if구문 만들기 / 
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("1-50까지 랜덤수 맞추기");
		
		
		
		int r=(int)(Math.random()*50)+1;
		
		for(;;) {
			System.out.println("입력 >");
			int num=scan.nextInt();
			
			if(num<r) {
				System.out.println("up!");
			
			} else if(num>r) {
				System.out.println("down!");
			
			} else if(num==r) {
				System.out.println("정답");
			break;
			} else {System.out.println("X");}
				
	
			}
		
	 scan.close();
	
	}
}
 
	


