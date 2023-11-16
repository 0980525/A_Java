package day03;

public class for05 {

	public static void main(String[] args) {
		/*최소공배수
		 * 공배수:공통된 배수
		 * 10:10 20 30 40
		 * 15:15 30 45 60
		 * 두 수의 공배수:30 60
		 * 최소 공배수:30
		 * */
		
		int num1=10;
		int num2=15;
		
		for(int i=num1;;i+=num1) {//(i+=num1)=(i=i+num1) 
			if(i%num1==0 && i%num2==0) {
				System.out.println("두 수의 최소공배수 : "+i);
				break;
			}
		}
		
		
//		for(i) {
//			
//			System.out.println((num1*num2)/);
//		}
		
		
		
		
		
		}
		
		
		
	}


