package main;



	import java.io.BufferedReader;
	import java.io.File;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;

	public class TestloException {

		// 출력
		public void testOutput() {
			// 파일 객체 생성
			File f = new File("c:\\dev\\hello.txt");// 내 파일에서 데려옴
			System.out.println(f.isFile());// 파일 확인 해주고.

		// 
			try (FileWriter fw = new FileWriter(f);){
				// 스트림 생성
				// 이 부분이 헷갈렸음!! 스트림 생성 및 사용부분을 try 안쪽으로 넣어줌!!
				// 스트림 사용
				fw.write("ㅎㅎㅎ");
				fw.flush();
				System.out.println("전송 완료 ! ");

			} catch (IOException e) {
				System.out.println("파일 스트림 생성 중 예외 발생");
				System.out.println("에러 메세지 ::: " + e.getMessage());
			}

		}

		// 입력 :Input Reader 기억하기!!!!
		public void testInput() {

			// 파일 객체 생성
			File f = new File("c:\\dev\\hello.txt");
			System.out.println("파일 맞음? " + f.isFile());

			
			//스트림 생성하는 코드 넣으면 됨! 이렇게 하면 자동으로 클로즈까지 해줌! try 	
			try(FileReader fr = new FileReader(f);
				BufferedReader br = new BufferedReader(fr);) {
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


	

