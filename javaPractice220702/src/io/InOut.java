package io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import member.Member;

public class InOut{
	
//	private String name;

	// 출력
	public void testOutput() {
		Member mb = new Member();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine(); 
		// 파일 객체 생성 
		File f = new File("c:\\dev\\hello.txt");
		System.out.println(f.isFile());

		// 지역변수는 jvm이 자동으로 초기화 안 해줌! 참조변수 기본값은 "null"
		try (FileWriter fw = new FileWriter(f);) {
			BufferedWriter bw = new BufferedWriter(fw);
			
			// 스트림 생성

			// 스트림 사용
			bw.write(mb.toString());//toString에 어떻게 해도 값이 안들어감

			bw.flush();
			System.out.println("전송 완료 ! ");

		} catch (IOException e) {
			System.out.println("파일 스트림 생성 중 예외 발생");
			System.out.println("에러 메세지 ::: " + e.getMessage());
		} 

	}


	}



