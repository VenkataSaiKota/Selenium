package string;

import java.util.Scanner;

public class RevString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int l=0;
		int r=str.length()-1;
		char[] arr=str.toCharArray();
		while(l<=r) {
			char ch=arr[l];
			arr[l]=arr[r];
			arr[r]=ch;
			l++;
			r--;
			
		}
		
		
		System.out.println(new String(arr));
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}

	}

}
