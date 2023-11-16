package day20;

import java.io.FileWriter;
import java.io.IOException;

public class fileWriter01 {

	public static void main(String[] args) {
		// 문자기반 스트림
		
		try {
			FileWriter fw = new FileWriter("test.txt");
			for(int i=1;i<=10;i++) {
				String date = i + "test입니다.\r\n "; //\r\n줄바꿈
				fw.write(date);
			}
			fw.close();
			
			//파일추가모드
			FileWriter fw2 =  new FileWriter("test.txt",true);//true 가 없으면 파일 덮어쓰기, 있으면 이어쓰기
			for(int i=11;i<=20;i++) {
				String date = i + "test입니다.\r\n "; //\r\n줄바꿈
				fw2.write(date);
			}
			fw2.close();
				
				
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
