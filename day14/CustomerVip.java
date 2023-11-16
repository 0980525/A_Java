package day14;

public class CustomerVip extends Customer{
	/*멤버변수 :
	 * 고객ID : int customerID
	 * 고객 이름 : String customerName
	 * 고객 등급 : String customerGrade
	 * 보너스포인트 : int bonusPoint
	 * 보너스포인트적립비율 : double bonusRatio 0.05
	 * 할인률 : double saleRatio 0.2
	 * 전담상담사 : agentID
	 * VIP등급
	 * 제품할인 20% / 보너스포인트 5%적립 / 전담상담사를 갖는다. int agentID*/
	
	private double saleRatio=0.2;
	private int agentID = 454;
	
	public CustomerVip() {}

	public CustomerVip(int ID, String Name, int agentId) {
		super(ID, Name);
		customerGrade="VIP";
				bonusRatio = 0.05;
				saleRatio = 0.2;
				agentID = agentId;
	}

	@Override
	public int calcPrice(int price) {
		// TODO Auto-generated method stub
		return super.calcPrice(price);
	}

	@Override
	public void customerInfo() {
		
		super.customerInfo();
		System.out.println("담당 상담원 번호는 "+agentID+"입니다");
	}

	public double getSaleRatio() {
		return saleRatio;
	}

	public void setSaleRatio(double saleRatio) {
		this.saleRatio = saleRatio;
	}

	public int getAgentID() {
		return agentID;
	}

	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}
	
}

