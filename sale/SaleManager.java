package sale;

import java.util.ArrayList;
import java.util.Scanner;

import day12.Product;

public class SaleManager {

	private ArrayList<Menu<String, Integer>> product = new ArrayList<>();
	private ArrayList<Menu<String,String>> order = new ArrayList<>();
	
private int totSum = 0;
	
	public SaleManager() {
		addMenu();
	}
	
	public void addMenu() {
		product.add(new Menu("햄버거",7000));
		product.add(new Menu("피자",15000));
		product.add(new Menu("음료",2000));
		product.add(new Menu("과자",1000));
		product.add(new Menu("사탕",500));
	}
	
	//메뉴 추가 기능
	public void add(Scanner scan) { //매개변수 메인에서 스캐너 받아옴
		System.out.println("메뉴명: ");
		String menu = scan.next();
		System.out.println("가격:");
		int price = scan.nextInt();
		
		Menu m = new Menu(menu, price);
		product.add(m);
		System.out.println("메뉴 추가 완료~!!");
	}
	//메뉴리스트
	public void printProduct() {
		System.out.println("---menu---");
		for(int i=0; i<product.size(); i++) {
			System.out.println((i+1)+". "+product.get(i));
		}
		System.out.println("-----------");
		product.get(0).getPrice() // get(product의 0번지) / 0번지를 출력하려고하면 0번지의 toString이 리턴됨 / toString이 없으면 : 주소가 나옴
	}
	
	
	//주문 처리
	public void orderPick(Scanner scan) {
		System.out.println("주문메뉴:");
		//1. 메뉴를 직접 한글로 받는 케이스
		//String menu = scan.next(); //햄버거
		
		//2. 메누를 숫자로 받는 케이스
		int pick = scan.nextInt(); //번호 : index-1
		String tmpMenu =product.get(pick-1).getMenu(); 
		/*product.get(pick-1)여기까지가 product의 get(번지)의 저장된 메뉴 클래스로 구성된 객체*/
		//.getMenu()는 product 0번지에 존재하는 메뉴객체의 멤버변수메뉴의 값
		//
		if(tmpMenu == null) {
			System.out.println("찾는 메뉴가 없습니다.");
			return;
		}else {
			System.out.println("주문수량:");
			int count = scan.nextInt();
			int tmpPrice = product.get(pick-1).getPrice(); //햄버거 가격
			totSum += (tmpPrice*count); 
			Menu m = new Menu(tmpMenu, count); //메뉴와 개수
			order.add(m);
		}
	}
	
	//주문리스트
	public void printOrder() {
		int sum = 0;
		int index=1;
		for(Menu m : order) {
			String menu = (String)m.getMenu();
			int price = findMenu(menu);
			System.out.println(index+". "+m+"   "+((int)m.getPrice()*price));
			index++;
		}
		System.out.println("-------------");
		System.out.println("주문 총액 : "+totSum);
	}
	
	public int findMenu(String menu) {
		for(Menu m : product) {
			if(m.getMenu().equals(menu)) {
				return (int)m.getPrice();
			}
		}
		return -1;
	}

}
