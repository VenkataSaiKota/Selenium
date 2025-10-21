package Loops;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		int b=1;
		int c=0;
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i=2;i<10;i++) {
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			
		}

	}

}
