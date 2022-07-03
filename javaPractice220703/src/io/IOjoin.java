package io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

import movie.Movie;

public class IOjoin {
	public void joinOut() throws Exception {

		Scanner sc = new Scanner(System.in);
		Movie m = new Movie();
		System.out.println("회원등록을 시작합니다.");

		System.out.println("등록을 원하시는 스터디를 선택해주세요." + "\n(1) 재수종합반 (2) 편입전문반 (3) 공무원대비반");
		String arr[] = new String[3];
		arr[0] = "재수종합반";
		arr[1] = "편입전문반";
		arr[2] = "공무원대비반";
		int sel = (Integer.parseInt(sc.nextLine()));
		
		// 문자열 입력 받기
		System.out.println("이름 입력");
		String name = sc.nextLine();
		System.out.println("생년월일 입력( * 숫자만 입력 가능합니다.)");
		int birth = Integer.parseInt(sc.nextLine());
		System.out.println("아이디 입력");
		String id = sc.nextLine();
		System.out.println("비밀번호 입력");
		String pw = sc.nextLine();

		// 출력테스트

		// 파일 가져오기
//		File f = new File("C:\\dev\\재수종합반.txt");
//
//		// 파일 잘 들어왔는지 확인
//		System.out.println(f.isFile());
//
//		// 통로 만들기
//		FileWriter fw = new FileWriter(f); // true 파라미터 추가 : 이어쓰기 , defalt 값이 false == 덮어쓰기
//		BufferedWriter bw = new BufferedWriter(fw);

		// 통로 이용해서 보내기
		if(sel==1) {
			
			File jasu = new File("C:\\dev\\재수종합반.txt");

			// 파일 잘 들어왔는지 확인
			System.out.println(jasu.isFile());

			// 통로 만들기
			FileWriter jasufw = new FileWriter(jasu); // true 파라미터 추가 : 이어쓰기 , defalt 값이 false == 덮어쓰기
			BufferedWriter jasubw = new BufferedWriter(jasufw);
			
			jasubw.write("\n[ " + arr[0] + " ]");
			jasubw.write("\n이름 : " + name);// .write == 데이터 보내기! , str은 그냥 변수명!
			jasubw.write("\n생년월일 : " + birth);
			jasubw.write("\nid : " + id);//
			jasubw.write("\npw : " + pw);
			jasubw.write(" ");
			jasubw.flush();
			jasubw.close();
			
		}else if(sel==2) {
			File punip = new File("C:\\dev\\편입반.txt");

			// 파일 잘 들어왔는지 확인
			System.out.println(punip.isFile());

			// 통로 만들기
			FileWriter pifw = new FileWriter(punip); // true 파라미터 추가 : 이어쓰기 , defalt 값이 false == 덮어쓰기
			BufferedWriter pibw = new BufferedWriter(pifw);
			
			pibw.write("\n[ " + arr[1] + " ]");
			pibw.write("\n이름 : " + name);// .write == 데이터 보내기! , str은 그냥 변수명!
			pibw.write("\n생년월일 : " + birth);
			pibw.write("\nid : " + id);//
			pibw.write("\npw : " + pw);
			pibw.write(" ");
			pibw.flush();
			pibw.close();
			
		}else if(sel==3) {
			File gongmu = new File("C:\\dev\\공무원반.txt");

			// 파일 잘 들어왔는지 확인
			System.out.println(gongmu.isFile());

			// 통로 만들기
			FileWriter gongmufw = new FileWriter(gongmu); // true 파라미터 추가 : 이어쓰기 , defalt 값이 false == 덮어쓰기
			BufferedWriter gongmubw = new BufferedWriter(gongmufw);
			
			gongmubw.write("\n[ " + arr[2] + " ]");
			gongmubw.write("\n이름 : " + name);// .write == 데이터 보내기! , str은 그냥 변수명!
			gongmubw.write("\n생년월일 : " + birth);
			gongmubw.write("\nid : " + id);//
			gongmubw.write("\npw : " + pw);
			gongmubw.write(" ");
			gongmubw.flush();
			gongmubw.close();
		}

		System.out.println("회원가입이 완료되었습니다."); 
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
