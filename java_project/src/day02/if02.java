package day02;

import java.util.Scanner;

public class if02 {

	public static void main(String[] args) {
		/* 국어,영어, 수학 점수를 입력받아서 합계,평균,평가를 출력
		 * 평가- 평균이 90 이상 A
		 * 80-B / 70-C / 나머지-D
		 * 
		 * 입력값이 0보다 작거나 100보다 크면 잘못된 값
		 */
		
		Scanner scan= new Scanner(System.in);
		
		
		
		System.out.println("국어점수를 입력하세요."); //("점수 입력(0-100, 국,영,수 순으로 입력)
		
		int kor=scan.nextInt(); 
		if ( kor>100 || kor<0) {System.out.println("입력값이 잘못되었습니다.");}
		
		System.out.println("영어점수를 입력하세요");
		
		int eng=scan.nextInt();
		if ( eng>100 || eng<0) {System.out.println("입력값이 잘못되었습니다.");}
		
		System.out.println("수학점수를 입력하세요");
		
		int math=scan.nextInt();
		if ( math>100 || math<0) {System.out.println("입력값이 잘못되었습니다.");}
		
		int sum = kor+eng+math;
		int avg = sum /3;
		
		System.out.println("합계 : " +sum+ "평균 : " +avg);
		System.out.println("결과"  );
		if (avg>=90) {
			System.out.println("A");
		} else if(avg>=80) {
			System.out.println("B");
		}else if(avg>=70) {
			System.out.println("C");
		}else {
			System.out.println("D");
		
		}
		
		/*char ch = 'D'; -char 형태는 ' 작은따옴표 ' 사용
		 * 
		 * if(avg>100 || avg<0) {System.out.println("잘못된 성적");}
		 * else if (avg>=90){ch='A'}
		 * else if (avg>=80){ch='B'}
		 * else if (avg>=70){ch='C'}
		 * else if (avg>=60){ch='D'}
		 * 
		 * 
		 * */
		
		scan.close();
	}
}
