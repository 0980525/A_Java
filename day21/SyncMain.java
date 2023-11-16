package day21;

public class SyncMain {
	public static Bank myBank = new Bank(); //공유영역
	public static void main(String[] args) {
		// Thread 클래스를 상속받는 클래스 생성
		//홍길동이 가지고있는 계좌 - 홍길동+김순이(생활비계좌
		//잔액 만원-홍길동 5000원 출금,김순이 10000원 출금 -동시에
		//순서적인 처리를 위해 동기화(키워드 : synchronized)
		Hong h=new Hong();
		h.start();
		
		Kim k=new Kim();
		k.start();
		
	}

}

class Hong extends Thread{
	public void run() {
		//System.out.println("입금 전 잔액 : "+SyncMain.myBank.getMoney());
		System.out.println("입금시작");
		SyncMain.myBank.saveMoney(3000);
		System.out.println("입금 후 잔액 : "+SyncMain.myBank.getMoney());
	}
}
class Kim extends Thread{
	public void run() {
		//System.out.println("출금 전 잔액 : "+SyncMain.myBank.getMoney());
		System.out.println("출금시작");
		SyncMain.myBank.minusMoney(5000);
		System.out.println("출금 후 잔액 : "+SyncMain.myBank.getMoney());
	}
}

class Bank{
	private int money = 10000;
	
	//입금
	public synchronized void saveMoney(int save) {
		int m = this.money;
		try {
			Thread.sleep(3000);//1초 쉬기(1000=1초) sleep 쉬어가는 키워드
		} catch (Exception e) {
			e.printStackTrace();
		}
		setMoney(m+save);
	}


	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
		//출금
	
	public synchronized void minusMoney(int minus) {
		int m=this.money;
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		setMoney(m-minus);
	}
	
}