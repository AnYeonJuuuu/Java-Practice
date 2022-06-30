package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class TestIo {

	public void test() throws Exception { //일단은 던지는 것으로 처리
		
		File f = new File("C:\\dev\\hello.txt"); // 파일 불러오기
		
		//파일 맞는지 확인
		System.out.println(f.isFile());
		
		//데이터 읽기 1(1byte)
		FileInputStream fis = new FileInputStream(f);/*파일객체 이용해서 스트림 만들어줌*/

		
//		for(int i = 0; i<15 ;i++){
//			int result = fis.read();// 1글자 읽어들이고 출력하는 것
//			System.out.println(result);//(char)로 형변환 해주지 않으면 아스키 코드로 출력 됨!!
//			//아스키코드 : -1 이면 더이상 읽어들일 값이 없다는 의미
		
//			int result = 0;
//		while((result = fis.read()) != -1) { 
//			System.out.print((char)result); 
//		}

		// 읽어오는 코드 !!
		
		// 데이터 읽기 2( 보조스트림 )
		//버퍼드리더(보조스트림) == 통로 만들기(성능이 더 좋아짐!)
		BufferedReader br = new BufferedReader(new FileReader(f));
		//버퍼드리더 == 보조스트림, 파일리더== 메인스트림 과 연결하면 더 빠르게 값 읽어옴!!
		
//		for(int x = 0; x<2; x++) {
//			String s = br.readLine();//.readLine() 한 줄 읽어옴
//			System.out.println(s);
//		}
		// 무조건 다시!!!!!!!!!!
		String s = "";
		while((s= br.readLine()) != null) { // null은 값! 등호와 이퀄스는 방식이 다름
		// null값이 나오지 않을 때 까지 한 줄씩 읽어오는 것을 반복.
			System.out.println(s);
		}
		
		
		// 사용한 자원 반납
		br.close();
		
		}
	
	public void test2() throws Exception {
		
		//문자열 입력 받기
		System.out.println("문자열을 입력하세요");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		//출력테스트
		
		//파일 가져오기
		File f = new File("C:\\dev\\hello.txt"); 
		
		//파일 잘 들어왔는지 확인
		System.out.println(f.isFile());
		
		//통로 만들기
		FileWriter fw = new FileWriter(f); // true 파라미터 추가 : 이어쓰기 , defalt 값이 false == 덮어쓰기
		BufferedWriter bw = new BufferedWriter(fw);
		
		//통로 이용해서 보내기
		bw.write(str); //.write == 데이터 보내기! , str은 그냥 변수명!
		bw.flush();// 통로에 걸려 있던 것들 쭉 밀어줄 수 있음!
		// 스트림을 이용했다면 사용한 자원 반납
		bw.close();
		System.out.println("write 완료함");
	} // 왜 아무것도 안나왔을까? 1) "java" 전달이 잘 안됐음. 2).write == 기존 것을 없애고 덮어 씌워 버리기 때문
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	

