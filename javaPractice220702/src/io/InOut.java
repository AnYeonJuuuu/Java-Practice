package io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import member.Member;

public class InOut{
	
//	private String name;

	// ���
	public void testOutput() {
		Member mb = new Member();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine(); 
		// ���� ��ü ���� 
		File f = new File("c:\\dev\\hello.txt");
		System.out.println(f.isFile());

		// ���������� jvm�� �ڵ����� �ʱ�ȭ �� ����! �������� �⺻���� "null"
		try (FileWriter fw = new FileWriter(f);) {
			BufferedWriter bw = new BufferedWriter(fw);
			
			// ��Ʈ�� ����

			// ��Ʈ�� ���
			bw.write(mb.toString());//toString�� ��� �ص� ���� �ȵ�

			bw.flush();
			System.out.println("���� �Ϸ� ! ");

		} catch (IOException e) {
			System.out.println("���� ��Ʈ�� ���� �� ���� �߻�");
			System.out.println("���� �޼��� ::: " + e.getMessage());
		} 

	}


	}



