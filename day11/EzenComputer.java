package day11;

import java.util.Scanner;

public class EzenComputer {
	/* -EzenComputer 클래스 생성
	 * -학생의 기본정보 : 이름, 생년월일, 나이, 전화번호
	 * -학원정보 : 학원이름-지정
	 * -수강정보 : 수강과목,기간(2023-08-16~2024-03-14)
	 * 
	 * ex)홍길동, 990123 , 24, 010-4685-5555 =>학생정보출력
	 *    EZEN, 인천지점 =>학원정보 출력
	 *    자바(6개월), DB(1개월), html(2개월) =>수강정보 출력
	 * 기능 
	 * 학생 정보출력 학원정보출력 수강정보출력
	 * 학생의 수강정보를 추가하는 기능
	 * 
	 * */
	
		//final =>변경 불가능
		//멤버변수 선언
		private String name;
		private String birth;
		private int age;
		private String phone;
		public final static String company = "EZEN";
		private String branch;
		//수강정보 =>한사람이 여러 과목을 수강
		private String[]course = new String [5]; //수강과목 5개
		
		private String []period = new String[5]; // 수강기간 5개
		
		private int cnt; // 배열의 index처리를 위한 변수
		
		
		
		//생성자
		public EzenComputer (){}
		public EzenComputer (String name,String birth,int age,String phone) {
			this.name=name;
			this.birth=birth;
			this.age=age;
			this.phone=phone;
		}
		
		public EzenComputer(String name, String birth, int age, String phone, String branch) {
			//super(); //상속받을때 부모의 생성자
			this.name = name;
			this.birth = birth;
			this.age = age;
			this.phone = phone;
			this.branch = branch;
		}
		//생성자 출력 EzenComputer Ezen = new EzenComputer("이름", "생년월일", 42, "010-1111-2222");
		
		//메서드 (수강정보를 추가)
		
		//1.학생기본정보출력
		public void sPrint() {
			
			System.out.println(name+","+birth+","+age+","+phone+","+branch);
			
		}
		
		
		//학원정보출력
		public void aPrint() {
//			Scanner scan = new Scanner(System.in);
//			System.out.println("EZEN학원 지점을 입력해주세요.");
//			branch = scan.next();
//			scan.close();
			System.out.println(company +","+branch);
			
		}
		
		//수강정보출력
		public void coursePrint() { //배열이기때문에 for문으로 반복해서 찍기
			 if (course.length==0 ||cnt==0) {
				 System.out.println("수강이력이 없습니다.");
				 return; //출력을 멈추고 메서드 끝내기
			 }
			 //추가된 과목이 있다면 ...
			//Scanner scan = new Scanner(System.in);
			
//			System.out.println("자바,DB,html,spring,jsp 중");
//			System.out.println("코스를 입력해주세요");
			//course[0] = scan.next(); 번지에 입력받기
			for(int i=0;i<cnt;i++) { //과목이 추가되면 cnt1증가
				System.out.print(course[i]+"("+period[i]+" 개월" +")");
				}
//				course[i]=scan.next();
//				cnt++;
			//과목이 추가되면 cnt증가 //여기 밑으로 다시 봐야함
//			setPeriod(period);
//			String period = scan.next();
//			scan.close();
			
			
			
		}
		//수강정보추가
		public void sInfor(String course, String period) {
			this.course[cnt] = course;
			this.period[cnt] = period;
			cnt++;
			System.out.println(course+period);
			
		}
		//getter / setter
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getBirth() {
			return birth;
		}
		public void setBirth(String birth) {
			this.birth = birth;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getBranch() {
			return branch;
		}
		public void setBranch(String branch) {
			this.branch = branch;
		}
		public String[] getCourse() {
			return course;
		}
		public void setCourse(String[] course) {
			this.course = course;
		}
		public String[] getPeriod() {
			return period;
		}
		public void setPeriod(String[] period) {
			System.out.println("개월수를 입력해주세요");
			//여기에 모양을 바꿔야할거같은데 몰겟삼
			this.period = period;
		}
		public int getCnt() {
			return cnt;
		}
	
	

	
}
