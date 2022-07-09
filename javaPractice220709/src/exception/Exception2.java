package exception;

public class Exception2 {

	  public static void main(String args[]) 
	    {
		  try {
				System.out.println("Exception STEP 1 =======");			
				throw new Exception();	
				
			} catch (Exception e) {
				System.out.println("Exception STEP 2 =======");
			}
	
	}
}

