package ArithemeticOp;

import java.util.Scanner;

public class SwapTwo {
	
	public static void swapThirdVariable(int a,int b) {
		int temp=a;
		a=b;
		b=temp;
		
		System.out.println("The value of a after swapping is "+a);
		System.out.println("The value of b after swapping is "+b);
		
	}
	public static void swap(int a,int b) {
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("The value of a after swapping is "+a);
		System.out.println("The value of b after swapping is "+b);
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=5;
		int b=6;
		swap(a,b);
		swapThirdVariable(a,b);
		
		
		
	}

}
