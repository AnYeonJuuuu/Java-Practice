package job;

import java.util.Scanner;

import member.Member;

public class Punip extends Member implements GoalSchool {

	public Punip() {
		
	}
	Scanner sc = new Scanner(System.in);

//	
//	public Punip(String name, char gender, int birth, int phone, String id, String pw) {
//		super(name, gender, birth, phone, id, pw);
//	}


//
//	public Punip(String name, char gender, int birth, int phone, String id, String pw, Scanner sc, String goalschool) {
//		super(name, gender, birth, phone, id, pw);
//		this.goalschool = goalschool;
//	}

	
	

	public void sameMager() throws SamMagerException {
		System.out.println("===== ���� ������ ���Ͻø� Y, Ÿ������ ����Ͻø� N �� �Է����ּ���.(��ҹ��� ���� ����.) =====");
		String result = sc.nextLine();

			if(result.equalsIgnoreCase("y")) {
				System.out.println("�������� �����ϼ̽��ϴ�.");
			} else if(result.equalsIgnoreCase("n")) {
			System.out.println("Ÿ���� �����ϼ̽��ϴ�.");}
			else{throw new SamMagerException("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.\nY �Ǵ� N�� �Է��ϼ���.(��ҹ��� ���� ����.)\n");}
	}

	@Override
	public void goalSchool() {
		System.out.println("��ǥ ������ �Է����ּ���.(3���� �б� �Է�.)");
		System.out.println("1����");
		String fir = sc.nextLine();
		System.out.println("2����");
		String sec = sc.nextLine();
		System.out.println("3����");
		String thr = sc.nextLine();
		System.out.println("1����" + fir +"2����"+ sec + "3����" + thr);
		
	}

}
