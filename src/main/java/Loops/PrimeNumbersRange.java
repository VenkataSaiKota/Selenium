package Loops;

public class PrimeNumbersRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num=40;
        boolean val=true;
        for(int i=2;i<num;i++) {
        	val=true;
        	for(int j=2;j<=Math.sqrt(i);j++) {
        		if(i%j==0) {
        			val=false;
        			break;
        		}
        	}
        	if(val) {
        		System.out.print(i+" ");
        	}
        	
        }
	}

}
