package Cognizant.JavaPractice;

public class Calculator {

	public static void main(String[] args) {
		int num1=10;
		int num2=12;
		int Add=addition(num1,num2);
		System.out.println("The Summation of the  two numbers :"+Add);
		int Sub=subtraction(num1,num2);
		System.out.println("The Subtraction of the  two numbers :"+Sub);
	
		
	}
	public static int addition(int n1,int n2) {
		int sum=n1+n2;
		return sum;
	}
	public static int subtraction(int n1,int n2) {
		int sub=n1-n2;
		System.out.print("hello");
		return sub;
		
		
		
	}
	
}
