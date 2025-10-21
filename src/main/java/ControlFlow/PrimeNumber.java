package ControlFlow;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		boolean val=true;
		if(num<2) {
		  val=false;
		}
		for(int i=2;i<Math.sqrt(num);i++) {
			if(num%i==0) {
				val=false;
			
			}
		}
			if(val) {
				System.out.println(num+" is a prime number");
				
			}
			else {
				System.out.println(num+" is not a prime number");
			}
		

	}

}
