package Cognizant.JavaPractice;

import java.util.Scanner;

public class Activity_4_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the principal :");
		int P=sc.nextInt();
		System.out.print("Enter the rate of interest:");
		int R=sc.nextInt();
		System.out.print("Enter the time :");
		int T=sc.nextInt();
		double SI=(P*R*T)/100;
		System.out.print(SI);

	}

}
