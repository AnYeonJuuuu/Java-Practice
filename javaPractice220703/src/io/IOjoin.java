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
		System.out.println("ȸ������� �����մϴ�.");

		System.out.println("����� ���Ͻô� ���͵� �������ּ���." + "\n(1) ������չ� (2) ���������� (3) ����������");
		String arr[] = new String[3];
		arr[0] = "������չ�";
		arr[1] = "����������";
		arr[2] = "����������";
		int sel = (Integer.parseInt(sc.nextLine()));
		
		// ���ڿ� �Է� �ޱ�
		System.out.println("�̸� �Է�");
		String name = sc.nextLine();
		System.out.println("������� �Է�( * ���ڸ� �Է� �����մϴ�.)");
		int birth = Integer.parseInt(sc.nextLine());
		System.out.println("���̵� �Է�");
		String id = sc.nextLine();
		System.out.println("��й�ȣ �Է�");
		String pw = sc.nextLine();

		// ����׽�Ʈ

		// ���� ��������
//		File f = new File("C:\\dev\\������չ�.txt");
//
//		// ���� �� ���Դ��� Ȯ��
//		System.out.println(f.isFile());
//
//		// ��� �����
//		FileWriter fw = new FileWriter(f); // true �Ķ���� �߰� : �̾�� , defalt ���� false == �����
//		BufferedWriter bw = new BufferedWriter(fw);

		// ��� �̿��ؼ� ������
		if(sel==1) {
			
			File jasu = new File("C:\\dev\\������չ�.txt");

			// ���� �� ���Դ��� Ȯ��
			System.out.println(jasu.isFile());

			// ��� �����
			FileWriter jasufw = new FileWriter(jasu); // true �Ķ���� �߰� : �̾�� , defalt ���� false == �����
			BufferedWriter jasubw = new BufferedWriter(jasufw);
			
			jasubw.write("\n[ " + arr[0] + " ]");
			jasubw.write("\n�̸� : " + name);// .write == ������ ������! , str�� �׳� ������!
			jasubw.write("\n������� : " + birth);
			jasubw.write("\nid : " + id);//
			jasubw.write("\npw : " + pw);
			jasubw.write(" ");
			jasubw.flush();
			jasubw.close();
			
		}else if(sel==2) {
			File punip = new File("C:\\dev\\���Թ�.txt");

			// ���� �� ���Դ��� Ȯ��
			System.out.println(punip.isFile());

			// ��� �����
			FileWriter pifw = new FileWriter(punip); // true �Ķ���� �߰� : �̾�� , defalt ���� false == �����
			BufferedWriter pibw = new BufferedWriter(pifw);
			
			pibw.write("\n[ " + arr[1] + " ]");
			pibw.write("\n�̸� : " + name);// .write == ������ ������! , str�� �׳� ������!
			pibw.write("\n������� : " + birth);
			pibw.write("\nid : " + id);//
			pibw.write("\npw : " + pw);
			pibw.write(" ");
			pibw.flush();
			pibw.close();
			
		}else if(sel==3) {
			File gongmu = new File("C:\\dev\\��������.txt");

			// ���� �� ���Դ��� Ȯ��
			System.out.println(gongmu.isFile());

			// ��� �����
			FileWriter gongmufw = new FileWriter(gongmu); // true �Ķ���� �߰� : �̾�� , defalt ���� false == �����
			BufferedWriter gongmubw = new BufferedWriter(gongmufw);
			
			gongmubw.write("\n[ " + arr[2] + " ]");
			gongmubw.write("\n�̸� : " + name);// .write == ������ ������! , str�� �׳� ������!
			gongmubw.write("\n������� : " + birth);
			gongmubw.write("\nid : " + id);//
			gongmubw.write("\npw : " + pw);
			gongmubw.write(" ");
			gongmubw.flush();
			gongmubw.close();
		}

		System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�."); 
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
