package day20;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class BufferedReader03 {

	public static void main(String[] args) throws IOException {
		/* BufferedReader,FileReader
		 * map에 저장, 합계와 총 인원수를 출력
		 * 입력한 값을 읽어들이면 값은 전부 String
		 * 게산을 위해서는 int자료형으로 변환이 필요
		 * Integer.parseInt(값) : String =>int
		 */
		
		BufferedReader br = new BufferedReader(new FileReader("out.txt"));
		HashMap<String, Integer> map = new HashMap<>();
		
		while (true) { //(line = br.readLine())!=null 이 문구를 조건으로 while에 걸어서 쓸수 있다
			
			String line = br.readLine(); //한 라인을 읽어오기
			if(line==null) {
				break;
			}
			String name =line.substring(0, line.indexOf(" ")) ; //line의 이름 //첫 인자는포함, 끝은 미포함
			int score = Integer.parseInt(line.substring(line.indexOf(" ")+1)); //선생님 이 밑에 두줄을 한줄로 표현
			//String tmp = line.substring(5, 7);
			//int score = Integer.parseInt(tmp);//line의 점수
			map.put(name,score);
			
			
		} //while
		System.out.println(map);
		int sum = 0;
		for(String key: map.keySet()) {
			System.out.println(key+":"+map.get(key));
			sum+=map.get(key);
		}
		System.out.println("인원수 : "+map.size());
		
		
	} //main

}//class
