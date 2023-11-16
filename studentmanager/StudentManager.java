package studentmanager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager implements Program {
	private List<Std> std = new ArrayList<>();
	
	public StudentManager() {
		add();
	}
	
//기본값
	private void add() {
		std.add(new Std("홍길동",15,"01040383921"));
		std.add(new Std("홍길동",15,"01040383921"));
		std.add(new Std("홍길동",15,"01040383921"));
		std.add(new Std("홍길동",15,"01040383921"));
		std.add(new Std("홍길동",15,"01040383921"));	
	}


	@Override
	public void addStd(Scanner scan) {		
		System.out.println("등록을 추가할 학생의 이름을 입력해주세요");
		String name = scan.next();
		std.add(null)
		
	}

	@Override
	public void printStd() {		
		for (int i = 0; i<std.size();i++) {
		System.out.println(std.get(i));
			}
		}
		
	

	@Override
	public void searchStd(Scanner scan) {
		//학생명을 입력받아 학생 정보를 출력
		System.out.println("학생명 > ");
		String name = scan.next();
		for (int i=0;i<std.size();i++) {
			if(std.get(i).getName().equals(name)) {
				System.out.println(std.get(i));
		}
		}
		
	}

	@Override
	public void modStd(Scanner scan) {
		// 수정할 정보 (이름, 나이, 전화번호)
		System.out.println("학생명 >");
		String name = scan.next();
		for (int i = 0;i<student.size();i++) {
			if(student.)
		}
		
	}

	@Override
	public void delStd(Scanner scan) {
		// 학생명을 입력받아 일치하는 학생을 삭제
		System.out.println("학생명 >");
		String name = scan.next();
	}

	@Override
	public void addSub(Scanner scan) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modSub(Scanner scan) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delSub(Scanner scan) {
		// TODO Auto-generated method stub
		
	}
	public int index(String name) {
		for(int i=0;i<std.size();i++) {
			if (std.get(i)).getName().equals(name){
				return i ;
			}
		}
	}
}
