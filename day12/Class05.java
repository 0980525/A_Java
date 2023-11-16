package day12;

public class Class05 {

	public static void main(String[] args) {
		/* static이 붙은 멤버변수 / 메서드들은 클래스멤버변수/메서드라고 한다.
		 * static이 안붙은 멤버변수 / 메서드들은 객체(인스턴스)멤버변수 라고한다.
		 * 
		 * - 객체 멤버변수 /메서드들은 객체를 통해 사용되고, 생성된다.
		 * - 각 객체마가 독립적으로 변수/ 메서드가 사용된다.
		 * 
		 * - 클래스 멤버변수/메서드는 클래스를 통해 사용된다.
		 * - 클래스명.메서드/변수 호출
		 * (객체를 통해서 호출이 가능하나 일반적이지않다)
		 * -클래스 멤버변수는 하나의 멤버변수를 모든 객체가 공유(사용)한다.
		 * -모든 객체(하나의 클래스를 통해 생성되는 )들이 동일한 겂을 사용한다면 static을 붙이는 것을 고려
		 * 
		 * 클래스/객체변수들은 생성시점이 달라서 메서드에서 사용될수 있는 환경이 다르다.
		 * - 겍체 멤버는 이미 클래스가 생성된 후에 생성 / 클래스의 멤버메서드를 객체에서는 사용할 수 있다.
		 * - 클래스의 멤버변수는 클래스/객체의 멤버네서 모두 사용가능하다.
		 * - 클래스 멤버 메서드는 클래스/객체의 멤버에서 모두 사용가능하다.
		 * - 객체 멤버변수는 (static이안붙은)클래스 멤버베서드(static이 있는)에서 사용할수 없다. (객체를 생성 해야지만 사용가능)
		 * - 객체 멤버 메서드도 클래스 멤버메서드에서 사용할 수 없다.(객체를 생성 해야지만 사용가능)
		 * */
		TV.printBrand(); //클래스명.메서드명 으로 호출
		System.out.println();
		TV t = new TV();
		t.isPower();
		t.printBrand();//클래스 멤버 메서드 호출 (굳이 사용하지는 않는 방법)

	}

}
class TV{
	private boolean power;
	//final : 최종의 . 수정 불가
	private final static String brand = "Samsung";
	public void isPower() {
		System.out.println("제조사 : "+brand);
		if(!power) {
			power = true;
			System.out.println("Tv가 켜졌습니다.");
		}else {
			power = false;
			System.out.println("Tv가 꺼졌습니다.");
		}
	}
	public static void printBrand() {
		System.out.println("제조사 : "+brand);
		//클래스 메서드에서 객체의 변수 사용 불가
		//System.out.println("전원 : "+power);
	}
}