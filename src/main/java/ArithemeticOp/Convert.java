package ArithemeticOp;

import java.util.Scanner;

public class Convert {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Fahrenhit value: ");
		double F=sc.nextDouble();
		double C=(F-32)*5/9;
		System.out.print("The celsius value is:"+C);
		

	}

}
