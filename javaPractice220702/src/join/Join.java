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
		System.out.println("====== ȸ�������� �����մϴ�.=======");
		
	}
	  
	Member mb = new Member();
	public void mainJoin() throws SamMagerException {

		System.out.println("����� ���Ͻô� ���͵� �������ּ���."
				+ "\n(1) ������չ� (2) ���������� (3) ����������");
		String arr[] = new String[3];
		arr[0] = "������չ�";
		arr[1] = "����������";
		arr[2] = "����������";
		int sel = (Integer.parseInt(sc.nextLine()));
		
		
		System.out.println("�̸��� �Է����ּ���.");
		mb.setName(sc.nextLine());
		System.out.println("������ �Է����ּ���(M �Ǵ� F �Է�.)");
		mb.setGender(sc.next().charAt(0));
		//�� ���ڸ� �Է� �ް� ���� �� ".charAt"
		System.out.println("��������� �Է����ּ���.(\"970304\" ������ 6�ڸ� ���ڷ� �Է�.)");
		mb.setBirth(Integer.parseInt(sc.nextLine()));//���� : ����ó���� ���� �Է½� ���� �߰� �ϰ� ������ �ȵʤѤ� 
		System.out.println("�޴�����ȣ�� �Է����ּ���.");
		mb.setPhone(Integer.parseInt(sc.nextLine()));
		System.out.println("���̵� �������ּ���.(����, �ѱ� �� ���� ����.)");
		mb.setId(sc.nextLine());
		System.out.println("��й�ȣ�� �������ּ���.(����, �ѱ� �� ���� ����.)");
		mb.setPw(sc.nextLine());
		
		if(sel == 1) {
			new Jasu1().goalSchool();
			System.out.println(arr[0] + " ����� �Ϸ�Ǿ����ϴ�.");
		}else if(sel == 2) {
			Punip2 pi = new Punip2();
			pi.sameMager(); 
			pi.goalSchool();
			System.out.println(arr[1] + " ����� �Ϸ�Ǿ����ϴ�.");
		}else if(sel == 3) {
			new Gongmu3().setGoalkind(sc.nextLine());
			System.out.println(arr[2] + " ����� �Ϸ�Ǿ����ϴ�.");
		}
		System.out.println(mb.toString());
		System.out.println("======= "+ mb.getName() + "���� �հ��� ����մϴ�. ========");
		//���� : �̸� �������� ������ �� ��! >> �ذ� �� ) int ����Ű �����̾���^^
		
		
	}
	 

	
	public void endingJoin() {
		
//		System.out.println("======= "+  + "���� �հ��� ����մϴ�. ========");
		
	}
}
