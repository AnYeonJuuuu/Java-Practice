package exception;

public class Exception {

	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		 try{
             int k = divide(i, j);
             System.out.println(k);
         
         //divide 오류 난 곳에서 try - catch 처리~
         }catch(IllegalArgumentException e){
             System.out.println("0으로 나누면 안됩니다.");
         }           
     }

	public static int divide(int i, int j) {
		if (j == 0) {
			// IllegalArgumentException 객체 만들어 진다.
			// new 앞의 throw는 해당 라인에서 익셉션이 발생한다는 의미
			throw new IllegalArgumentException("0으로 나눌 수 없어요.");
		}
		int k = i / j;
		return k;
	}
}
