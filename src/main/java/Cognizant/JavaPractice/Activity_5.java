package Cognizant.JavaPractice;

import java.util.Scanner;

public class Activity_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		if(age<5) {
			System.out.println(" The ticker is free of cost");
			
		}
		else if(age>=5 && age<=18) {
			System.out.print("The ticket price is :50rs");
		}
		else if(age>=19 && age<=60) {
			System.out.print("The ticket price is 100rs");
		}
		else {
			System.out.print("The ticket price is 70rs");
		}
	}

}
