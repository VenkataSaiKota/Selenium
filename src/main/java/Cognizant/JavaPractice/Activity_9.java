package Cognizant.JavaPractice;

import java.util.Scanner;

public class Activity_9 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		boolean play=true;
		
		while(play) {
			String p1=s.next();
			String p2=s.next();
			if(p1.equals(p2)){
				System.out.println("Tie");
			}
			else if((p1.equals("rock")&& p2.equals("scissors"))||(p1.equals("scissors")&&p2.equals("paper"))||p1.equals("paper")&&p2.equals("rock")) {
				System.out.println("Player 1 wins");
			}
			else {
				System.out.println("Player 2 wins");
			}
			String playAgain=s.next();
			play=playAgain.equals("yes");
			
		
			
			
		
			
			
		}
		System.out.print("Thanks for playing");
		
		
		
	}

}
