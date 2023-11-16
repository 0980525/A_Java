package day15;

public class Exception03 {

	public static void main(String[] args) {
		/* 자주발생하는 예외코드들
		 * 
		 */
		//ArithmeticException : / by zero
		//System.out.println(1/0);

		
		//ArrayIndexOutOfBoundsException : 배열의 번지가 넘어갔을때 발생
		//int arr[]= new int [5];
	   //arr[6]=1;
		
		
		//ClassCastException : 클래스의 캐스팅이 잘못되었을경우 (형변환 오류)
		//P p =new P();
		//C c = (C)p;
		
		
		//NullPointerException : 객체가 생성되지 않은 경우
		C c=null;
		c.print();
		
	}

}
class P{
	int num=10;
}
class C extends P{
	int num1=100;
	
	public void print() {
		
	}
}