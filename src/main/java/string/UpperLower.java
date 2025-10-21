package string;

import java.util.Scanner;

public class UpperLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String :");
		String str=sc.nextLine();
	    String s="";
	    int i=0;
	    for(char ch:str.toCharArray()) {
	    	if(Character.isLetter(ch)) {
	    		if(i%2==0) {
		    		 s=s+Character.toUpperCase(ch);
		    		
		    	}
		    	else {
		    		s=s+Character.toLowerCase(ch);
		    	}
	    		i++;
	    		
	    	}
	    	else {
	    		s=s+ch;
	    	}
	    	
	    	 
	    	 
	    	
	    }
	    System.out.print(s);

	}

}
