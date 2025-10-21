package Miscellaneous;

public class Fibanocii {
	
	public static void fibo(int n1,int n2) {
		
		System.out.print(n1+" ");
		System.out.print(n2+ " ");
		for(int i=2;i<5;i++) {
			int res=n1+n2;
			System.out.print(res+" ");
			n1=n2;
			n2=res;
			
		}
		
	}

	public static void main(String[] args) {
		int num1=0;
		int num2=1;
		fibo(num1,num2);
			

	}

}
