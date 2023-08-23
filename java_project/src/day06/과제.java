package day06;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/*가위바위보게임 만들기
		 * 컴퓨터가 가위,바우ㅣ,보 중 랜덤 선택
		 * (0=가위,1=바위,2=보)
		 * 사용자도 가위,바위,보 중 선택해서 입력(숫자, 문자 상관없음 )
		 * 결과=> 
		 * 컴퓨터 > 가위
		 * 나 >가위
		 * => 결과 무승부입니다.
		 * 가위바위보 배열만들기 
		 * 랜덤수 생성-컴퓨터 가위바위보
		 * 스캐너생성-가위바위보 String
		 * 컴퓨터랑 나랑 비교 
		 * 비교값으로 스위치
		 * 케이스 같음-비김/컴 이김-사용자 짐/컴 짐-사용자 이김
		 * 
		 *  */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("컴퓨터와 가위바위보 게임");
		System.out.println("가위(0),바위(1),보(2) 중 하나를 입력해주세요");
		
		
		int random=(int)(Math.random()*2);
		System.out.println("컴퓨터 >");
		String str[] = new String[2];
		for(int i=random;;) {
		
		str[0] = "가위";
		str[1] = "바위";
		str[2] = "보";
		System.out.println("컴퓨터 >"+str(random));
		}
		
		
		
//		
//		if(컴퓨터==유저) {
//			System.out.println("비겼다!");
//		}else if(컴퓨터>유저) {
//			System.out.println("졌다!");
//		}else {
//			System.out.println("이겼다!");
//		}
		
		
		
	
		
		
		
	
		
		
		

	}

}
