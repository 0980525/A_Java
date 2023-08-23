package day04;

public class While01 {

	public static void main(String[] args) {
		/*
		 * While : 반복문 중 하나,
		 * while(조건식){ //true일때 반복
		 * 실행문; //실행문이 모두 실행되면 다시 조건식으로 되돌아가서 조건식을 다시 평가(무한루프가능)
		 * 증감식;}
		 * 
		 * */
		//1-10까지 출력
		
		for(int i=1; i<=10;i++) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		int i=0; //반복을 위한 초기화를 여기서 함
		while(i<=10) {
			System.out.print(i+" ");
			i++; //증감식
		}//왜 0부터인지 물어보기 위에 int i=0;구문때문 int i=1;로 하면 1부터 시작
		System.out.println();
		
		//1-10까지 짝수만 출력
		i=0;
		while(i<=10) {
			i++;
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}

	}

}
