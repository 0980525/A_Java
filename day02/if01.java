package day02;

public class if01 {

	public static void main(String[] args) {
		/*조건문 : 조건식이 참일경우 실행문을 실행하는 문
		 * if문, switch문 
		 * if(조건식) {실행문;}
		 * 실행문 한줄일 경우 {}생략가능
		 * 조건식은 참일때 실행문을 실행
		 * */
		
		int num = -10; //-10으로 했을때는 아무것도 실행되지 않음
		//num가 0보다 크면 양수
		if(num > 0) {
			System.out.println("양수");
		}
		
		//num가 0보다 크면 양수 / 아니면 음수
		
		
		/*if(조건식){실행문;} else{실행문}
		 * if가 yes or no에서 yes, else가 no*/
		if(num>0) {
			System.out.println("양수");//10으로 했을때 양수 나옴
		}else {
			System.out.println("음수");//-10으로 했을때 음수 나옴 ,
			//else에는 조건식을 붙이지 않음 (if가 그렇다면 이고 else가 그렇지않다면이다.)
		}
		///num가 0보다 크면 양수 / 아니면 음수 / 0이면 0입니다.
		if(num>0) {
			System.out.println("양수");
		}else if(num==0) {
			System.out.println("0");}
		else {
			System.out.println("음수");
		}
		//num가 0보다 크면 양수(10보다 크면 10보다 큽니다) / 아니면 음수 / 0이면 0입니다.
		num=6;
		if(num>0) {
			System.out.println("양수");
		} if(num>10) {
			System.out.println("10보다 큼");
		}else if(num<0) {
			System.out.println("음수");
		} else {System.out.println("0");}
		/*else if(num==0) {
			System.out.println("0");
		} else {System.out.println("음수");}*/
		
		//num2 값을 저장하고, num가 짝수인지 홀수인지 콘솔에 짜기
		
		int num2=65;
		if(num2 % 2 ==0) {System.out.println(num2 + ":짝수");}
		else {System.out.println(num2+":홀수");}
		
		
		
	}

}
