package main;

import mob.Agumon;
import mob.Digimon;
import mob.Papimon;

public class Main {
public static void main(String[] args) {
	
	//������ ���� ��� >>����Ӽ� ���� ������?
	//�������̽��� �߻�޼ҵ� �־��!
	//������ action���� ���� , ��ų!
	//������ Ŭ�������� �̸� Ÿ��
	System.out.println("===== �������̽� �߻�Ŭ���� ���� ======");
	Digimon agumon = new Agumon();//�Ʊ��� ��ü ����
	agumon.setName("�Ʊ���");
	agumon.setType("���");
	
	Digimon papimon = new Papimon();
	papimon.setName("���Ǹ�");
	papimon.setType("���");
	
	System.out.println(agumon);
	System.out.println(papimon);
	
	//������ �׼� ���
	agumon.sayHello();//�� �޼���� ������ Ŭ������ ������ ���� ���� Ŭ������ �Ʊ��� �̹Ƿ�
	agumon.action();
	agumon.attack();
	papimon.action();
	papimon.attack();
	
	
	
}
}
