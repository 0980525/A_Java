package day18;


import java.util.Calendar;
import java.util.Date;

public class Calender01 {

	public static void main(String[] args) {
		/*
		 * 날짜 시간 클래스 
		 * date클래스 : 잘안쓰는 클래스
		 * calendar클래스 사용 추상클래스
		 * 직접 객체를 생성할 수 없음
		 * 
		 * 
		 * month : (0-11월 )+1
		 * day 1-31
		 * week 1-월2-월
		 * am_pm am=0,pm=1
		 */
		
		Date d = new Date(); //직접객체생성가능
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH);
		int day = now.get(Calendar.DAY_OF_MONTH);
		int week = now.get(Calendar.DAY_OF_WEEK);
		switch(week) {
		case 1 : System.out.println(year+"-"+month+"-"+day+" "+"(일)");break;
		case 2 : System.out.println(year+"-"+month+"-"+day+" "+"(월)");break;
		case 3 : System.out.println(year+"-"+month+"-"+day+" "+"(화)");break;	
		case 4 : System.out.println(year+"-"+month+"-"+day+" "+"(수)");break;
		case 5 : System.out.println(year+"-"+month+"-"+day+" "+"(목)");break;
		case 6 : System.out.println(year+"-"+month+"-"+day+" "+"(금)");break;
		case 7 : System.out.println(year+"-"+month+"-"+day+" "+"(토)");break;
		default: break;
		}
		
		System.out.println();
				
		//hour,minute, second
		
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		int ampm = now.get(Calendar.AM_PM);
		
		
		
			if(ampm==0){System.out.println("오전");
		}else {System.out.println("오후");}
			
			System.out.println((ampm==0? "오전":"오후")+" ");
		System.out.print(ampm+" "+hour+" : "+minute);
		
		
		
	}

}
