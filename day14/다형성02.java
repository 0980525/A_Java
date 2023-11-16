package day14;

public class 다형성02 { //전부 안적음 나중에 클래스 다시 적기

	public static void main(String[] args) {
		
		Animal TAninmal = new Tiger();
		//Tiger t = new Animal(); //자식클래스로부터 부모클래스를 생성하는 케이스는 안됨.
		
		다형성02 test = new 다형성02();

		//객체-클래스 형변환되는지 확인  true/false로 
		//instanceof 연산자  
		//객체명 instanceof 클래스명 
		
		/* 이렇게 나타내기도한다구
		 * if(hAnimal instanceof Tiger) {
			Tiger t1 = (Tiger)hAnimal;
		}*/
		
	}

	public void
	
}
class Animal{
	
	public void move(){
		System.out.println("동물들이 움직입니다.");
		
	}
	public void () {
		
	}
	
}

class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이가 네발로 뜁니다.");
	}
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
	
}