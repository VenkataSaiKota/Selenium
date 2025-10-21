package string;

import java.util.Scanner;

public class EliminateNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string which contains alphabets and numbers :");
		String str=sc.next();
		for(char ch:str.toCharArray()) {
			if(Character.isLetter(ch)) {
				System.out.print(ch);
			}
			else {
				continue;
			}
		}
	
		

	}

}
