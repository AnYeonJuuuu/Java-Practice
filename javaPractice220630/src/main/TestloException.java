package main;



	import java.io.BufferedReader;
	import java.io.File;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;

	public class TestloException {

		// ���
		public void testOutput() {
			// ���� ��ü ����
			File f = new File("c:\\dev\\hello.txt");// �� ���Ͽ��� ������
			System.out.println(f.isFile());// ���� Ȯ�� ���ְ�.

		// 
			try (FileWriter fw = new FileWriter(f);){
				// ��Ʈ�� ����
				// �� �κ��� �򰥷���!! ��Ʈ�� ���� �� ���κ��� try �������� �־���!!
				// ��Ʈ�� ���
				fw.write("������");
				fw.flush();
				System.out.println("���� �Ϸ� ! ");

			} catch (IOException e) {
				System.out.println("���� ��Ʈ�� ���� �� ���� �߻�");
				System.out.println("���� �޼��� ::: " + e.getMessage());
			}

		}

		// �Է� :Input Reader ����ϱ�!!!!
		public void testInput() {

			// ���� ��ü ����
			File f = new File("c:\\dev\\hello.txt");
			System.out.println("���� ����? " + f.isFile());

			
			//��Ʈ�� �����ϴ� �ڵ� ������ ��! �̷��� �ϸ� �ڵ����� Ŭ������� ����! try 	
			try(FileReader fr = new FileReader(f);
				BufferedReader br = new BufferedReader(fr);) {
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


	

