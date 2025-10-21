package ControlFlow;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		int n=String.valueOf(num).length();
		int arm=num;
		int sum=0;
		int i=1;
		while(arm>0) {
			int r=arm%10;
			sum=sum+(int)Math.pow(r, n);
			arm=arm/10;
	
		}
		if(num==sum) {
			System.out.println(num+" is a Armstrong number");
			
		}
		else {
			System.out.println(num+" is not a Armstrong number");
		}

	}

}
