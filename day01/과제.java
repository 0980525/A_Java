package day01;

public class 과제 {

	public static void main(String[] args) {
		/* 매일 마지막 시간 과제 출제
		 * 까페에 제출
		 * 국어, 영어, 수학 점수 합계와 평균을 출력(평균 소수점으로)
		 * 조건선택연산자를 이용하여
		 * 평균이 80이상이면 결과:합격, 아니면 결과:불합격 출력
		 * 내일 등원 전까지 제출
		 */
		
		int kor, eng, math;
		kor=39;
		eng=66;
		math=80;
		int sum=kor+eng+math;
		double avg=(double)sum/3;
		
		
		System.out.println("합계:"+sum+",평균:"+avg+",결과:"+(avg >=80?"합격":"불합격"));
		//합계를 구할 데이터가 있어야함->지역변수는 반드시 초기화해야함 int sum=0;(선언+초기화같이한것)/double avg=0; / 선생님이 올려주신 거 
		
		//조건선택 연산자 =>if문으로 변경 8.17일 추가
		if(avg>=80) {System.out.println("결과:합격");}
		else {System.out.println("결과:불합격");}

	}

}
