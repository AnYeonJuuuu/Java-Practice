package selectPlant;

import java.util.Scanner;

public class SelectPlant {

	Scanner sc = new Scanner(System.in);
	
	public void recostart() {
		System.out.println();
		System.out.println("===== �Ĺ� ��õ �̺�Ʈ�� �����մϴ� =====");
		System.out.println("** (1)�� or (2)���� �� ������ ��� �׸��� ��ȣ�� �Է����ּ���!!");
		System.out.println();
		System.out.println("(1) �Ĺ� Ű����� ���̶���Ʈ�� ��!! ���� ���ƿ�!!^o^ \n(2) �Ĺ��� Ǫ��Ǫ�� ���� �����̶�� �����Ѵٸ�!!");
		System.out.println("��� �Ʒ��� ���� (1) �Ǵ� (2)�� �Է����ּ���. ���");
	}
	
	public void selrecomm(int se) {
		 // �� ����
		if(se == 1) {
			System.out.println("(1) ���� �Ĺ����� \"���̴��� ��\" � ���̵��� �ڽ��־��!! "
					+ "\n(2) ���� �Ĺ����� \"���̳ʽ� ��\" �ʺ��ڵ� �� Ű�� �� �ִ� �� ��õ���ּ���!!");
			System.out.println("��� �Ʒ��� ���� (1) �Ǵ� (2)�� �Է����ּ���. ���");
			
			int a = sc.nextInt(); // �Ĺ� ���̵�
			if(a==1) {
				System.out.println("����� �� Ű����� ���� :: \"ȣ����\" \"�ɺ���\" ��õ�帳�ϴ�^_~");
			}
			else if(a==2){ 
				System.out.println("�̷� �� Ű����� ���̴��� �� :: \"����Ƽ�ʸ�\" \"û��ȫ\" ��õ�帳�ϴ�^_~");}}
			
		else if(se == 2) {
			System.out.println("(1) ���� �͵� ������ Ű��鼭 ���� ���� �ִ� �Ĺ��� ���ƿ�!"
					+ "\n(2) �Ĺ� Ű��� �ʹ� ������� �����ϱ� ���� �Ĺ��� Ű������ �;��!");
			System.out.println("��� �Ʒ��� ���� (1) �Ǵ� (2)�� �Է����ּ���. ���");
			int b = sc.nextInt();
			if(b==1) {
				System.out.println("���� �츮 ���� ���� ���� :: \"�丶��\" \"�����\" ��õ�帳�ϴ�^_~");}
			else if (b==2){
				System.out.println("�̷� �Ĺ� Ű����� ��� :: \"����Ű\" \"���׶�\" ��õ�帳�ϴ�^_~");}}
	}
	
	
	
	
}//c
