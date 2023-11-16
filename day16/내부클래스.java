package day16;

public class 내부클래스 {

	public static void main(String[] args) {
		/* 내부 클래스 : 클래스 내부에 선언한 클래스
		 *  - 외부->내부클래스
		 *  -다른 외부에서는 내부클래스를 사용할 일이 없고,
		 *  -내부클래스가 외부클래스와 밀접한 연관이 있을 경우
		 *  
		 *  -내부적으로 사용할 목적으로 만드는 클래스 이기때문에 private 선언하는 것은 ㄱㄷ
		 *  내부클래스가 생성되는 시기 : 외부클래스가 생성된 후 내부클래스 생성
		 * 익명 - 이름 없음(anonymous class) 내부클래스 ->익명클래스를 사용하기 위해
		 */
		A a=new A();
		a.outprint();
		//B b=new B(); //불가능
	}

}
//외부
class A{
	private int num = 10;
	private int num2 = 20; 
	private B b;
	
	public A() {
		b = new B();
	}
	//내부
	class B{
		int inNum = 100;
		public void print() {
			System.out.println("외부클래스 num"+ num);
			System.out.println("외부클래스 num2"+num2);
			System.out.println("내부클래스 inNum"+inNum);
		}
	}
	
	public void outprint() {
		b.print(); //내부클래스의 객체변수를 사용하여 메서드 호출
	}
}