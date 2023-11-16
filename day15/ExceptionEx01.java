package day15;

import java.util.Scanner;

public class ExceptionEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ExceptionEx01 ran =new ExceptionEx01();
		try {
			int arr[]; 
			arr=random(-3,1,10);
			for(int i=0;i<arr.length;i++) {
				System.out.println();
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	//메서드생성
	/* 기능 : 배열의 길이가 주어지면 길이만큼 배열을 생성하여 배열을 돌려주는 
	 * 배열 안에 랜덤 값을 채워서 리턴1-10   start=1,count=10
	 *   size 가 0보다 작다면 예외발생
	 *   start가 0보다 작다면 예외발생
	 */
	public static int[] random (int size, int start, int count ){
		if(size <0) {
			throw new RuntimeException("배열의 길이가 0보다 작습니다.");
		}
		if(start<0) {
			throw new RuntimeException("배열의 시작점이 0보다 작습니다.");
		}
		int random1[]=new int [size];
		for(int i=0;i<random1.length;i++) {
			random1[i]=(int)(Math.random()*count)+start;
		}
		return random1; //배열 생성후 리턴
	}
	/* 기능 : 배열을 받아서 배열에 똑같이 랜덤값을 채우는 메서드 (arr,start,count)
	 *   arr배열이 null일경우 예외발생
	 *   arr배열의 길이가 0보다 작을경우 예외발생
	 * 
	 */
	public void random2(int []arr,int start,int count) {
		if(arr==null) {
			throw new NullPointerException("배열의 값이 null입니다.");
		}
		if(arr.length<0) {
			throw new RuntimeException("배열의 길이가 0보다 작습니다.");
		}
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*count)+start;
		}
		
		return;
	}
	
	/* 5개의 문자열 배열을 생성한 후, 5개의 파일명을 입력받는 코드를 작성
	 * 입력받은 파일 중 이미지 파일을 검색하여 출력하는 코드 작성
	 * 이미지파일 형식은 (jpg, png, gif, jpeg)
	 * String[] fileName = {"java.txt","String.jpg","method.png",
	 * "String.pdf","java.pdf"}
	 * 
	 * --이미지 파일--
	 * String.jpg
	 * method.png
	 * */
	public static void name(){
	Scanner scan= new Scanner(System.in);
	String[] fileName = {"java.txt","String.jpg","method.png","String.pdf","java.pdf"};
	//String[] fileName1 = new String [5];
	for(int i=0;i<fileName.length;i++) {
		String fileSearch = scan.next();
		if (fileSearch.equals(fileName)) {
			System.out.println(fileName);
		}
	}
	System.out.println("-->--");
	scan.close();
	}
	
	}
	
