package day20;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader01 {

	public static void main(String[] args) throws IOException {
		//BufferedReader : 문자 보조스트림
		/* 
		 * 
		 */
		BufferedReader br = new BufferedReader(new FileReader("test.txt"));
		while (true) {
			String line = br.readLine(); //한 라인을 읽어오기
			if(line == null) { //읽을 라인이 없다면
				break;
			}
			System.out.println(line);
		}
		br.close();
	}
}
