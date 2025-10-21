package Loops;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   int num=9;
	   int per=(int)Math.sqrt(num);
	   int res=num-(per*per);
	   if(res==0) {
		   System.out.println("Perfect number");
	   }
	   else {
		   System.out.println("Not a perfect number");
	   }

	}

}
