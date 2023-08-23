package day06;

public class 주사위게임 {

	public static void main(String[] args) {
		/*주사위를 던져서 총 30칸을 이동하면 완주
		 * 주사위 : 1-6까지 랜덤수 
		 * 
		 * 주사위가 3->3칸이동->27칸 남았습니다. //이동은 숫자를 누적해서 더해줘야하고
		 * 주사위가 6칸 이동->??칸 남았습니다. //칸은 30-누적숫자 남았습니다.
		 * 도착했습니다. 총 이동횟수 : 8 //주사위를 몇번 던져서 완주했다. count세기
		 * */
		
		System.out.println("주사위게임");
		
		int sum= 0;
		int count =0;
		for(;;) {
			int r=(int)(Math.random()*6)+1;
			System.out.println(r+"칸 이동");
			count=count+1; //이동횟수
			
			sum=sum+r; //누적횟수
			System.out.println(30-sum+"칸 남았습니다");
			if(sum>=30) {
				System.out.println("총 이동 횟수 : "+count);
				break;
			}	
	      }
		System.out.println("완주했습니다.");
		
	}
		
}
/*랜덤값 1-6 /쌤이 해보신거 다시 완성해보기
 * 목표값 30 / sum 합산거리 / count 이동횟수
 * int r=0;
 * intsum = 0;
 * int count = 0;
 * int last = 30;
 * 
 *  while(sum<last) { //true값이 되어야 반복
 *  //랜덤생성-반복적인 주사위던지기위해 필요
 *  //스캔으로 엔터를 입력받아서 하나씩 나오게해도 되지만 별 의미없음
 *  
 *  r = (int)(Math.random()*6+1);
 *  sum +=random;
 *  count++;
 *  System.out.println("주사위:"+r+"칸 이동 => "+(last -sum)+"칸 남음")
 *  
 *  }
 *  
 *  
 *  
 * */

