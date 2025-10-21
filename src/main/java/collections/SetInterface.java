package collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		HashSet<String> set=new HashSet<>();
//		set.add("kohli");
//		set.add("dhoni");
//		set.add("hardik");
//		set.add("rohit");
//		set.add("bumrah");
		boolean play=true;
		System.out.println("1.add");
		System.out.println("2.remove");
		System.out.println("3.active");
		System.out.println("4.display");
		while(play) {
			
			System.out.println("Enter the option:");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:set.add(sc.next());
			       break;
			case 2:System.out.println("remove the person");
			       String per=sc.next();
			       if(set.contains(per)) {
			    	   set.remove(per);
			       }
			       break ;
			case 3: String ac=sc.next();
			        if(set.contains(ac)) {
			        	System.out.println("Active person");
			        	break;
			        }
			        else {
			        	System.out.println("not a active person");
			        	break;
			        }
			        
			case 4: System.out.println(set);
			       break;
			       
			default :play=false;
			
			       
			
			}
		}
			
			
			
		
		

	}

}
