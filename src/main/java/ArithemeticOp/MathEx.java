package ArithemeticOp;

import java.util.Scanner;

public class MathEx {

	public static int gcd(int a,int b) {
		while(b>0) {
			int t=b;
			b=a%b;
			a=t;
		}
		return a;
		
		
	}
	
	public static void lcm(int a,int b) {
		int Lcm=(a*b)/gcd(a,b);
		System.out.println("The LCM of the given two numbers is :"+Lcm);
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int g=gcd(a,b);
		System.out.println("The GCD of the given two numbers is :"+g);
		lcm(a,b);

	}

}
