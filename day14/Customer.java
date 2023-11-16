package day14;

public class Customer {

	/* 고객 클래스 
	 * 등급 : 일반,골드,VIP
	 * 멤버변수 :
	 * 고객ID : int customerID
	 * 고객 이름 : String customerName
	 * 고객 등급 : String customerGrade
	 * 보너스포인트 : int bonusPoint
	 * 보너스포인트적립비율 : double bonusRatio
	 * 
	 *  - Customer객체 생성시 
	 *  기본 등급 = silver
	 *  기본 보너스포인트적립비율 =0.01
	 *  
	 *  메서드 
	 *  보너스 적립계산 메서드(calcPrice(int price))
	 *     =>보너스를 적립하고, 할인여부 체크하여 구매price리턴/s-할인X/G-할인 10%/VIP-할인 20%
	 *     =>구매 금액을 주고, 적립보너스 계산, 보너스 포인트 누적, 실구매금액 리턴
	 * 출력메서드 (customerInfo())
	 * 홍길동님의 등급은 VIP이며, 보너스 포인트는 1000입니다.
	 * 전담상담사 번호는 2222입니다. -VIP만 출력
	 * Silver등급
	 * 제품할인 X / 보너스포인트 1%적립
	 * Gold등급
	 * 제품할인 10% / 보너스 포인트 2%적립
	 * VIP등급
	 * 제품할인 20% / 보너스포인트 5%적립 / 전담상담사를 갖는다. int agentID
	 * 
	 * */
	
	//멤버변수 선언 <<protected로 선언해도 ㄱㅊ
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	protected int bonusPoint;
	protected double bonusRatio;
	
	//생성자
	public Customer() {}

	public Customer(int customerID, String customerName) {
		
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER"; //<기본생성자에 넣을수는 있지만 이름과 아이디가 나오는곳에 넣어준다.
		bonusRatio = 0.01;
	}
	//메서드
	//가격을 매개변수로 받아 포인트 적립. 가격을 리턴
	public int calcPrice(int price) {
		bonusPoint = bonusPoint + (int)(price*bonusRatio);
		return price;
	}
	//고객 정보 출력
	public void customerInfo() {
		System.out.println(customerName+"님의 등급은 "+customerGrade+"이며, 보너스 포인트는 "+bonusPoint+"입니다.");
	}
	//toString 형채로 리턴
	
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerGrade=" + customerGrade + ", bonusPoint="
				+ bonusPoint + "]";
	}
	
	//getter/setter
	public int getCustomerID() {
		return customerID;
	}


	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}

	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	
	
}



