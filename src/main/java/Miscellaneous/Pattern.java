package Miscellaneous;

public class Pattern {

	public static void main(String[] args) {
		
		System.out.println("*");
		for(int i=1;i<=7;i++) {
			System.out.print("*"+" ");
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
