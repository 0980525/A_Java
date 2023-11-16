package day11;

public class EzenComputerMain {

	public static void main(String[] args) {
		// Ezen컴퓨터 객체생성

	
		EzenComputer Ezen = new EzenComputer("홍길동", "980525", 26, "010-1111-2222"); //지점에 대한게 없어서 밑에다 서울써줌
		Ezen.setBranch("서울");
		Ezen.sPrint();
		Ezen.aPrint();
		Ezen.coursePrint();
		Ezen.sInfor("Java", "2023-08-30");
	
		EzenComputer ez = new EzenComputer("기아", "850425", 54, "010-5555-4444");
		ez.sPrint();
		ez.aPrint();
		ez.sInfor("html", "2");
		ez.coursePrint();
		
		
		/* 학생클래스를 담을수 있는 배열을 생성한 수 5명의 학생을 등록 
		 * */
		EzenComputer[] std = new EzenComputer [7];
		std[0]= new  EzenComputer("수나", "850423", 12, "010-4856-2553", "인천");
		std[1]= new EzenComputer("홍길동", "850423", 12, "010-4856-2553", "서울");
		std[2]= new EzenComputer("유연", "850423", 12, "010-4856-2553", "인천");
		std[3]= new EzenComputer("다느", "850423", 12, "010-4856-2553", "서울");
		std[4]= new EzenComputer("아", "850423", 12, "010-4856-2553", "서울");
		std[5]= new EzenComputer("연", "850423", 12, "010-4856-2553", "인천");
		std[6]= Ezen; //객체갯수 맞춰줘야 다음 진도 나감
		
//		

//		std[0].sInfor("java", "1");
//		std[1].sInfor("spring", "2");
//		std[2].sInfor("java","3");
//		std[3].sInfor("DB", "1");
//		std[4].sInfor("spring", "2");
//		std[5].sInfor("html","3");
		
		
		
		/* 학생이름으로 검색 =>학생의 모든 정보
		 * 지점정보로 검색  =>학생의 정보만
		 * + 과목을 수강하는 학생만 검색=>학생정보, 수강정보 출력
		 * search
 		 * */
		String searchName = "홍길동";
		int cnt=0; //
		System.out.println(searchName+" 님의 정보 ----------");
		for(int i=0;i<std.length;i++) { //일반for문
			if(std[i].getName().equals(searchName)/*equals로 저장된 값이 같은지 확인!'=='는 확인할수 없음*/) {
				std[i].sPrint(); //i번지에 저장된 값이 조건과 같은 번지가 .sPrint형식으로 출력됨
				std[i].aPrint();
				cnt++;
			}
			if(cnt==0) {
				System.out.println("검색결과가 없습니다.");
			}
		}
		
		String searchBranch ="인천";
		//향상된 for문은 완성된 배열에서만 사용가능 set은 불가능 /검색,
		for(int i=0;i<std.length;i++) {
			if(std[i].getBranch().equals(searchBranch)) {
				std[i].sPrint();
			}
		}
		for(EzenComputer e : std) {
			if(e.getBranch().equals(searchBranch)) {
				e.aPrint();
			}
		}System.out.println();
		System.out.println("-----------------");
		
		String searchCourse = "java";
		for(EzenComputer e: std) {
			for(int i=0;i<e.getCnt();i++) {
				if(e.getCourse()[i].equals(searchCourse)) {
					e.aPrint();
					e.coursePrint();
					System.out.println("---------------");
				}
				
			}
				
		}
		
	}
}
		

