package practiceIo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
 
public class PracticeIo {
	
	public void test() throws Exception { //�ϴ��� ������ ������ ó��
			
			File f = new File("C:\\dev\\hello.txt"); // ���� �ҷ�����
			
			//���� �´��� Ȯ��
			System.out.println(f.isFile());
			
			//������ �б� 1(1byte)
			FileInputStream fis = new FileInputStream(f);/*���ϰ�ü �̿��ؼ� ��Ʈ�� �������*/
	
			
	//		for(int i = 0; i<15 ;i++){
	//			int result = fis.read();// 1���� �о���̰� ����ϴ� ��
	//			System.out.println(result);
				
			
	//			int result = 0;
	//		while((result = fis.read()) != -1) { 
	//			System.out.print((char)result); 
	//		}
	//			
			// �о���� �ڵ� !!
			
			// ������ �б� 2( ������Ʈ�� )
		
			BufferedReader br = new BufferedReader(new FileReader(f));
			//���۵帮�� == ������Ʈ��, ���ϸ���== ���ν�Ʈ�� �� �����ϸ� �� ������ �� �о��!!
			
	//		for(int x = 0; x<2; x++) {
	//			String s = br.readLine();//.readLine() �� �� �о��
	//			System.out.println(s);
	//		}
			// ������ �ٽ�!!!!!!!!!!
			String s = "";
			while((s= br.readLine()) != null) { // null�� ��! ��ȣ�� �������� ����� �ٸ�
			// null���� ������ ���� �� ���� �� �پ� �о���� ���� �ݺ�.
				System.out.println(s);
			}
			// ����� �ڿ� �ݳ�
			br.close();
			
			}
		
		public void test2() throws Exception {
			
			//���ڿ� �Է� �ޱ�
			System.out.println("���ڿ��� �Է��ϼ���");
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
			
			//����׽�Ʈ
			
			//���� ��������
			File f = new File("C:\\dev\\hello.txt"); 
			
			//���� �� ���Դ��� Ȯ��
			System.out.println(f.isFile());
			
			//��� �����
			FileWriter fw = new FileWriter(f); // true �Ķ���� �߰� : �̾�� , defalt ���� false == �����
			BufferedWriter bw = new BufferedWriter(fw);
			
			//��� �̿��ؼ� ������
			bw.write(str); // str�� �׳� ������!
			bw.flush();// ��ο� �ִ� �͵� �� �о��� �� ����!
			// ����� �ڿ� �ݳ�
			bw.close();
			System.out.println("write �Ϸ���");
		} 
	}
