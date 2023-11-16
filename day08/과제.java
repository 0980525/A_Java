package day08;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/*야구게임
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
		 * 게임 횟수 출력
		 * */
		
		
		System.out.println("--야구게임시작--");
		System.out.println("컴퓨터가 숫자를 정했습니다.");
		ranNum();
		user();
		

	}
	
	/*컴퓨터의 랜덤번호 생성 배열[]
	 * System.out.println("1~9 까지의 숫자 세자리를 입력해주세요");
	 * */
	public static int [] ranNum() {
	
		int arr[] = new int[3];
		int ran = 0;
		for(int i=1;i<arr.length;i++) {
		    ran = (int) (Math.random()*10);
			arr[i]=ran;
			}
		return arr;
	}
	
	/*입력번호받기
	 * 
	 * */
	public static int[] user (int num) {
	   Scanner scan = new Scanner(System.in);
	   
		int arr[] = new int[3]; //입력배열
		int num=0; //매개변수
		for(int i=1;i<arr.length;i++) {
		    arr = scan.nextInt();  //입력
		    arr[i]= num;
		    }
		System.out.println(num);
		
	}

}
