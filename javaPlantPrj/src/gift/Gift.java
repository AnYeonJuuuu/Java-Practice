package gift;

import java.util.Random;

public class Gift {

	public void giftment() {
		System.out.println();
		System.out.println("===== 100% ��ǰ ��÷ �̺�Ʈ�� �����մϴ�!!===== "
				+ "\n(1)~(5)�� �� ���ڸ� �Ʒ��� �Է����ּ���."
				+ "\n(** ��ǰ�� �������� �����˴ϴ�.)");
	}
	
	public void giftrandom() {
		Random rd = new Random(); // ��ü ����
		int p = rd.nextInt(5)+1;
		
		// �����մϴ� ��Ʈ�� for���̳� �迭�� �־ �����ϰ� ����� �;��µ� �� ��!!!
		if(p == 1) {
			System.out.println("�����մϴ�! \"LG �Ĺ� ����\"�� ��÷�Ǽ̽��ϴ�^.^");
		}else if(p == 2) {
			System.out.println("�����մϴ�! \"LG �Ĺ� ����\"�� ��÷�Ǽ̽��ϴ�^.^");
		}else if(p == 3) {
			System.out.println("�����մϴ�! \"�Ｚ ��Ÿ�Ϸ�\"�� ��÷�Ǽ̽��ϴ�^.^");
		}else if(p == 4) {
			System.out.println("�����մϴ�! \"�������� �����̿��\"�� ��÷�Ǽ̽��ϴ�^.^");
		}else if(p == 5) {
			System.out.println("�����մϴ�! \"�����Թ� 20m x 20m ��� �̿��\"�� ��÷�Ǽ̽��ϴ�^.^");
		}

		System.out.println();
		System.out.println("====== ���� �Բ� �� �Ĺ� ã�⸦ �����մϴ�. �̿����ּż� �����մϴ�. ======");
	}
}
