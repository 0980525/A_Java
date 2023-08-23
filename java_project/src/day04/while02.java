package day04;

public class while02 {

	public static void main(String[] args) {
		/* 2 4 6 8 10
		 * 12 14 16 18 20
		 * 22 24 26 28 30
		 * 
		 * 1-50까지 짝수만 출력 5개씩 한줄로
		 * 
		 * */
		int i=1;
		
		while(i<=50){  //순서 상관없음
			i++;
			
			if(i%2==0)
			System.out.print(i+" ");
			if(i%10==0) {
			System.out.println(" ");}
			
		}
		
		System.out.println("----------------");
		
		for( i=1;i<=50;i++) { //순서가 정해져있을경우 사용
			if(i%2==0) {
				/*System.out.print(i+" ");}*/System.out.printf("%3d",i);} //가운데 숫자 
			if(i%10==0) {
				System.out.println(" ");}
		}
		
		
		System.out.println("--------------------");
		System.out.println("출력구문");
		/*System.out.println : 쥴바꿈 포함
		 * System.out.print : 줄바꿈 미포함 , 값이 없으면 error
		 * System.out.printf : 지시자를 이용한 출력
		 * 지시자:서식지정자를 통해 출력할 데이터의 서식을 지정할 수 있음
		 * %n 줄바ㄱ꿈, %d 정수형 , %f 실수형, %c 문자, %s 문자열
		 * 소수점 설정, 공백(띄어쓰기)
		 * 
		 * Sysout.printf("%.2f",1.26666); ->1.26으로 출력
		 * */
		
		int num1 = 5;
		int num2 = 6;
		System.out.printf("%d+%d=%d%n",num1,num2,(num1+num2));
		
		System.out.println();
		
		double num3 = 1.23;
		double num4 = 5;
		System.out.printf("%.1f/%.1f=%.1f",num3,num4,(num3/num4));
		

	}

}
