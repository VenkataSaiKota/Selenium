package ArraysEx;

public class SecondMax {

	public static void main(String[] args) {
		int[] arr= {9,10,8,3,6,4,8,5};
		int max=arr[0];
		int smax=0;
		for(int num:arr) {
			if(max<num) {
				max=num;
			}
		}
		
		for(int x:arr) {
			if(smax<x && x<max) {
				smax=x;
				
			}
		}
		
		System.out.println("The second largest number in an array: "+smax);
		

	}

}
