package day07;

import java.util.Scanner;

public class 과제 {
	
	static Scanner scan = new Scanner(System.in); //임포트하기 ctrl+shift+o

	public static void main(String[] args) {
		/* 계산기 (메서드로) 만들기
		 * 
		 * (+ - * / %) 각각 메서드 만들기 => 메서드에서 바로 출력
		 * 
		 * ex)3 5 (입력받음)=>메뉴(메뉴창 뜸 
		 * (:" 원하는 계산을 선택해주세요 > ") 
		 * 1-덧셈,2-뻴셈,3-곱셈,4-나눗셈,5-나머지
		 * 각 기능 메서드 바로출력할수 있게(3+5=8)
		 * 
		 * 1.숫자를 입력받는 메서드 =>숫자를 배열에 담아 리턴
		 * 2.메뉴메서드 =>메뉴를 출력하고, 메뉴의 번호를 입력받아 리턴
		 * 3.각 기능 메서드들
		 * 
		 * 메인에서는
		 * 1)1번 메서드 호출 =>숫자의 배열을 받기
		 * 2)2번 메서드 호출 =>내 선택번호 가져오기
		 * 3)seitch(번호) 
		 * 4)기능 메서드 호출
		 * */

		int num[]=numIn();
		int menunum=menu();
		
		switch(menunum) {
		case 1 : add(num);
			break;
		case 2 : min(num);
			break;
		case 3 : mul(num);
			break;
		case 4 : div(num);
			break;
		case 5 : rem(num);
			break;
			default: System.out.println("입력이 잘못되었습니다.");
			}
		
		
	} 

	/* 1. 숫자 입력 [배열]
	 * 리턴타입 : int[]
	 * 매개변수 : X
	 * 메서드명 : numIn //getnums
	 * 
	 * */
	public static int [] numIn() {
	    System.out.println("숫자를 입력해주세요");
		int []arr = new int[2]; 
		for (int i=0;i<arr.length;i++) {
			int a=scan.nextInt();
			arr[i]=a;
			}
			//for 문을 끊어줘야한다
		/* arr[0]=scan.nextInt();
		 * arr[1]=scan.nextInt(); 2개밖에 안되기때문에 입력해도 된다
		 * */
		
		return arr; //return은 배열(arr)을 return한다.
		} 
	
	/* 2. 메뉴
	 * 리턴타입 : int
	 * 매개변수 : 
	 * 메서드명 : menu
	 * 메뉴 5개 구문 출력 - 번호입력받기
	 * */
	public static int menu() {
		System.out.println("메뉴를 선택해주세요");
		System.out.print("1.더하기");
		System.out.print("2.빼기");
		System.out.print("3.곱하기");
		System.out.print("4.나누기");
		System.out.print("5.나머지");
		System.out.println();
		
		int menuNum = scan.nextInt();
		return menuNum;
	}
	
	/*메뉴를 받기위한 메서드가있어야함
	 * 입력된 숫자와 메뉴의 선택된 숫자를 받아서 switch 문으로
	 * case는 각 +-/*% 개로  break; 세트 /  default까지
	 * */
	
	// + 기능 
	 
	public static int add(int numIn[]) { //출력->리턴타입 void로 작성
		 
		System.out.print(numIn[0]+"+"+numIn[1] +"="+(numIn[0]+numIn[1])); 
		    
		return numIn[0]+numIn[1];
	}
	
	// - 기능
	public static int min(int numIn[]) {
		 
		System.out.print(numIn[0]+"-"+numIn[1] +"="+(numIn[0]-numIn[1])); 
		    
		return numIn[0]-numIn[1];
	}
	
	
	//기능 
	
	public static int mul(int numIn[]) {
		 
		System.out.print(numIn[0]+"*"+numIn[1] +"="+(numIn[0]*numIn[1])); 
		    
		return numIn[0]*numIn[1];
	}
	
	// / 기능
	
	public static int div(int numIn[]) {//입력된 숫자 호출
		 
		System.out.print(numIn[0]+"/"+numIn[1] +"="+((double)numIn[0]/numIn[1]));  //나누기에는 자료형변환 
		    
		return numIn[0]/numIn[1];
	}
	
	
	// % 기능 
	
	 public static int rem(int numIn[]) {//입력된 숫자 호출
		 
		System.out.print(numIn[0]+"%"+numIn[1] +"="+(numIn[0]%numIn[1])); 
		    
		return numIn[0]%numIn[1];
	}
	
	
}