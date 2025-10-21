package Miscellaneous;

import java.util.Scanner;

public class RecursionFact {
	
	
	public static int fact(int num)
	 {
		if(num<2) {
			return 1;	
		}
		else 
			return num*fact(num-1);
			
	  }

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=sc.nextInt();
		int res=fact(num);
		System.out.print("The factorial of a given number is :"+res);
		

	 }

}
