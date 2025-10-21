package ExceptionHandling;

import java.util.Scanner;

public class Throw_Throws {
	public static String converThrows(String val) throws Exception{
		int res=Integer.parseInt(val);
		
		
		return res+"";
		
	}
	
	public static String convert(String val) {
		int res=0;
		try {
			res=Integer.parseInt(val);
			
		}
		catch(NumberFormatException e){
			
			throw new NumberFormatException("Invalid to convert "+ val+" to Integer");
			
		}
		return res+"";
		
	}

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the data");
		String a=sc.next();
		try {
			 
			String ans=convert(a);
			System.out.println("Entered value changeable to Integer "+ans);	
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			String ans=converThrows(a);
			System.out.println("Entered value changeable to Integer "+ans);	
		}
		catch(Exception e) {
            System.out.println("Invalid to convert to Integer");
		}
		

	}

}
