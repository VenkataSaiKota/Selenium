package ControlFlow;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		if(num%2==0) {
			System.out.println(num+ " is a even number ");
			
		}
		else {
			System.out.println(num+ " is a odd number");
		}

	}

}
