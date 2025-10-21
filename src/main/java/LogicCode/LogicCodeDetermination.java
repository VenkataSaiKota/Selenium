package LogicCode;

import java.util.Scanner;

public class LogicCodeDetermination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the shiptment details ");
         
         String word=sc.nextLine();
         String det[]=word.split(":");
         if(det.length!=4) {
        	 System.out.println(word+" is an invalid input");
        	 return ;
         }
         
         String name=det[0];
         String des=det[1];
         String mon=det[2];
         String year=det[3];
         
         if(!name.matches("[a-zA-z]+")) {
        	 System.out.println(name+" is an invalid input");
        	 return ;
         }
         if(!des.matches("[a-zA-Z]{3,}")) {
        	 System.out.println(des+" is an invalid destination");
        	 return ;
         }
         int month = 0;
         try {
        	  month=Integer.parseInt(mon);
        	 if(month<1 || month>12) {
        		 System.out.println(mon+" is an invalid month");
        		 return ;
        	 }
         }catch(Exception e) {
        	 System.out.println(mon+" is an invalid month");
         }
         if(!year.matches("\\d{4}")) {
        	 System.out.println(year+" is an invalid year");
        	 return ;
         }
         String destin=des.substring(0,3).toUpperCase();
         String date=String.format("%02d", month)+year.substring(2);
         System.out.println("Shipment code:" + destin + "/" + date);
	}

}
