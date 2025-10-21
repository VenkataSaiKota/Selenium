package Cognizant.JavaPractice;

import java.util.Scanner;

public class Activity_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc=new Scanner(System.in);
          String day=sc.next();
          switch(day) {
          case "Monday":
        	             System.out.print("Biceps workout");
                         break;
          case "Tuesday":
        	              System.out.print("Shoulder workout");
                          break;
          case "Wednesday":
        	              System.out.print("Back workout");
                          break;
          case "Thursday":
        	              System.out.print("Abs workout");
                          break;
          case "Friday":
        	              System.out.print("Legs workout");
                          break;
          case "Saturday":
        	              System.out.print("chest workout");
                          break;
          case "Sunday":
        	              System.out.print("Rest");
                          break;
          
                   
          }
          
	}

}
