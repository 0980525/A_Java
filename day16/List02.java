package day16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List02 {

	public static void main(String[] args) { //선생님꺼 따라하다가 놓침
		/* --메뉴판--
		 * 1.햄버거 : 7000원
		 * 2.피자 : 15000원
		 * 3.음료수 : 2000원
		 * 4.과자 : 1000원
		 * 5.사탕 : 500원
		 * 6.프로그램 종료 
		 * 
		 * 메뉴를 선택 > 1
		 * 수량을 선택 > 2
		 * =>1번 햄버거 2개 주문 
		 * 주문을 끝내시려면 0을 눌러주세요
		 * 메뉴선택 > 3
		 * 수량 > 2
		 * =>3번 음료 2개주문
		 * 주문을 끝내시려면 0을 눌러주세요
		 * 주문 종료후 선택한 메뉴 리스트가 나와야함 (영수증처럼)
		 * --선택한 메뉴
		 * 햄버거 2개, 
		 * 음료 2개 선택
		 * 총 지불 금액 : 000원
		 * 
		 */
			FoodManager fm = new FoodManager();
			System.out.println(menu.get);
			}
		    
		}
		
		
	
		
		
		
		
	


class FoodManager{
	//멤버변수, ArrayList 메뉴, ArrayaList 가격
	//그 외 필요한 멤버변수는 선택
	
	private List<String> menu= new ArrayList<String>(); //메뉴
	private List<Integer> price = new ArrayList<Integer>(); //가격
	private int sum;
	private int totSum;
	
	private List<String> menu2 = new ArrayList<>();
	private List<Integer> price2 = new ArrayList<Integer>();
	
	public FoodManager() {
		menu.add("1. 햄버거 ");
		menu.add("2. 피자 ");
		menu.add("3. 음료 ");
		menu.add("4. 과자 ");
		menu.add("5. 사탕 ");
		price.add(7000);
		price.add(15000);
		price.add(3000);
		price.add(2000);
		price.add(1000);
	}
	
	//메서드
	/*메뉴를 선택 > 1
	 * 수량을 선택 > 2
	 * =>1번 햄버거 2개 주문 
	 * 주문을 끝내시려면 0을 눌러주세요*/
	//출력결과, 메뉴,add, sale()
//	public void choice() {
//		Scanner scan = new Scanner(System.in);
//		int j=0;
//		int c1 =0;
//		for (int i=0;;i++) {
//			System.out.println("메뉴를 1-6까지 중 선택");
//			i=scan.nextInt();
//			;
//			if(i<1 || i>6) {
//			System.out.println("잘못된 범위입니다.");
//			}else if(i==0) {
//				break;}
//			System.out.println("수량을 선택");
//			j=scan.nextInt();
//			
//			System.out.println(menu.get(i)+j+"개 주문");
//			}
//		}
	
	public void printMenu() {
		System.out.println("--menu--");
		
	System.out.println("1. 햄버거 : 7000 원");
	System.out.println("2. 피자 : ");
	System.out.println("3. 음료 : ");
	System.out.println("4. 과자 : ");
	System.out.println("5. 사탕 : ");
	System.out.println("메뉴선택 > ");
	}
	

	public void sale(int menu, int count) {
		//menu -1 = price의 인덱스번호로 사용
		sum = price.get(menu-1)*count; //하나의 주문에 대한 금액
		totSum +=sum;
		System.out.println("-------------");
		
		System.out.println("주문하신 메뉴는 "+this.menu.get(menu-1));
	
	}


}
	

		
		
		
		
	
