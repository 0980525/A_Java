package day12;

public class 상속02 {

	public static void main(String[] args) {
		/* 오버라이딩 : 부모클래스에게 물려받은 메서드를 재정의하는것
		 * - 조건 : 부모클래스의 메서드와 선언부가 일치해야함
		 * - 접근제한자는 같거나 더 넓은 범위의 접근제한자를 써야한다.
		 * =>범위 축소는 안됨
		 * 
		 */
		
		
		Dog d = new Dog();
		d.setName("아리");
		d.info();
		d.howl();
		
		Cat c= new Cat();
		c.info();
		c.howl();
		
		Tiger t = new Tiger("호랑이", "고양잇과"); 
		t.info();
		t.howl();
	}

}
class Tiger extends Animal{
	public Tiger(String name,String category) {
		//부모생성자를 호출
		super(name,category);
		
	}

	@Override
	public void howl() {
		// TODO Auto-generated method stub
		super.howl();
		System.out.println("어흥");
	}
	
	
}


class Cat extends Animal{ //다른방법으로 하신거 다시한번 보기
	public Cat() {
		setName("고양이");
		setCategory("고양잇과");
		}
	
	
	
	public void howl() {
		// TODO Auto-generated method stub
		super.howl();
		System.out.println("야옹");
		}
	}
class Dog extends Animal{
	public Dog() {
		setName("강아지");
		setCategory("개과");
	}

	@Override
	public void howl() {
		// TODO Auto-generated method stub
		super.howl();
		System.out.println("멍멍");
		
	}
	
}
class Animal{
	private String name;

	private String category;
	
	public Animal() {}
	public Animal(String name, String category) {
		this.name=name;
		this.category=category;
		
	}
	//정보출력
	public void info() {
		System.out.println("이름 : "+name);
		System.out.println("종 : "+category);
		
	}
	//울음소리
	public void howl() {
		System.out.println("=="+name+"의 울음소리");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
}