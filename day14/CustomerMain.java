package day14;

public class CustomerMain {

	public static void main(String[] args) {
		
		Customer [] customerList = new Customer[10];
		
		Customer cLee = new Customer(1001, "이서연");
		Customer chong = new CustomerGold(1002, "홍하민");
		Customer cKim = new CustomerVip(1003, "김지아", 2210);
		int cnt=0;
		customerList[cnt]=cLee;
		cnt++;
		customerList[cnt]=chong;
		cnt++;
		customerList[cnt]=cKim;
		cnt++;
		
				
//		int price = cKim.calcPrice(10000);
//		System.out.println("지불금액 : "+price);
//		cKim.customerInfo();
		
		System.out.println("--고객 정보 출력--");
		//for문을 활용한 고객정보 출력
		for(int i=0;i<cnt;i++) {
			
			customerList[i].customerInfo();
		}
		
		
		System.out.println("--할인률과 포인트 계산-- ");
		int price =100000;
		//instanceof 를 활용한 조건식을 넣어서 true/false
		for(int i=0;i<cnt;i++) {
			System.out.println(customerList[i].getCustomerName()+"님이 지불하실 금액은 "+
					customerList[i].calcPrice(price)+"보너스포인트는 "+customerList[i].bonusPoint); //<리스트 배열 i번지에서 이름, 할인률,보너스포인트 메서드를 불러와 출력
		}
		//다운캐스팅 : 부모의 공유되는 멤버변나 메서드가 아닌 자식의 고유 멤버변수나 메서드를 호출하고자 할때 필요
		//반드시 명시적으로 형변환해야함 / instanceof 원래 그 형태가 맞는지 체크하는 명령어 true/false
		
		System.out.println();
		
		for (int i=0;i<cnt;i++) {
			
			Customer vip = customerList[i] ; //주소만 복사(객체생성X)
			if( vip instanceof CustomerVip) {
				CustomerVip tmp = (CustomerVip)vip;
				if(tmp.getAgentID()==2210) {
				tmp.setAgentID(3310);
				}
				tmp.customerInfo();
//				customerList[i] = tmp;
				
				
			}
			
		}
	
	
	
	}
}


