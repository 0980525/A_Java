package day05;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/*파일명 5개가 주어졌을때, 원하는 단어를 입력하면 입력한 단어가 있는 파일들을 출력하도록 코드를 작성하시오.
		 * 
		 * 파일 배열 (쌤이 해줌
		 * 단어 입력 함
		 * 입력한 단어와 파일의 단어가 일치하는지 확인
		 * 파일 출력,  
		 * String in = scan.next(); //얘는 검색
		 * String file = fileName; //연결점을 만들어줘야한다고 생각함
			System.out.println(fileName.contains("java")); //해당 글자 포함하고있는지 체크
		System.out.println(in.equals(fileName)); //
		System.out.println();*/
			//문자열 입력:next()공백포함안됨
				//System.out.println("문자열 >");
				//String s=scan.next();
				//System.out.println("문자열 > "+s);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("검색할 키워드 입력> ");
	
		String[] fileName = {"java의 정석.txt","이것java다.jpg","String메서드.txt"," String함수.jpg","java의 함수.png "}; //얘는 배열
		String in=scan.next();
		
		for (int i=0;i<fileName.length;i++) {
			if(fileName[i].contains(in)==true) {
				System.out.print(fileName[i]);
			}
		}
	
		scan.close();	
		
		//쌤이한거//오늘 가서 다시 복습
		//contains(str):str의 단어가 포함되어있는지 체크 return true/false
		Scanner scan = new Scanner(System.in);
		System.out.println("검색할 단어 입력 : ");
		String s = scan.next();
		
		for(String tmp:filrName){//향상된 for문을 사용하면 변경불가 배열에서 꺼내오기만 가능 취사선택
			if(tmp.contains(s)) { //if의 조건식은 true/false
				System.out.println(tmp);
			}
			
		}
		scan.close();
		
		
		
		
		}
		
		
		

	}


