package Miscellaneous;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		int res=1;
		for(int i=num;i>0;i--) {
			res=res*i;
			
		}
		System.out.println("The factorial of a given number is :"+res);

	}

}
