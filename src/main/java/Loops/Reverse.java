package Loops;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		int re=num;
		int rev=0;
		while(num>0) {
			int r=num%10;
			rev=rev*10+r;
			num=num/10;
		}
		System.out.println("The reverse of a "+re+" is "+ rev);

	}

}
