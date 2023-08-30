package day10;

public class Class02 {

	public static void main(String[] args) {
		/* 자동차 클래스 생성
		 * 멤버변수를 사용해햐하는지 생각 : (name, year, color)-미리가지고태어남=생성자,power,speed
		 * 메서드 어떤게 있음좋을지 : 전원on, 전원off, 스피드 up, 스피드 down-,
		 * getter,setter생성
		 * 생성자
		 * */
		
		Car car = new Car("스파크", "2020", "흰색");
		car.powerOn();
		car.speedUp();
		car.speedUp();
		car.speedUp();
		car.speedUp();
		car.speedDown();
		car.speedDown();
		car.speedDown();
		car.speedDown();
		car.powerOff();
		car.speedUp();
	}

}
class Car{
	
	//1. 멤버변수 선언
	private String name;
	private String year;
	private String color;
	private boolean power;
	private int speed;
	
	
	
	//2. 생성자
	public Car() {}
	public Car(String name,String year,String color) {
		this.name=name;
		this.year = year;
		this.color=color;
	}
	
	//3.메서드
	public void powerOn()  {
		power=true;
		System.out.println("시동이 켜졌습니다.");
		} 
	public void powerOff()  {
		if(speed==0) {
			power=false;
		System.out.println("시동이 꺼졌습니다.");
		}else {
			System.out.println("속도를 먼저 줄여주세요");
		}
		
	
	}
	public void speedUp()  {
		if (power) {
			speed=speed+10;
		System.out.println("현재속도 "+speed);
		}else {
			System.out.println("시동을 먼저 켜주세요");
		}
		
	}
	public void speedDown()  {
		if(speed==0) {
			System.out.println("더이상 속도를 줄일수 없습니다.");
		}else {
			speed=speed-10;
		System.out.println("현재속도 "+speed);
		}
	}
	//4.getter/setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	
	
	
 
}

