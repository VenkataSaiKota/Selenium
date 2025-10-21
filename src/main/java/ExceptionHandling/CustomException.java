package ExceptionHandling;


public class CustomException {

//	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Negative.negativeNumbercheck(-4);
		Negative.negativeNumbercheck(5);

	}

}

class InvalidException extends Exception{
	public InvalidException(String m) {
		super(m);
	}
	
}
class Negative{
	public static void negativeNumbercheck(int num) {
		
		try {
			if(num<0) 
				throw new InvalidException("Entered number is an negative number");
			else
				System.out.println("Entered number is a positive number");
			
		}catch(InvalidException e) {
			System.out.println(e.getMessage());
		}
			 
			
	
	}
}





