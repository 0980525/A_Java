package day09;

public class MethodEx02 {

	public static void main(String[] args) {
		/* 두 정수의 사칙연산 (+ - * / % )을 처리
		 * 
		 */
		MethodEx02 me = new MethodEx02();
		System.out.println(me.add(10, 20));
		System.out.println(me.sub(10, 20));
		
//		int a=4;
//		int c=7;
//		MethodEx02 A = new MethodEx02();
//		int add = A.add(a,c);
//		System.out.println(add);
//		
//		MethodEx02 S = new MethodEx02();
//		int sub = S.sub(c, add);
//		System.out.println(sub);
//		
//		MethodEx02 M = new MethodEx02();
//		int mul = M.mul(add, sub);
//		System.out.println(mul);
//		
//		MethodEx02 D = new MethodEx02();
//		double div = D.div(c, a);
//		System.out.println(div);
//		
//		MethodEx02 R = new MethodEx02();
//		int rem = R.rem(c, a);
//		System.out.println(rem);
//	    하나하나 할 필요 없이 위에처럼 하면 된다.!
		

	}
	//static 없이 생성후 메인에 호출
	
	public int add(int num1,int num2) {
		return num1+num2;
	}
	
	public int sub(int num1,int num2) {
		return num1-num2;
	}
	
	public int mul(int num1,int num2) {
		return num1*num2;
	}
	
	public double div(int num1,int num2) {
		return num1/num2;
	}
	
	public int rem(int num1,int num2) {
		return num1%num2;
	}
	
}
