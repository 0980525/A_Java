package day19;

import java.util.ArrayList;

public class 과제 {
	
	/* 수강관리프로그램 list
	 * 1.학생등록 |2.학생검색 |3.학생리스트 |4.수강신청 |5.수강철회 |6.종료 
	 * subject 도 list로 처리
	 * 기존에 했던 베열의 수강관리프로그램을 List로 변경해서 구현
	 * stream도 할수있는 부분이 있다면 하셈(출력부분)
	 */
	
	
	
	
	
	
}
class Subject{
	 
	
	private int subCode;
	private String subName;
	
	
	
	public Subject() {}

	public Subject(String subName,int subCode) {
		
		this.subCode = subCode;
		this.subName = subName;
		
	}


	public int getSubCode() {
		return subCode;
	}

	public void setSubCode(int subCode) {
		this.subCode = subCode;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	

	@Override
	public String toString() {
		return "과목 코드" + subCode + ", 과목명=" + subName ;
	}
	
	
}
class Student2{
	
	 
	
	private int idNum;
	private String stdName;
	
	private ArrayList<Subject> sub =  new ArrayList<>();
	
	public Student2() {}

	public Student2(String stdName,int idNum) {
		
		
		this.idNum = idNum;
		this.stdName = stdName;
		
	}
	
	
	
	
	
	
	
	
}
