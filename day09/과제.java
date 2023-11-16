package day09;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 클래스 객체 생성(2명분) 후 출력
		 * 값을 입력후 정보 출력*/
		student S= new student();
		S.setX("sua");
		S.setY(6);
		S.setZ("010-4862-4852");
		S.setW("인천광역시 남동구");
        S.print();
        
        student S2 = new student();
        
        //생성자호출 -this사용
        //호출은 반드시 첫줄에서만 가능
        //생성자 오버로딩 가능
        //조건)매개변수 개수가 다르거나, 매개변수 유형이 다르거나
        
        S2.setX("jia");
        S2.setY(8);
        S2.setZ("010-8046-7825");
        S2.setW("인천광역시 남동구");
        S2.print();
        
        //입력받기
        student s3 = new student();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("이름 : ");
        s3.setX(scan.next());
        System.out.println("나이 : ");
        s3.setY(scan.nextInt());
        System.out.println("전화번호 : ");
        s3.setZ(scan.next());
        System.out.println("주소 : ");
        s3.setW(scan.next());
        s3.print();
        
        
        //입력받기-메서드
        student s4 = new student();
        s4.input("sua", 9, "010-1533-7853", "인천광역시");
        s4.print();
        scan.close();
        
        student s5 = new student("dio",8); //<shgcla
        s5.print();
	    }

}
/*클래스 생성
 * 학생 클래스 생성
 * 이름, 나이, 전화번호
 * 
 * 출력 양식
 * 이름(나이) 전화번호 */

class student {
	
	//멤버변수
	private String x;
	private int y;
	private String z;
	private String w;
	
	//생성자위치
	public student() {} //기본생성자 컴파일러가 자동으로 생성해줌/생성자 추가하면 생성자 안둠/초기값 안써도 생성해두기
	public student(String x,int y) { //내가 만든 생성자
		this.x = x;
		this.y = y;
	}
	
	
	public String getW() {
		return w;
	}
	public void setW(String w) {
		this.w = w;
	}
	public String getX() {
		return x;
	}
	public void setX(String x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String getZ() {
		return z;
	}
	public void setZ(String z) {
		this.z = z;
	}
	public void print() {
		System.out.println("이름 : "+x +"("+"나이 : "+ y +")" + "전화번호 : " + z);
		System.out.println("주소 : "+w );
	}
		public void input(String x,int y,String z,String w) {
			//this(x,y); //왜 안됨,,? 생성자 호출 실패
//			this.x = x;//<여기 잘 모르겠음 왜 this ? 이거 setter특징같은데 >
//			this.y = y;
			this.z = z;
			this.w = w;
		}
		
	
}
