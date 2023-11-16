package lotto1;

public class LottoE extends Lotto{

	 //당첨번호 생성 클래스 :Lotto 를 상속받아서 보너스 번호만을 처리
	
	private int bonus; //보너스번호

	//메서드
	//오버라이딩메서드 : randomLotto(),init(),toString,insertNumbers
	
	public int getBonus() {
		return bonus;
	}

	@Override
	protected void randomLotto() {
		// TODO Auto-generated method stub
		super.randomLotto(); //기존 메서드 numbers의 배열을 이미 채워진 상황
		while(true) {
			int r = random();
					if(!isContain(r)) {
						bonus =r;
						break;
					}
			}
		}

	@Override
	protected boolean isContain(int num) {
		// TODO Auto-generated method stub
		return super.isContain(num);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"["+bonus+"]";
	}

	@Override
	protected void insertNumbers(int[] arr) {
		// TODO Auto-generated method stub
		super.insertNumbers(arr);
	}
	
	
}
