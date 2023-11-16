package day18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SaleManager {

	//Menu클래스를 리스트로 구현
	
	private List<Menu> product = new ArrayList<>();//메뉴 멤버변수 1
	
	private ArrayList<Menu> order = new ArrayList<>(); //가격
	
	public SaleManager() {
		addMenu();
	}
	
	public void addMenu() { //2
		product.add(new Menu("햄버거",7000));
		product.add(new Menu("콜라",2000));
		product.add(new Menu("과자",3000));
		product.add(new Menu("피자",20000));
		product.add(new Menu("치킨",25000));
	}
	
	//메뉴리스트, 오더리스트 로 구현
	
	//메뉴추가, 주문처리
	public void add(Scanner scan) {
		System.out.println("메뉴명 : ");
		String menu = scan.next();
		System.out.println("가격 : ");
		int price = scan.nextInt();
		
		Menu m = new Menu(menu,price);
		product.add(m);
		System.out.println("메뉴추가완료");
	}
	//메인 메뉴 출력, 처리
	//1. 메뉴추가 2.메뉴출력 3.주문 4.주문리스트 5.종료
	
	//메뉴리스트
	public void printProduct() {
		System.out.println("--menu--");
		for(int i=0;i<product.size();i++) {
			System.out.println((i+1)+". "+product.get(i));
			
		}
		System.out.println("----------------");
	}
	
	//메뉴주문처리
	public void orderPick(Scanner scan) {
		System.out.println("주문메뉴 : ");
		//1.메뉴를 직접 한글로 받는 케이스
		//String menu = scan.next();
		
		//2.메뉴를 숫자로 받는 케이스
		int pick = scan.nextInt(); //번호 : index-1
		String tmpMenu = product.get(pick-1).getMenu();
		
		System.out.println("주문수량 : ");
		int count = scan.nextInt();
		int tmpPrice = product.get(pick-1).getPrice();
		
		Menu m = new Menu(tmpMenu,count);
	}
	//public SaleManager() {} //기본생성자 //안넣어도됨
	
//	public List<Menu> getMenuList() { //getter
//		return menuList;
//	}
//	public void setMenuList(List<Menu> menuList) { //setter
//		this.menuList = menuList;
//	}
//	
//	public void SaleMList(List<Menu> menuList) { //리스트구현
//		menuList=new ArrayList<>();
//		this.setMenuList(menuList);
//	}
//	
//
//	//private List<Menu> orderList; //가격
//
//
//	public void SaleMOrder(List<Menu> orderList) {
//		orderList=new ArrayList<>();
//		this.orderList = orderList;
//	}
//
//	public List<Menu> getOrderList() {
//		return orderList;
//	}
//
//	public void setOrderList(List<Menu> orderList) {
//		this.orderList = orderList;
//	}
	
//	private int newMenu;
//	private int menuAdd;
//	public void menuAdd() {}
//	private int order;





	
	
	
	
	
}
