package day20;

import java.io.IOException;

public class IoStream01 {

	public static void main(String[] args) {
		/* 스트림 : 단방향으로 데이터가 흘러가는 형태
		 * 자바는 입력스트림, 출력스트림을 통해 데이터를 입출력한다.
		 * 다양한 장치에 독립적이고 일관성있는 입출력을 유지하기 위해 
		 * 입출력스트림을 사용
		 * 
		 * 두가지형태의 스트림
		 * -바이트형태의 스트림 : 기본(문자, 그림, 멀티미디어)
		 * -문자형태의 스트림 : 문자만 입출력을 할때 사용
		 * 
		 * 바이트스트림
		 *  - 입력(InputStream) : fileInputStream, BufferedInputStream, DateInputStream
		 *  - 출력(OutputStream) : fileOutputStream, BufferedOutputStream, DateInputStream, PrintWriter
		 * 문자스트림
		 *  - 입력(Reader) : fileReader, BufferedReader, InputStreamReader
		 *  - 출력(Writer) : fileWrite, BufferedWrite PrintReader
		 * 기반스트림 / 보조스트림
		 * 기반스트림 : 대상에서 직접 자료를 읽고 쓰는 기능이 있는 스트림
		 *  종류 : fileInputStream,fileOutputStream,fileReader,fileWrite
		 * 
		 * 보조스트림 : 직접 읽고 쓰는 기능은 없지만, 추가적인 기능을 더해주는 스트림
		 *  종류 : InputStreamReader, BufferedInputStream, BufferedOutputStream, BufferedReader, BufferedWrite
		 */
		
		//표준 출력 (모니터 = 콘솔) 스트림
		System.out.println();
		//표준 입력(키보드) 스트림
		try {
			//한번에 한 바이트 읽기
			int b = System.in.read();
		} catch (IOException e) {
			System.out.println("read() > "+b);
			// TODO: handle exception
			e.printStackTrace();
		}
		
		//표준 에러 출력스트림
		System.err.println("111");
		
		
	}

}
