package stringChange;

public class StringChange {
	public static void main(String[] args) {
		int iVal = 100;
//		String strVal = String.valueOf(iVal); // int�� String���� ��ȯ�Ѵ�.
		String strVal = iVal + ""; // �� ����� ���� �ڵ���

		double dVal = 200.0;
		String strVal2 = dVal + ""; // int�� String���� ��ȯ�ϴ� �� �ٸ� ���

		// �� ����� �Ʒ����� ���� �Ȱ��� .parseInt .valueOf ������ ����
		double sum = Integer.parseInt("+" + strVal) + Double.parseDouble(strVal2);
		double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);

		// String.join�� ������ ��� �Է������� �ʰ� �̿��� �� �ִ� ����.
		System.out.println(String.join("", strVal, "+", strVal2, "=") + sum);
		System.out.println(strVal + "+" + strVal2 + "=" + sum2);
	}
}

