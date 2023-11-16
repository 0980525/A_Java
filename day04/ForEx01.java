package day04;

import java.util.Scanner;

public class ForEx01 {

	public static void main(String[] args) {
		/*소수:약수가 1과 자기자신만 가지는 수
		 * 
		 * 
		 * num를 입력받아서 num가 소수인지 아닌지 판별
		 * ex)num 13 =>소수입니다.
		 * */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		int num=scan.nextInt();
		int count =0; //갯수를 세기위한 변수 설정
		for(int i=1;i<=num;i++) {
			
			if (num%i==0) {
				
				//약수의 갯수 확인 System.out.print(i+" ");
				count = count+1;
					}
			}
		//System.out.println(count);
		
		if(count == 2) {
			System.out.println("소수");
		} else {
			System.out.println("소수X");
		}
		
				scan.close();
		
		//2-100까지 중 소수 출력
		
		int count2 = 0; //초기화
		
		for (int i=2;i<=100;i++) {//num 2-100까지
			count2 = 0; //누적시 주의!! 카운트 초기화하지 않으면 세는 갯수가 전부 누적되어 이상한 값나옴
			//각 num마다 약수의 개수 = 0부터 시작
			
			for(int q=1;q<=i;q++){  //약수를 구하기 위해 돌리는 값
				if (i%q==0)	{count2=count2+1;/*카운트 누적해서 횟수세기 (=count++;)카운트 증감식 */}  //약수
				}
			//System.out.println(count2);
			if (count2==2) //약수가 2개인지 체크
			{System.out.print(i+" ");	//나오는 값은 i니까 출력을 i로 해야함
			}
			
			
		    
				
			
			}
		}
		
				

		}
		
		
		
		
	
		

	


