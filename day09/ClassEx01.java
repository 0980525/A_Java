package day09;

public class ClassEx01 {

	public static void main(String[] args) {
		Point p= new Point();
		p.print();
		//멤버변수가 private로 변경되면 직접 접근할수 없음
		
//		p.x=1;
//		p.y=4;
		
		p.setx(1);
     	p.sety(4);
     	p.print();
        System.out.println(p.getx());
     	System.out.println(p.gety());
     	
     	
     	Point p1 = new Point();
     	p1.setx(100);
     	p1.sety(200);
     	p1.print();
     	
     	System.out.println("------------");
     	Point1 P=new Point1();
     	
     	P.setx1(5);
     	P.sety1(81);
     	P.setz1(43);
     	
     	P.print2();

	}

}
//(0,0)
class Point{ //default class이다. 나랑 패키지만 사용가능
	//멤버변수자리
	//멤버변수는 일반적으로 private사용
	
	private int x;
	private int y;
	//print메서드 만들기 (0,0)이 모양으로
	//같은 클래스의 멤버변수는 모든 메서드에서 공유된다.
	public void print() {
		System.out.println("("+x+","+y+")");
	}
	//getter - 멤버변수의 값을 가져오는 역할의 메서드
	//setter - 멤버변수의 값을 변경하는 역할의 메서드
	
	public int getx() { //getx를 호출, 값을 줌
		return x;
	}
	
	public int gety() {
		return y;
	}
	
	public void setx(int x/*여기 x와 저위에 x는 다른 변수임=매개변수x!=멤버변수*/) {
		//this 내 클래스의 멤버변수를 지칭하는 키워드
		this.x= x;
	}
	public void sety(int y) {
	 this.y=y;	
	}
	
	
	
	
}/*Point클래스 생성
	(0,0,0)
	xyzㅡ 멤버변수  생성
	print 메서드 생성
	getter / setter*/

class Point1{
	private int x1;
	private int y1;
	private int z1;
	//source-generate getter and setter 에서 자동 생성 가능 -int 있어야함
public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

	public int getZ1() {
		return z1;
	}

	public void setZ1(int z1) {
		this.z1 = z1;
	}
//요기는 내가 만들어본 getter / setter
	//	public int getx1() { 
//		return x1;
//	}
//	
//	public int gety1() {
//		return y1;
//	}
//	
//	public int getz1() {
//		return z1;
//	}
//	
//	public void setx1(int x1) {
//		this.x1= x1;
//	}
//	public void sety1(int y1) {
//	     this.y1=y1;	
//	}
//	public void setz1(int z1) {
//		 this.z1=z1;	
//		}
//	
	public void print2() {
		System.out.println("("+x1+","+y1+","+z1+")");
	}
		
}