package join;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import job.Gongmu3;
import job.Jasu1;
import job.Punip2;
import job.SamMagerException;
import member.Member;
public class Join {
	Scanner sc = new Scanner(System.in);

	public void firstJoin() {
		System.out.println("====== 회원가입을 진행합니다.=======");
		
	}
	  
	Member mb = new Member();
	public void mainJoin() throws SamMagerException {

		System.out.println("등록을 원하시는 스터디를 선택해주세요."
				+ "\n(1) 재수종합반 (2) 편입전문반 (3) 공무원대비반");
		String arr[] = new String[3];
		arr[0] = "재수종합반";
		arr[1] = "편입전문반";
		arr[2] = "공무원대비반";
		int sel = (Integer.parseInt(sc.nextLine()));
		
		
		System.out.println("이름을 입력해주세요.");
		mb.setName(sc.nextLine());
		System.out.println("성별을 입력해주세요(M 또는 F 입력.)");
		mb.setGender(sc.next().charAt(0));
		//한 글자만 입력 받고 싶을 땐 ".charAt"
		System.out.println("생년월일을 입력해주세요.(\"970304\" 형식의 6자리 숫자로 입력.)");
		mb.setBirth(Integer.parseInt(sc.nextLine()));//오류 : 예외처리로 문자 입력시 오류 뜨게 하고 싶은데 안됨ㅡㅡ 
		System.out.println("휴대폰번호를 입력해주세요.");
		mb.setPhone(Integer.parseInt(sc.nextLine()));
		System.out.println("아이디를 설정해주세요.(영문, 한글 및 숫자 가능.)");
		mb.setId(sc.nextLine());
		System.out.println("비밀번호를 설정해주세요.(영문, 한글 및 숫자 가능.)");
		mb.setPw(sc.nextLine());
		
		if(sel == 1) {
			new Jasu1().goalSchool();
			System.out.println(arr[0] + " 등록이 완료되었습니다.");
		}else if(sel == 2) {
			Punip2 pi = new Punip2();
			pi.sameMager(); 
			pi.goalSchool();
			System.out.println(arr[1] + " 등록이 완료되었습니다.");
		}else if(sel == 3) {
			new Gongmu3().setGoalkind(sc.nextLine());
			System.out.println(arr[2] + " 등록이 완료되었습니다.");
		}
		System.out.println(mb.toString());
		System.out.println("======= "+ mb.getName() + "님의 합격을 기원합니다. ========");
		//오류 : 이름 가져오고 싶은데 안 됨! >> 해결 완 ) int 엔터키 때문이었음^^
		
		
	}
	 

	
	public void endingJoin() {
		
//		System.out.println("======= "+  + "님의 합격을 기원합니다. ========");
		
	}
}
