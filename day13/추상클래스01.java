package day13;

public class 추상클래스01 {

	public static void main(String[] args) {
		/* 추상클래스 : 추상메서드 + 일반베서드 + 멤버변수 + 상수(final)
		 * 미완성 클래스 =>객체를 생성 할 수 없다.
		 * 추상 메서드 =>메서드의 선언부만 있고 구현은 없는 메서드
		 * 
		 * 키워드 : abstract
		 * abstract 클래스명 / abstract 메서드명 앞에 추가
		 * 
		 * abstract 리턴타입 메서드명(매게변수); //추상메서드
		 * -부모클래스에서 상속을 받았을때, 특정 메서드가 자식클래스에서 자주 오버라이딩 될때 해당 메서드를 추상메서드로 작성
		 * -상속을 받은 클래스에서 추상메서드가 있다면 반드시 구현해야 한다.
		 * -구현을 안하면 내 클래스도 추상클래스가 된다
		 */
		
		Dog d=new Dog("뽀삐", "개과");
		
		d.printInfo();
		d.howl();
		
//		Cat c=new Cat("나비", "고양잇과"); //추상클래스
//		
//		c.printInfo();
//		c.howl();
	}

}

//추상클래스를 상속받는 dog,cat클래스 생성
//상속받은 추상메서드를 구현하지 않으려면 자신의 클래스도 추상클래스여야한다.
//객체를 생성할 수 없음
class Dog extends Animal{
	public Dog() {}
	public Dog(String name,String category) {
		super.name=name;
		super.category=category;
	}
	@Override
	public void howl() {
		System.out.println("멍멍-");
	}
	
}
abstract class Animal{
	public String name;
	public String category;
	
	public void printInfo() {
		System.out.println("--");
		System.out.println("이름 : "+name);
		System.out.println("종류 : "+category);
		}
	abstract public void howl();
}

abstract class Cat extends Animal{ //추상클래스
	public Cat() {}
	public Cat(String name,String category) {
		super.name=name;
		super.category=category;
	}
//	@Override
//	public void howl() {
//		System.out.println("야옹-");
//		
//	}

}