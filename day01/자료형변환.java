package day01;

public class 자료형변환 {

	public static void main(String[] args) {
		/* 자료형 변환 : casting
		 * 자료형 (변수의 타입)
		 * a=b :a의 자료형과 b의 자료형이 맞지 않는 다면 오류
		 * 자료형 변환을 통해 양쪽의 자료형을 맞춰주는 역할
		 * 안해도 되는 상황-자동 자료형 변환 : 자료형 변환시 생략해도 문제가 되지 않는 상황
		 * 크기가 큰 자료형 = 크기가 작은 자료형
		 * 
		 * 명시적 자료형 변환 : 리터럴 값 앞에 (타입)
		 */
		
		byte num = 10;
		int num1=num; //int=byte (자동 형변환 가능-int가 bytr보다 커서 가능)
		
		double num2 = 10;
		//num1=num2; //int=double(명시적 형변환) 
		num1=(int)num2; //앞에 int를 붙여서 사이즈 맞춤
		System.out.println(num1);
		
		int num3 = (int)1.2; //소수점은 날아감
		System.out.println(num3);
		
		
		/*국어,영어,수학 세 값의 합계와 평균을 출력 (소수점 살려서)
		 */
		
	
		int kor, eng, math;
		kor=55;
		eng=85;
		math=85;
		int sum = kor+eng+math;
		double avg = (double)sum/3; 
	
		/*자료형이 double이고 나누는 값이 0이면 =>infinity
		 * 자료형이 int이고, 나누는 값이 0이면 예외발생 (Exception)
		 * 
		 */
		
		System.out.println("합계:"+sum+",평균:"+avg);
		
	}

}
