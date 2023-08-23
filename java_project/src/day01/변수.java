package day01;

public class 변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 변수 선언
		 * 자료형 (타입) 변수명;
		 * 
		 * 변수 선언 +초기화
		 * 자료형 변수명 = 값;
		 */
		int num = 123; //선언 +초기화
		System.out.println(num);
		
		//System.out.println();=> sysout+ctrl+space
		System.out.println();
		
		//int num = 456; //중복선언 불가능
		
		num = 456; //=대입연산자 왼쪽에 있는 변수에 오른쪽에 있는 값을 넣어라 라는 의미(덮어쓰기)
		System.out.println(num);
		
		int num1=36,num2=446,num3=432; //여러개 값 넣는거 같은 자료형에서 가능
		
		num1=352;
		System.out.println(num1);
		
		// 8개의 기본 자료형은 지역변수로 선언된다. 지역변수 범위(scope) 가장 가까운 괄호~가장 먼 괄호까지 { }
		
		//명령어 {}
		if(true) {
			int a = 10;
			System.out.println(a);
		}//변수가 if안에 있는지 밖에 있는지에 따라 괄호 밖에서 출력되기도함 
		
		int a = 0;
		if(true) {
			 a = 10;
			System.out.println(a);
		}
		System.out.println(a);
		
		//char은 한글자만 저장 가능 char 변수이름 = '';
		char ch = 'a'; //""=>문자열 , ''=>한글자(char)
		double dou =3.0;
		byte b=1;
		boolean boo = true; //true,false로만 저장 가능
		
		/*float / long 자료형은 접미사를 반드시 붙여야 인식됨.
		 * float (f,F)   long (L)
		 */
		float f = 1.2f;
		long L  = 1L;
		
		num2 = 010; //앞에 0을 붙여서 8진수로 인식 (0~7까지 8=>10)
		num3 = 0x10; //16진수로 인식 (0~15ABCDEF까지 16=>10)
		
		// + - * / %(나머지)
		
		//국어점수(kor), 영어점수(eng), 수학점수(math) 변수를 선언하고, 값을 입력하여 세 점수의 합을 콘솔에ㅔ 출력
		
		int kor = 80;
		int eng = 65;
		int math = 75;
		
		System.out.println(kor+eng+math);
		//합계를 만들어서 넣어주는 방법도 있음
		//int sum=kor+eng+math;
		//System.out.println("국어,영어,수학점수 합계:"+sum);  연결연산자 합계의 이름+숫자
		//System.out.println(+kor+eng+math"점"); 합계+점으로 출력
		//System.out.println("국어,영어,수학점수 합계:"+kor+eng+math) ->이렇게하면 문자로 연결된다. 숫자의 나열로 합계값이 나오지않음
		//System.out.println("합계:"+(kor+eng+math)); ->합계+숫자로 출력됨 
	}

}
