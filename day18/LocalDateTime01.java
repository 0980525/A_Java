package day18;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTime01 {

	public static void main(String[] args) {
		/* LocalDateTime : 현재 날짜 시간
		 * LocalTime : 시간만
		 * LocalDate : 날짜만
		 */
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today);
		System.out.println(today.getYear());
		System.out.println(today.toString());
		
		String curr = today.toString(); //toString 스트링 아니어도 스트링화 시킴
		//T를 기준으로 앞에있는 연월일 추출
		String date = curr.substring(0,curr.indexOf("T"));
		System.out.println(date);
		System.out.println("---------------------");
		System.out.println(curr.substring(0, curr.indexOf("T")));
		
		System.out.println("-----------0-------------");
		//T를 기준으로 뒤에있는 시분초 추출
		
		String time = curr.substring(curr.indexOf("T")+1, curr.indexOf("."));
		System.out.println(time);
		System.out.println("---------------------------");
		System.out.println(curr.substring(curr.indexOf("T")+1));
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss "); //오전오후는 a로 시간을 24시간으로 표현하는건 HH
		System.out.println(dtf.format(today));
		
		LocalDateTime sDate = LocalDateTime.of(2009, 9,10,8,30);
		System.out.println(sDate.format(dtf));
		System.out.println(sDate);
	}

}
