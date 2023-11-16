package day16;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Menu {

	
	 
		    private List<String> menu = new ArrayList<>();
		    private List<Integer> price = new ArrayList<>();
		    private List<Integer> choice = new ArrayList<>();
		    private List<Integer> quantity = new ArrayList<>();
		    
		    public Menu() {
		        // 메뉴 항목 및 가격을 초기화
		        menu.add("1. 햄버거");
		        menu.add("2. 피자");
		        menu.add("3. 음료");
		        menu.add("4. 과자");
		        menu.add("5. 사탕");

		        price.add(7000);
		        price.add(15000);
		        price.add(3000);
		        price.add(2000);
		        price.add(1000);
		    }

		    public void choice() {
		        Scanner scan = new Scanner(System.in);
		        
		        while (true) {
		            System.out.println("--menu--");
		            for (String menuItem : menu) {
		                System.out.println(menuItem);
		            }
		            System.out.println("6. 프로그램 종료");
		            System.out.print("메뉴 번호 선택 > ");
		            int choice = scan.nextInt();
		            this.choice.add(choice); //
		            if (choice < 1 || choice > 6) {
		                System.out.println("잘못된 범위값입니다.");
		                continue;
		            } else if (choice == 6) {
		            	System.out.println("프로그램이 종료되었습니다.");
		                break;
		            }

		            System.out.print("메뉴 수량 선택 > ");
		            int quantity = scan.nextInt();
		            //위에 와 같이 해주고 
		            if (quantity <= 0) {
		                System.out.println("잘못입력하셨습니다.");
		                continue;
		            }

		            String selectedMenuItem = menu.get(choice - 1);
		            int itemPrice = price.get(choice - 1);
		            int totalCost = itemPrice * quantity;

		            System.out.println( " 주문 메뉴 " + selectedMenuItem + " " + quantity );
		            System.out.println("총 가격: " + totalCost + " 원");
		        }
		    }

		    public static void main(String[] args) {
		        Menu foodManager = new Menu();
		        foodManager.choice();
		    }
		}

