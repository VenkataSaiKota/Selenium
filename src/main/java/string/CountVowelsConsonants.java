package string;

import java.util.Scanner;

public class CountVowelsConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string :");
		String str=sc.next();
		int Vcount=0;
		int Ccount=0;
		for(char ch:str.toCharArray()) {
			if(ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
				Vcount++;
			}
			else {
				Ccount++;
			}
			
			
		}
		System.out.println("vowels in a string is "+Vcount);
		System.out.println("consonants in a string is "+Ccount);

	}

}
