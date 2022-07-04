package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
		System.out.println(" ");
		System.out.println("===== 회원 등록이 완료되었습니다. ======");
		System.out.println(" ");
		
		// 통로 이용해서 보내기
		if (sel == 1) {

			File jasu = new File("C:\\dev\\재수종합반.txt");

			// 파일 잘 들어왔는지 확인
//			System.out.println(jasu.isFile());

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

			System.out.println("로그인 후 학원시스템 이용이 가능합니다.");
			System.out.print("아이디 : ");
			String jasuid = sc.nextLine();
			System.out.print("비밀번호 : ");
			String jasupw = sc.nextLine();

			if (jasuid.equals(id) && jasupw.equals(pw)) {

				File jasuin = new File("c:\\dev\\재수종합반.txt");

				try (FileReader jasuinfr = new FileReader(jasuin); BufferedReader br = new BufferedReader(jasuinfr);) {// 스트림
																															// 됨!
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

		} else if (sel == 2) {
			File punip = new File("C:\\dev\\편입반.txt");

			// 파일 잘 들어왔는지 확인
//			System.out.println(punip.isFile());

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

			System.out.println("로그인 후 학원시스템 이용이 가능합니다.");
			System.out.print("아이디 : ");
			String piid = sc.nextLine();
			System.out.print("비밀번호 : ");
			String pipw = sc.nextLine();

			if (piid.equals(id) && pipw.equals(pw)) {

				File jasuin = new File("c:\\dev\\편입반.txt");

				try (FileReader jasuinfr = new FileReader(jasuin); BufferedReader br = new BufferedReader(jasuinfr);) {// 스트림
																									// 됨!
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

		} else if (sel == 3) {
			File gongmu = new File("C:\\dev\\공무원반.txt");

			// 파일 잘 들어왔는지 확인
//			System.out.println(gongmu.isFile());

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

			System.out.println("로그인 후 학원시스템 이용이 가능합니다.");
			System.out.print("아이디 : ");
			String gmid = sc.nextLine();
			System.out.print("비밀번호 : ");
			String gmpw = sc.nextLine();

			if (gmid.equals(id) && gmpw.equals(pw)) {

				File jasuin = new File("c:\\dev\\공무원반.txt");

				try (FileReader jasuinfr = new FileReader(jasuin); BufferedReader br = new BufferedReader(jasuinfr);) {// 스트림
																											// 됨!
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

		System.out.println("회원 확인이 완료되었습니다.");
		System.out.println("===== " + name + "님의 합격을 기원합니다. =====");
	}

}
