package ExceptionHandling;

public class SimpleTry_Catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=0;
		try {
			
			int ans=23/num;
			System.out.println("Answer is:"+ans);
		}
		catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("This will excute  expection occur or not");
		}

	}

}
