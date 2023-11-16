package lotto1;

import java.util.Scanner;

public class LottoManager implements LottoProgram{

	//멤버변수 선언
	LottoE lotto[]=new LottoE[5]; //당첨번호 배열 리스트
	Lotto user = new Lotto(); //사용자번호
	int cnt=0; //당첨번호의 index역할
	
	public void printMenu() {
		System.out.println("로또 프로그램");
		System.out.println(" 1.로또번호 입력(수동)");
		System.out.println(" 2.로또번호 생성(자동)");
		System.out.println(" 3.당첨번호 생성(자동)");
		System.out.println(" 4.당첨번호 등수체크 ");
		System.out.println(" 5.당첨번호 리스트 확인");
		System.out.println(" 6.종료");
		System.out.println("메뉴입력 > ");
	}
	
	@Override
	public void createLotto(Scanner scan) {
		// 로또 수동입력 메뉴
		System.out.println("로또번호 입력(중복X, 숫자6개,범위1-45까지)");
		int tmp[] =new int[6];//입력받을 임시배열 변수
		for(int i=0;i<tmp.length;i++) {
			tmp[i]=scan.nextInt();
			
		}
		//중복체크 후
		if(isDuplicated(tmp)) {
			System.out.println("오류발생");
		}else {
			user.insertNumbers(tmp);
			printLotto("로또번호 : "+ user); //어디선가 에러나서 출력못해봄
		}
	}
	
	public void printLotto(String str) {
		System.out.println("-------------");
		System.out.println(str);
	}
	
	//수동으로 입력한 배열안의 같은 수가 포함되어있는지 체크
	public boolean isDuplicated(int[]arr) {
		for(int i=0;i<arr.length;i++) {
			for (int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					return true;
				}
			}
		}
		//범위체크
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0 || arr[i]>45) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void createLottoAuto() {
		//자동번호생성 
		user.randomLotto();
		printLotto("Lotto"+user); //잘나오는지 확인
	}

	public void insertLotto(Scanner scan) {
		//당첨번호 수동입력
		System.out.println("로또번호 입력(중복X, 숫자7개,범위1-45까지,보너스는 마지막)");
		int tmp[]=new int [7];
		for (int i=0;i<tmp.length;i++) {
			tmp[i]=scan.nextInt();
		}
		//중복,범위 이탈 케이스발생
		if(isDuplicated(tmp)) {
			System.out.println("오류발생~!");
		}else {
			if(lotto.length==cnt) { //배열복사한거 
				LottoE []arr = new LottoE[lotto.length+5];
				System.arraycopy(lotto, 0, arr, 0, lotto.length);		
				lotto = arr;
				}
			LottoE tmpLotto = new LottoE();
			tmpLotto.insertNumbers(tmp);
			
			lotto[cnt] = tmpLotto;
			cnt++;
			printLotto("당첨번호 : "+tmpLotto);
		}
		
		
	}
	
	@Override
	public void insertLottoAuto() {
		// 당첨번호 자동생성 /로또객체 필요
		//배열복사 
		
		LottoE tmp = new LottoE();
		tmp.randomLotto();
		lotto[cnt]=tmp;
		cnt++;
		printLotto("Lotto "+tmp);
		
		
	}

	@Override
	public void checkLotto() {
		// 당첨확인메서드
		if(user.isContain(0)) { //로또번호를 생성하지 않은 경우
			System.out.println("사용자번호를 입력해주세요");
			return;
			
		}
		//로또당첨번호가 없을 경우
		if(cnt==0) {
			System.out.println("당첨번호를 생성해주세요");
			return;
		}
		
		//1. 일치하는 개수 count변수선언
		int count=0;
		//2. 마지막에 저장된 당첨번호 객체가져오기
		LottoE tmp = lotto[cnt-1];
		//3.for 문으로 일치 갯수 확인
		for(int i= 0;i<user.getNumbers().length;i++) {
			//최신당첨번호의 i번지 1개의 값을 num으로 저장
			int num = tmp.getNumbers()[i]; //당첨번호 첫번째 값
			//user배열에 num가 있는지 확인
			if(user.isContain(num)) {
				count++;
			}
		}
		//4.rank확인
		int rank = -1;
		switch(count) {
		case 6 : rank =1; break;
		case 5 : 
			if(user.isContain(tmp.getBonus())) {
				rank=2;
			}else {
				rank=3;
			}
			break;
		case 4 : rank =4;
		case 3 : rank =5;
		default : 
			break;
		}
		if(rank != -1) {
			System.out.print(count+"개 일치!");
			System.out.println(rank+"등 당첨!");
			
		}else {
			System.out.print(count+"개 일치!");
			System.out.println("꽝");
		}
		
		
		
	}

	@Override
	public void printLotto() {
		// 전체당첨리스트
		//for문 이용 lotto배열 출력
		System.out.println();
		System.out.println("-------역대당첨번호리스트------");
		for(int i =cnt-1;i>=0;i--) { //역순으로 찍기
			System.out.println((i+1)+"회차 당첨번호 : "+lotto[i]);
		}
		
	}

}
