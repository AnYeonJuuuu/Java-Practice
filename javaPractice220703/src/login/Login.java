package login;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import io.IOjoin;

public class Login {

	
	IOjoin ij = new IOjoin();
	public void login() {
		System.out.println("�α��� �� �п��ý��� �̿��� �����մϴ�.");
		
		File f = new File("c:\\dev\\��������.txt");
//		System.out.println("���� ����? " + f.isFile());
		
		try(FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);) {//��Ʈ�� �����ϴ� �ڵ� ������ ��! �̷��� �ϸ� �ڵ����� Ŭ���� ó�� ��!
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
