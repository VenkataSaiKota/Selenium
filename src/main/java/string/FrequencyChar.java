package string;

import java.util.Scanner;

public class FrequencyChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string :");
		String str=sc.next();
		int[] count=new int[256];
		
	    for(char ch:str.toCharArray()) {
	    	count[ch]++;
	    }
	    
	    for(int i=0;i<256;i++) {
	    	if(count[i]>0) {
	    		System.out.println((char)i+" : "+count[i]);
	    	}
	    }

	}

}
