package string;

import java.util.Scanner;

public class RevWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the sentence :");
		String str=sc.nextLine();
		String[] words=str.split(" ");
		for(int i=0;i<words.length;i++) {
			int l=0;
			int r=words[i].length()-1;
			char[] ch=words[i].toCharArray();
			while(l<=r) {
				char x=ch[l];
				ch[l]=ch[r];
				ch[r]=x;
				l++;
				r--;
				
				
			}
			System.out.print(new String(ch)+" ");

			
		}

	}

}
