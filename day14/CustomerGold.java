package day14;

public class CustomerGold extends Customer {
	
	/*멤버변수 :
	 * 고객ID : int customerID
	 * 고객 이름 : String customerName
	 * 고객 등급 : String customerGrade
	 * 보너스포인트 : int bonusPoint 
	 * 보너스포인트적립비율 : double bonusRatio 0.02%
	 * 할인률 : double saleRatio 0.1
	 * Gold등급
	 * 제품할인 10% / 보너스 포인트 2%적립
	 * */
	public double bonusRatio = 2;
	double saleRatio=0.1;
	
	public CustomerGold() {}
	
	public CustomerGold(int ID, String Name) {
		super(ID, Name);
		customerGrade = "Gold";
		bonusRatio = 0.02;
		saleRatio = 0.1;
		
	}
	//메서드 중 할인금액을 리턴할 수 있도록 오버라이딩
	@Override
	public int calcPrice(int price) {
		bonusPoint = bonusPoint+(int)(price * bonusRatio);
		price = price - (int)(price*saleRatio);
		return price ;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}

	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}

	public double getSaleRatio() {
		return saleRatio;
	}

	public void setSaleRatio(double saleRatio) {
		this.saleRatio = saleRatio;
	}
	
	
	
	
}
