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
		System.out.println(" ");
		System.out.println("===== ȸ�� ����� �Ϸ�Ǿ����ϴ�. ======");
		System.out.println(" ");
		
		// ��� �̿��ؼ� ������
		if (sel == 1) {

			File jasu = new File("C:\\dev\\������չ�.txt");

			// ���� �� ���Դ��� Ȯ��
//			System.out.println(jasu.isFile());

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

			System.out.println("�α��� �� �п��ý��� �̿��� �����մϴ�.");
			System.out.print("���̵� : ");
			String jasuid = sc.nextLine();
			System.out.print("��й�ȣ : ");
			String jasupw = sc.nextLine();

			if (jasuid.equals(id) && jasupw.equals(pw)) {

				File jasuin = new File("c:\\dev\\������չ�.txt");

				try (FileReader jasuinfr = new FileReader(jasuin); BufferedReader br = new BufferedReader(jasuinfr);) {// ��Ʈ��
																															// ��!
					// ��Ʈ�� ����( +������Ʈ�� )
					// ���� ��Ʈ���̱� ������ ���ν�Ʈ�� �� ���� �־��־�� ��!
					// ��Ʈ�� ���
					String s = "";// null�� ������ while ������ �ƿ� ������ ������ ����� �־���
					while ((s = br.readLine()) != null) {// .readLine() : �� �� �پ� �о����

						System.out.println(s);

					}
				} catch (IOException e) {
					System.out.println("�Է� ��Ʈ�� ���� �߻�");
					System.out.println("���� �޼��� :::" + e.getMessage());

				}
			}

		} else if (sel == 2) {
			File punip = new File("C:\\dev\\���Թ�.txt");

			// ���� �� ���Դ��� Ȯ��
//			System.out.println(punip.isFile());

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

			System.out.println("�α��� �� �п��ý��� �̿��� �����մϴ�.");
			System.out.print("���̵� : ");
			String piid = sc.nextLine();
			System.out.print("��й�ȣ : ");
			String pipw = sc.nextLine();

			if (piid.equals(id) && pipw.equals(pw)) {

				File jasuin = new File("c:\\dev\\���Թ�.txt");

				try (FileReader jasuinfr = new FileReader(jasuin); BufferedReader br = new BufferedReader(jasuinfr);) {// ��Ʈ��
																									// ��!
					// ��Ʈ�� ����( +������Ʈ�� )
					// ���� ��Ʈ���̱� ������ ���ν�Ʈ�� �� ���� �־��־�� ��!
					// ��Ʈ�� ���
					String s = "";// null�� ������ while ������ �ƿ� ������ ������ ����� �־���
					while ((s = br.readLine()) != null) {// .readLine() : �� �� �پ� �о����

						System.out.println(s);

					}
				} catch (IOException e) {
					System.out.println("�Է� ��Ʈ�� ���� �߻�");
					System.out.println("���� �޼��� :::" + e.getMessage());

				}
			}

		} else if (sel == 3) {
			File gongmu = new File("C:\\dev\\��������.txt");

			// ���� �� ���Դ��� Ȯ��
//			System.out.println(gongmu.isFile());

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

			System.out.println("�α��� �� �п��ý��� �̿��� �����մϴ�.");
			System.out.print("���̵� : ");
			String gmid = sc.nextLine();
			System.out.print("��й�ȣ : ");
			String gmpw = sc.nextLine();

			if (gmid.equals(id) && gmpw.equals(pw)) {

				File jasuin = new File("c:\\dev\\��������.txt");

				try (FileReader jasuinfr = new FileReader(jasuin); BufferedReader br = new BufferedReader(jasuinfr);) {// ��Ʈ��
																											// ��!
					// ��Ʈ�� ����( +������Ʈ�� )
					// ���� ��Ʈ���̱� ������ ���ν�Ʈ�� �� ���� �־��־�� ��!
					// ��Ʈ�� ���
					String s = "";// null�� ������ while ������ �ƿ� ������ ������ ����� �־���
					while ((s = br.readLine()) != null) {// .readLine() : �� �� �پ� �о����

						System.out.println(s);

					}
				} catch (IOException e) {
					System.out.println("�Է� ��Ʈ�� ���� �߻�");
					System.out.println("���� �޼��� :::" + e.getMessage());

				}
			}

		}

		System.out.println("ȸ�� Ȯ���� �Ϸ�Ǿ����ϴ�.");
		System.out.println("===== " + name + "���� �հ��� ����մϴ�. =====");
	}

}
