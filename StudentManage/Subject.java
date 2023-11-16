package StudentManage;



public class Subject {
	
	/* 과목클래스 : 한 과목의 기본 정보를 나타내는 클래스
	 * -과목코드int subCode,과목명String subName,학점int grade,시수(시간)int subHour,교수명String professor,학기int term,시간표String timeTable(생성자구성은 몇가지만!)
	 * -멤버변수 선언, 생성자 , getter/setter호출 그외 필요한 메서드
	 * -toString, print 메서드 정도
	 * 
	 */
//멤버변수선언	
	private int subCode;
	private String subName;
	private int grade;
	private int subHour;
	private String professor;
	private int term;
	private String timeTable;
	
	
//생성자	
	public Subject() {}

	public Subject(int subCode, String subName, int grade, int subHour, String professor, int term, String timeTable) {
		
		this.subCode = subCode;
		this.subName = subName;
		this.grade = grade;
		this.subHour = subHour;
		this.professor = professor;
		this.term = term;
		this.timeTable = timeTable;
	}

	public Subject(int subCode, String subName, int grade, String professor) {
		
		this.subCode = subCode;
		this.subName = subName;
		this.grade = grade;
		this.professor = professor;
	}
	public Subject(String subName) {
		this.subName = subName;
	}
//getter/setter
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

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getSubHour() {
		return subHour;
	}

	public void setSubHour(int subHour) {
		this.subHour = subHour;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	public int getTerm() {
		return term;
	}

	public void setTerm(int term) {
		this.term = term;
	}

	public String getTimeTable() {
		return timeTable;
	}

	public void setTimeTable(String timeTable) {
		this.timeTable = timeTable;
	}
	
//	public String []subarr( int subCode, String subName, int grade, String professor) {
//		
//		subarr[0]=new Subject(1, "Java", 3, "오미란");
//				return Subject []subarr = new Subject[5];
//	}
	
	//@Override
	//toString
	//필요한 메서드 
	public String toString() {
		return "[ 과목코드 = " + subCode + ", 과목명 = " + subName + ", 학점 = " + grade + ", 담당교수 = " + professor+ "]";
	}

	public void subprint () {
		System.out.println("과목코드 : "+ subCode +" 과목명 : "+ subName +" 학점 : "+ grade +" 담당교수 : "+ professor);
		
	}
	
	
	
}
