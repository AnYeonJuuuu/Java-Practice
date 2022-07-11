package stringChange;

public class StringChange {
	public static void main(String[] args) {
		int iVal = 100;
//		String strVal = String.valueOf(iVal); // int를 String으로 변환한다.
		String strVal = iVal + ""; // 윗 문장과 같은 코드임

		double dVal = 200.0;
		String strVal2 = dVal + ""; // int를 String으로 변환하는 또 다른 방법

		// 윗 문장과 아랫문장 값이 똑같음 .parseInt .valueOf 인지의 차이
		double sum = Integer.parseInt("+" + strVal) + Double.parseDouble(strVal2);
		double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);

		// String.join은 구분자 계속 입력해주지 않고 이용할 수 있는 장점.
		System.out.println(String.join("", strVal, "+", strVal2, "=") + sum);
		System.out.println(strVal + "+" + strVal2 + "=" + sum2);
	}
}

