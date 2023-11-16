package StudentManage;

import java.util.Scanner;

public class Manager implements Program{
	/* 멤버변수 : 학생클래스를 배열로 생성 [5]
	 * -Program인터페이스를 구현 
	 * -학생추가시 메서드는 interface를 구현하는 형태로
	 * -학생추가시 배열이 꽉 찼다면 배열을 늘려주는 기능 추가
	 */
	private Student[] std= new Student[5];
	private int stdCnt;

	@Override
	public void printStudent() { //인적사항
		System.out.println("--전체학생정보--");
		for(int i=0;i<stdCnt;i++) {
			std[i].stdPrint();//학생의 정보만 출력
			std[i].subPrint();//수강정보 추가출력
			System.out.println("-------------");
		}
		}
		
	

	@Override
	public void insertStudent(Scanner scan) {
		// 1명의 정보값을 입력받아 객체를 생성한 후 std배열에 추가
		//나는 2개만 했는데 Student클래스에 만든거 다 적으신듯 추가하기
		System.out.println("학번 : ");
		int schNum =scan.nextInt();
		System.out.println("이름 : ");
		String name =scan.next();
		//입력받은 값으로 객체를 생성
		Student s = new Student(schNum, name);
		//배열이 찼다면 배열복사후 배열 이동
		if(stdCnt ==std.length) {
			Student[]tmp = new Student[std.length+5]; //new array
			//arraycopy
			System.arraycopy(std, 0, tmp, 0, std.length);
			std=tmp;
		}
		//배열에 등록
		std[stdCnt]=s; //0번지
		stdCnt++;
		System.out.println("학생등록 완료");
	}

	@Override
	public void searchStudent(Scanner scan) {
		//검색할 학생의 이름을 입력받아 배열에서 탐색후 있다면 학생정보와 수강정보를 출력
		System.out.println("검색할 학생 이름 > ");
		String searchName = scan.next();
		int index = -1; //찾은 학생의 배열 주소를 입력하기 위함
		for(int i=0;i<stdCnt;i++) {
			if(std[i].getStdname().equals(searchName)) {
				std[i].stdPrint();
				std[i].subPrint();
				index = i; //선생님은 인덱스 없는 버전
			}
		}
		if(index ==-1) {
			System.out.println("검색한 이름이 없습니다.");
		}
		
	}

	@Override
	public void registerSubject(Scanner scan) {
		// 누가 수강신청을 할 것인가
		//수강신청할 학생 이름을 입력받기 ,학생이 있는지 확인하기위해 인덱스 활용
		int index = -1;
		System.out.println("수강신청 학생명 > ");
		String name = scan.next();
		//학생의 위치체크
		for(int i=0;i<stdCnt;i++) {
			if(std[i].getStdname().equals(name)) {
				index = i;
				break;
			}
		}
		
		//입력한 학생이 없다면 학생 정보없음 리턴
		if (index ==-1) {
			System.out.println("학생정보없음");
			
		}else {
			//있으면 신청과목 접수받기
			System.out.println("수강신청과목 > ");
			String subName = scan.next();
			//r객체생성
			Subject s = new Subject(subName);
			
			//insertSubject호출
			std[index].insertSubject(s);
			
		}
		//잇으면 신청과목 접수받기
		
		//객체생성 insertSubject호출
		
	}

	@Override
	public void deleteSubject(Scanner scan) {
		// 수강신청과 비슷
		
		//수강철회할 학생명 입력받기
		int index=-1;
		System.out.println("수강철회학생이름 >");
		String name = scan.next();
		for (int i=0;i<stdCnt;i++) {
			if(std[i].getStdname().equals(name)) {
				index=i;
				break;
			}
		}
		//학번이 없다면 
		if(index==-1) {
			System.out.println("학생정보없음");
			
		}else {
			//취소할 과목명 입력받기
			System.out.println("취소할 과목명 > ");
			String stdName = scan.next();
			std[index].deleteSubject(stdName);
		}
	}


	

}
