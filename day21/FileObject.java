package day21;

import java.io.File;

public class FileObject {

	public static void main(String[] args) {
		// 
		File f= new File("D:\\Hyesu\\A_Java\\java_project\\out.txt");
		System.out.println(f.getName()); //경로를 제외한 이름
		System.out.println(f.getPath());//경로 + 이름
		
		System.out.println(f.getParent());//경로만
		System.out.println(File.separator);//파일구분자(많이 사용)
	
		//파일명과 경로가 String 형태로 들어온다면 ..구분
		String fstr = f.toString();
		System.out.println(fstr);
		//fstr에서 드라이브만 추출
		System.out.println(fstr.substring(0, fstr.indexOf(File.separator))); //indexOf(포함번지,불포함번지)
		//파일명만 추출
		System.out.println(fstr.substring(fstr.lastIndexOf(File.separator)+1));//lastIndexOf()
		System.out.println(fstr.substring(fstr.lastIndexOf("out.txt"))); //편했다...ㅎㅎ파일명 알때 쓰기좋을듯
		//파일 경로만 추출.
		System.out.println(fstr.substring(fstr.indexOf(File.separator), fstr.lastIndexOf(File.separator)+1));
	}

}
