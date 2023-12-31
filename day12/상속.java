package day12;

public class 상속 {

	public static void main(String[] args) {
		/* 상속 : 부모의 것을 자식에세 물려주는 것
		 * 클래스 상속 : 부모클래스의 멤버변수/멤버메서드를 물려주는것
		 * 상속을 하는 이유 : 재사용을 해서 중복코드를 줄이기 위한것 
		 * class A부모 클래스 / class B 자식클래스
		 * 
		 * class B extends A {
		 * 상속 키워드 extends
		 * }
		 * 
		 * 상속을 받으면 부모의 멤버변수와 멤버메서드를 사용할 수 있다.
		 * 접근제한자가 private 이면 자식클래스에서도 접근 불가능
		 * 접근제한자 protected : 상속받는 자식에게 허용하는 제어자 
		 * 
		 */
		A a=new A();
		a.setA(10);
		a.setB(20);
		a.setC(30);
		a.setNum(40);
		a.print();
		
		B b=new B();
		b.setA(100);
		System.out.println(b.getA());
		b.setB(200);
		b.setC(300);
		b.num=500; //제어자가 protected 이기 때문에 직접접근이 가능
		b.setE(500);
	}

}
class A {//부모클래스
	private int a,b,c; //나만 사용가능
	protected int num; //상속가능
	
	public void print() {
		System.out.println("a"+a+"b"+b+"c"+c);
		System.out.println("num"+num);
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
}

		//오버라이드 부모의 메서드를 가져와서 재정의 하는 것은 으미



class B extends A{
	//a,b,c,num사용 가능 getter/setter이용!
	private int d,e,f;
	
	public void print() {
		super.print(); //부모의 멤버를 가져올때 사용
		System.out.println("d"+d+",e"+e+",f"+f);
		
		
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

	public int getE() {
		return e;
	}

	public void setE(int e) {
		this.e = e;
	}

	public int getF() {
		return f;
	}

	public void setF(int f) {
		this.f = f;
	}
}