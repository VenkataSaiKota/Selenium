package Loops;

import java.util.Scanner;

public class FloydsTriangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of rows:");
		int num=sc.nextInt();
		int r=1;
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(r+" ");
				r++;
			}
			System.out.println();
			
			
		}

	}

}
