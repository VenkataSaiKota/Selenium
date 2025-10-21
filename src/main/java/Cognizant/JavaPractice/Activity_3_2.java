package Cognizant.JavaPractice;

public class Activity_3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double item1=20;
		double item2=20;
		double item3=20;
		double T_cost=item1+item2+item3;
		int Discount=10;
		double Res=(T_cost*Discount)/100;
		System.out.println("The original total :"+T_cost);
		System.out.println("The final amount :"+(T_cost-Res));
		System.out.println("The discount amount is :"+Res);
		
	}

}
