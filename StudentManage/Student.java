package StudentManage;


public class Student {
	
	/* 학생클래스 : 한 학생의 정보를 나타내는 클래스 
	 * -학번schNum, 이름name, 주민번호idNum, 학부faculty,학과major, 과목subject[]-삽입메서드[과목클래스를 배열로 생성,5]
	 * -멤버변수 선언, 생성자, getter/setter,기타메서드
	 * -(학생이 수강을 신청하는 메서드[]추가-배열이 찼다면 새로운 배열로 배열복사(할수있는 사람만), 철회하는 메서드,기타 출력)
	 * 
	 */
//변수선언
	private int stdNum; 
	private String stdname;
	private int idNum;
	private String faculty;
	private String major;
	private Subject subjectlist[] = new Subject[5];//배열 new 만들기!
	private int subCnt=0; //배열의 인덱스처리를 위한 변수
//생성자
	public Student() {}
	public Student(int stdNum, String stdname, int idNum, String faculty, String major) {
	
	this.stdNum = stdNum;
	this.stdname = stdname;
	this.idNum = idNum;
	this.faculty = faculty;
	this.major = major;
	
	}
	
	
	public Student(int stdNum, String stdname) {
		super();
		this.stdNum = stdNum;
		this.stdname = stdname;
	}
//getter/setter
	public int getStdNum() {
		return stdNum;
	}
	public void setStdNum(int stdNum) {
		this.stdNum = stdNum;
	}
	public String getStdname() {
		return stdname;
	}
	public void setStdname(String stdname) {
		this.stdname = stdname;
	}
	public int getIdNum() {
		return idNum;
	}
	public void setIdNum(int idNum) {
		this.idNum = idNum;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getSubCnt() {
		return subCnt;
	}
	public void setSubCnt(int subCnt) {
		this.subCnt = subCnt;
	}
	public Subject[] getSubjectlist() {
		return subjectlist;
	}
	
//메서드 
	//<학생정보만 출력하는 메서드 / 수강정보 별도
	public void stdPrint() {
		System.out.println("학생명(학번) :"+ stdname +"("+stdNum+")");
		System.out.println("학부(학과) :"+ faculty +"("+major+")");
	}
	
	//수강과목 추가(신청)
		public void insertSubject(Subject s) {
			//배열이 다 찼다면 늘려주기
			if(subCnt==subjectlist.length) {
				//새로운 배열을 생성 기존+5
				Subject[]tmp = new Subject[subjectlist.length+5];
				//arraycopy이용 기존배열->새로운배열에 복사
				System.arraycopy(subjectlist, 0, tmp, 0, subjectlist.length);
				//배열의 교체
				subjectlist = tmp;
			}
			subjectlist[subCnt]=s;
			subCnt++; //배열의 인덱스 추가
		}
		
		//수강과목 출력 (배열출력)
	public void subPrint() {
		if(subCnt==0) {
			System.out.println("수강중인 과목이 없습니다.");
		}
		//수강과목 있을때 : 배열출력
		for(int i=0;i<subCnt;i++) {
			System.out.println(subjectlist[i]);
		}
		//메서드를 이용
		//subjectlist[i].subprint();
	}
	
	
	//수강과목 삭제(철회)
	public void deleteSubject(String subName) {
		//과목의 위치를 찾기위한 인덱스번지 설정
		int index =-1; //0번지가 있기때문에 //찾은위치의 번지
		if(subName==null) {
			return;
		}
		for (int i=0;i<subCnt;i++) {
			if(subjectlist[i].getSubName().equals(subName)) {
				index = 1;
				break;
			}
		}
		if (index==-1) {
			System.out.println("찾는 과목이 없습니다.");
			return;
		}
		//찾았을경우 삭제 
		//찾은 위치부터 뒷번지과목을 앞번지로 옮기는 작업 //맨 마지막 번지는 채우면 안된다
		for(int i=index;i<subCnt-1;i++) {
			subjectlist[i] = subjectlist[i+1];
		}
	//마지막 번지는 null로 채우기
		subjectlist[subCnt-1]=null;
		subCnt--;
		
		
	}
	
}
