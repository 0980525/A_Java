package StudentManage;

import java.util.Scanner;

public interface Program {

	void printStudent(); //학생전체 리스트 출력
	void insertStudent(Scanner scan); //스캐너로 메서드 내부에서 입력받기
	void searchStudent(Scanner scan);
	
	void registerSubject(Scanner scan); //'홍길동이 가지고있는 수강신청 메서드' / 
	
	void deleteSubject(Scanner scan);  
	
}
