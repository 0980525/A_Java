package studentmanager;

import java.util.HashMap;

public class Std {

	
		/* 아이템 선정->메뉴구성->클래스 (컬렉션)
		 * 1.학생추가 | 2.학생리스트 | 3.학생검색
		 * 4.학생수정 | 5. 학생삭제 | 6.과목추가
		 * 7.점수수정 | 8. 과목삭제 | 9.종료
		 * 
		 * subjec=>map<과목 ,점수>
		 * 0.인터페이스 생성
		 * 1. 학생 클래스
		 * 2.main test를 위해
		 * 3.manager 처리
		 */
	//멤버변수 : 이름 , 나이, 전화번호 ,MAP<과목,점수>, 합ㄱㅖ,평균, 
	
	private String name;
	private int age;
	private String phone;
	private HashMap<String, Integer> subject = new HashMap<>();
	private int sum;
	private double avg;
	
	
	//생성자 : 객체 생성시 초기값을 설정
	public Std() {}
	public Std(String name) {
		this.name=name;
		this.age = 15;
	}
	public Std(String name, int age, String phone) {
		
		this.name = name;
		this.age = age;
		this.phone = phone;
		
	}
	//메서드등록
	//각 학생별 본인의 점수 등록,출력,삭제,수정(삭제->추가)
	
	public void printOne() { //학생 검색시 나오는 출력화면
		System.out.println(name+"("+age+")");
		if(phone != null) {
			System.out.println(phone);
		}
	printSubject();
	calc();
	if(sum != 0) {
		System.out.println("result : "+sum+"["+avg+"]");
	}else {
		System.out.println("점수가 없습니다.");
	}
	}
	
	//수강정보 합계,평균 출력,점수가 없으면 없습니다.출력
	
	//subject 출력메서드
	public void printSubject() {
		for(String tmp : subject.keySet()) {
			System.out.println(tmp+":"+subject.get(tmp));
		}
	}
	//subject합계평균
	public void calc() {
		for(String tmp : subject.keySet()) {
			sum+=subject.get(tmp);	
		}
		avg = (double)sum / subject.size();
	}
	
	//과목/점수등록
	public void addSubject(String subject,int score) {
		this.subject.put(subject, score);
		System.out.println("점수추가완료");
		
	}
	//과목/점수 삭제
	public void delSubject(String subject) {
		if(this.subject.remove(subject)==null) {
			System.out.println("해당과목이 없습니다.");
			return;
		}else {
			this.subject.remove(subject);
			System.out.println("해당 과목이 삭제됐습니다.");
		}
	}
	
	//getter/setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public HashMap<String, Integer> getSubject() {
		return subject;
	}
	public void setSubject(HashMap<String, Integer> subject) {
		this.subject = subject;
	}
	
	
	
	

}
