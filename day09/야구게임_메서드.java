package day09;

import java.util.Scanner;

public class 야구게임_메서드 {

	public static void main(String[] args) {
		/*08 과제 ->메서드로 변경
		 * 랜덤번호 생성
		 * 배열에추가(중복제거메서드)
		 * 출력메서드
		 *------------
		 *위에는 과제와 같음
		 *------------
		 *스트라이크메서드 -개수리턴
		 *볼메서드 -개수리턴
		 */
		 int comNum[] = new int [3];
		 int myNum[] = new int [3];
		 
		 //랜덤수 범위
		 int count =9;
		 int start =1;
		 int s=0, b=0;
		 int cnt =0;
		 
		 Scanner scan = new Scanner(System.in);
		 randomArrat(comNum,count,start);
		 System.out.println(" > 야구게임시작");
		 System.out.println(" > 컴푸터가 수를 결정하였습니다.");
		 
		 while (s!=3) {
			 //사용자번호받기
			 System.out.println("1~9까지 숫자 3개 입력");
			 for (int i=0;i<myNum.length;i++) {
				 myNum[i]= scan.nextInt();
			 }
			 cnt++; //게임횟수 증가
			 //결과출력
			 s=strike(comNum,myNum);
			 b=ball(comNum,myNum);
			 
			 if(s!=0) {
				 System.out.println(s+"s ");
			 }
			 if(b!=0 ) {
				 System.out.println(b+"b ");
			 }
			 System.out.println();
			 System.out.println("게임횟수 : "+cnt);
			 if(s==0 && b==0) {
				 System.out.println("OUT");
			 }if (s==3) {
			 System.out.println("정답");
			 break;
			 }
				 
		 }
		 

		
		 for(int i=0;i<comNum.length;i++) {
			 comNum[i]=ranNum();
			 System.out.println(comNum[i]);
		 }
		
	}
	
	/*랜덤번호를 생성하는 메서드 : 매개변수로 범위를 설정
	 * (int)(Math.random()*9(9는 갯수))+1(1은 시작값);
	 * 매개변수 =>개수, 시작값
	 * if처리 => 개수와 시작값이 바뀌어서 들어올때 처리
	 * 
	 * */
	//랜덤번호
	public static void ranNum () {
		int ranNum =0;
			ranNum=(int)(Math.random()*9)+1;
	}
	//쌤이한거
	public static int random(int count,int start) {
		if(count<start) { //값이 바뀌어서 들어오는 경우
			int tmp =count;
			count = start;
			start = tmp;
		}
		return (int)(Math.random()*count)+start;
	}
	
	//중복확인메서드
//	public static int a (int comNum[],int myNum[]) { //내가했는데 뭔가 망함
//		for (int i=0; i<comNum.length;i++) {
//			for (int j=0;j<i;j++) {
//				
//					break;
//				}
//			}
//		}
//		return result ; }
	


	public static boolean isContain(int arr[],int num) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				return true;
			}
		}
		return false;
	}
	
	//배열생성 메서드
	//리턴 boolean : 배열이 잘 생성되면 true,아니면 false리턴
	//매개변수 : 배열,count,start
	
	public static boolean randomArray(int arr[],int count,int start) {
		if(arr==null) { //배열생성 X
			return false;
		}
		if(count < arr.length) {
			return false;
		}
		int i=0;
		while(i<arr.length) {
			int r = random(count,start);
			if(isContain(arr,r)) {
				arr[i]=r;
				i++;
			}
			}
		return true;
	}
	//배열출력메서드
	public static void printArray(int arr[]) {
		for(int tmp:arr) {
			System.out.println(tmp+" ");
		}
		System.out.println();
	}
	
	//스트라이크메서드
	//기능 : com[],my[]위치와 값이 입치라면 count리턴
	public static int strike(int com[],int my[]) {
		int cnt=0;
		for (int i=0;i<com.length;i++) {
			if(com[i]==my[i]) {
				cnt++;
			}
		}return cnt;
	}
	//볼메서드
	//기능 : com[],my[] 위치와 상관없이 일치하면 카운트 증가 리턴
	//위에서 만든 스트라이크를 빼면 볼의 개수만 리턴되게 하기
	public static int ball(int com[],int my[]) {
		int cnt = 0;
		for (int i=0;i<com.length;i++) {
			놓쳤다
		}
		
	}
	
	
	
	}
	
	


