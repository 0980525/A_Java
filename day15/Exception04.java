package day15;

public class Exception04 {

	public static void main(String[] args) {
		//멀티캐치
		/* try{
		 * }catch(Exception e){
		 * 
		 *  }catch(Exception e){
		 *  
		 *   }catch(Exception e){
		 *   
		 *    }catch(Exception e){
		 */
		
		try {
			//int res = 1/0;
			//System.out.println(res);
			//int arr[]=null;
			//int arr1[]=new int [3];
			arr1[5]=10;
			
			
		} catch (ArithmeticException | NullPointerException e) {
			System.out.println("예외발생");
			
		}catch (IndexOutOfBoundsException e) {
			System.out.println("배열의 범위가 넘어갔습니다.");
		}catch (Exception e) {// 마지막은 최상위 default느낌
			e.printStackTrace();
		}
		System.out.println("종료");
	}

}
