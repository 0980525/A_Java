package day13;

public class 인터페이스01 {

	public static void main(String[] args) {
		/* 인터페이스 : 추상메서드와 상수(final)로만 이루어진 것(클래스라고 하지않음.)
		 * 추상메서드 : 선언부만 있고 구현은 없는 메서드
		 * 키워드 : abstract 이지만 인터페이스 에서는 키워드를 안붙여도 상관없음.
		 * 
		 * interface 인터페이스명 {
		 * -기능요약서
		 * -자체적으로 사용할 수는 없고, 인터페이스를 구현한 클래스로 활용
		 * -구현 키워드 : implements
		 * -인터페이스는 멤버변수가 없음. 이 부분을 염두에 두고 메서드 정리
		 * }
		 * 
		 * -상속은 단일상속이 원칙
		 * -구현은 여러개 가능
		 * */
		TV t=new TV();
		t.turnOn();
		t.chUp();
		t.chUp();
		t.chDown();
		t.turnOff();

	}

}

interface Power{
	abstract void turnOn();
	abstract void turnOff();
}
interface Remocon{
	void chUp();
	void chDown();
}

class TV implements Power,Remocon {//다중 구현가능

	private int ch;
	private boolean power;
	
	@Override
	public void chUp() {
		ch++;
//		if() {
//			
//		}
			System.out.println("현재채널 > "+ch);
		
	}

	@Override
	public void chDown() {
		ch--;
		System.out.println("현재채널 > "+ch);
		
	}

	@Override
	public void turnOn() {
		power=true;
		System.out.println("TV가 켜졌습니다.");
		
	}

	@Override
	public void turnOff() {
		power=false;
		System.out.println("TV가 꺼졌습니다.");
	} 
	
}