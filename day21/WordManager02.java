package day21;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import Word.Word;

public class WordManager02 {
	//1.단어 등록 |2.단어검색 |3.단어수정 |4.단어출력 |5.단어 삭제 |6.단어파일출력 | 7.종료
	ArrayList<Word> wordList = new ArrayList<Word>();
	
	
	public void defaultWord() {
		wordList.add(new Word("apple", "사과"));
		wordList.add(new Word("banana", "바나나"));
		wordList.add(new Word("Hi", "안녕"));
		wordList.add(new Word("hungry", "배고파"));
		wordList.add(new Word("name", "이름"));
	}
	
	@Override
	public String toString() {
		return  wordList + " " ;
	}

	public void addWord(Scanner scan) {
		System.out.println("단어를 등록하는 메뉴입니다.");
		System.out.println("단어입력 > ");
		String word = scan.next();
		System.out.println("단어의 뜻을 입력해주세요.");
		String mean = scan.next();
		
		wordList.add(new Word(word, mean));
		System.out.println("단어를 등록했습니다.");
	}
	
	public void searchWord(Scanner scan) {
		System.out.println("단어를 검색하는 메뉴입니다.");
		System.out.println("검색할 단어를 입력해주세요. ");
		System.out.println("단어입력 > ");
		String word = scan.next();
		for(int i=0;i<wordList.size();i++) {
			if(wordList.get(i).getWord().equals(word)) {
				System.out.println(wordList.get(i));
				return;
			}			
		}
		System.out.println("단어가 없습니다."); //안됨	
	}
	
	public void modWord(Scanner scan) { //수정
		System.out.println("뜻을 수정하고싶은 단어를 입력해주세요.");
		String word = scan.next();
		for(int i=0;i<wordList.size();i++) {
			if(wordList.get(i).getWord().equals(word)) {
//				wordList.remove(i); 삭제후 재생성
//				System.out.println("");
//				String word2 = scan.next();
//				
//				String mean = scan.next();
//				wordList.add(new Word(word2,mean));
				System.out.println("수정할 단어의 뜻을 입력해주세요.");
				String mean = scan.next();
				wordList.get(i).setMean(mean);
				
			}
		}
	
	}
	
	public void printWord() {
		System.out.println("---단어목록---");
		Collections.sort(wordList); //정렬
		for(Word w : wordList) {
			System.out.println(w);//기본 단어출력하고싶음 
			System.out.println("한글");
			
	//	System.out.println(wordList.toString());
		
		}
	}
	
	public void delWord(Scanner scan) {
		System.out.println("단어를 삭제하는 메뉴입니다.");
		System.out.println("삭제할 단어를 입력해주세요");
		System.out.println("단어입력 > ");
		String word = scan.next();
		for(int i = 0;i<wordList.size();i++) {
			
			if(wordList.get(i).getWord().equals(word)) {
				wordList.remove(i);
			}
		}
		System.out.println("단어를 삭제했습니다.");
	}
	
	public void printFile() throws IOException {
//		FileWriter fs =new FileWriter("out.txt");
//		BufferedWriter bw = new BufferedWriter(fs);
//		
//		StringBuffer sb = new StringBuffer();
//		//.append : 데이터 추가
//		String data = null;
//		sb.append("--단어장--");
//		sb.append("\r\n");
//		Collections.sort(wordList);
//		int cnt=0;
//		while(cnt < wordList.size()) {
//			sb.append(wordList.get(cnt));
//			sb.append("\r\n");
//			cnt++;
//		}
//		data = sb.toString();
//		System.out.println(data);
//		bw.write(data);
//		
//		bw.close();
//		fs.close();
		try {
			FileWriter fw = new FileWriter("word.txt");
			for(int i=0;i<wordList.size();i++) {
				String date = wordList.get(i).getWord()+":"+wordList.get(i).getMean();
				fw.write(date);
			}
			fw.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
}
