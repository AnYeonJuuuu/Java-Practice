package join;

import java.util.Scanner;

import member.Member;
public class Join {
	Scanner sc = new Scanner(System.in);

	public void firstJoin() {
		System.out.println(" ȸ������");
		
	}
	
	Member mb = new Member();
	public void mainJoin() {
		System.out.println("�̸��� �Է����ּ���.");
		mb.setName(sc.nextLine());
		System.out.println("������ �Է����ּ���(M �Ǵ� F �Է�.)");
		mb.setGender(sc.nextLine().charAt(0));//�� ���ڸ� �Է� �ް� ���� �� ".charAt"

	}
	
	
	public void endingJoin() {
		System.out.println("======= + name + ���� �հ��� ����մϴ�. ========");
		
	}
}
