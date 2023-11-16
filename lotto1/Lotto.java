package lotto1;

import java.util.Arrays;
import java.util.Random;

public class Lotto {
	//사용자 번호를 출력하는 로또클래스 (상속해줘야함)
	protected int numbers[]=new int [6];
	
	//메서드
	//random번호를 생성
	//Random().nextInt(범위)+시작값
	
	protected int random() {
		return new Random().nextInt(45)+1;
	}
	//랜덤번호를 6개 numbers에 저장하는 메서드/중복 안됨
	protected void randomLotto() {
		//초기화 
		init();
		int cnt=0;
		while(cnt<6) {
			int r=random();
			if (!isContain(r)) { //중복되지 않는 다면 !
				numbers[cnt]=r;
				cnt++;
				
			}
		}
	}
	
	//중복번호가 있는지 체크하는 메서드
	protected boolean isContain(int num) {
		if(num<0 || num>45) {
			System.out.println("숫자의 범위가 1~45까지 입니다.");
			return false;
		}
		for(int tmp : numbers) {
			if (tmp ==num) {
				return true;
			}
		}return false;
	}
	
	//배열을 초기화하는 메서드
	private void init() {
		numbers = new int [6]; //기존배열을 버리고 새 배열로 연결
		
	}
	//1개의 번호 확인 =>toString
	@Override
	public String toString() {
		return  Arrays.toString(numbers) ;
	}
	
	//수동 번호 생성 
	//매니저 클래스 에서 입력받아서 ->메서드 호출 사용
	//매개변수로 배열을 주면,numbers로 복사
	protected void insertNumbers(int arr[]) {
		if(arr.length < numbers.length) {
			System.out.println("배열의 길이가 작습니다.");
		}
		//배열복사 arraycopy
		System.arraycopy(arr, 0, numbers, 0, arr.length);
		
	}
	//getter생성 - setter필요없음
	public int[] getNumbers() {
		return numbers;
	}
	
	
	
	
}
