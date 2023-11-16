package day12;

public class Class06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EzenStudent ez = new EzenStudent("인천", "홍길동", "자바", "010-1111-5555");
		
		//객체를 출력하면 자동으로 toString 메서드를 호출
		ez.print();
		EzenStudent ez1 = new EzenStudent(null, null, null, null);
		ez1.print();
	}

}


//생성자는 자동상속안됨 호출해서 불러와야함

/* 멤버변수 : 지점, 이름, 반, 전화번호
 * 생성자 -자동생성 가능! 소스-Constructor using  
 * 메서드 : 출력(print메서드) 자동출력가능! 소스-to String
 * getter/setter 자동생성가능! 소스-getter/setter
 */

/* 객체를 초기화 하느 ㄴ방법 : 기본값(null,0), 명시적 초기값, 초기화블럭
 * 명시적 초기화 : 멤버변수의 선언과 동시에 초기값을 명시
 * 초기화 블럭 : {  }멤버변수를 초기화
 * 생성자 : 객체를 초기화하는 방법
 * 
 * 초기화 우선순위
 * 기본값 null -> 명시적 초기값 -> 초기화블럭 -> 생성자
 * 
 * */


class EzenStudent{
	 private String std;
	 private String branch;
	 private String group;
	 private String phone;
	 
	 {
		 //초기화블럭
		 branch = "서울";
		 group = "미정";
		 
		 
	 }
	 
	 
	 
	 public EzenStudent() {} //생성자
	 public EzenStudent(String branch,String std, String group,String phone) {
		 this.branch=branch;
		 this.std=std;
		 this.group=group;
		 this.phone=phone;
	 }
	 
	 
	 
//	 @Override 
//	 public String toString() {
//		return "EzenStudent [std=" + std + ", branch=" + branch + ", sub=" + sub + ", phone=" + phone + "]";
//	}
	//	 public EzenStudent(String std, String branch, int sub, String phone) {
//		super();
//		this.std = std;
//		this.branch = branch;
//		this.sub = sub;
//		this.phone = phone;
//	}
	public void print() {
		 System.out.println("지점 : "+branch+" 이름 : "+std+" 반 : "+group+" 전화번호 : "+phone);
	 }
	 
	public String getStd() {
		return std;
	}
	public void setStd(String std) {
		this.std = std;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getgroup() {
		return group;
	}
	public void setgroup(String group) {
		this.group = group;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
 }