package login;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import io.IOjoin;

public class Login {

	
	IOjoin ij = new IOjoin();
	public void login() {
		System.out.println("로그인 후 학원시스템 이용이 가능합니다.");
		
		File f = new File("c:\\dev\\공무원반.txt");
//		System.out.println("파일 맞음? " + f.isFile());
		
		try(FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);) {//스트림 생성하는 코드 넣으면 됨! 이렇게 하면 자동으로 클로즈 처리 됨!
			// 스트림 생성( +보조스트림 )
			 // 보조 스트림이기 때문에 메인스트림 꼭 끼워 넣어주어야 함!
			// 스트림 사용
			String s = "";// null값 넣으면 while 안으로 아예 못들어가기 때문에 빈공간 넣어줌
			while ((s = br.readLine()) != null) {// .readLine() : 값 한 줄씩 읽어오기
				
				System.out.println(s);
				
			}
		} catch (IOException e) {
			System.out.println("입력 스트림 예외 발생");
			System.out.println("예외 메세지 :::" + e.getMessage());

	}
	}
	
	
	
}
