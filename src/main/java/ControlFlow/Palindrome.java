package ControlFlow;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		int pal=num;
		int sum=0;
		while(pal>0) {
			int r=pal%10;
			sum=(sum*10)+r;
			pal=pal/10;
		}
		
		if(sum==num) {
			System.out.println(num+" is a palindrome ");
		}
		else {
			System.out.println(num+" is not a palindrome ");
		}

	}

}
