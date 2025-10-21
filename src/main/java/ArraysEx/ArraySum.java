package ArraysEx;

public class ArraySum {
	
	public static int sum(int[] arr) {
		int res=0;
		for(int num:arr) 
			 res=res+num;
		
		return res;
	
	}
	public static double avg(int[] arr) {
		double ans=(double)sum(arr)/arr.length;
		return  ans;
		
	}

	public static void main(String[] args) {
		int[] arr= {9,10,8,3,6,4,8,5};
		int s=sum(arr);
		System.out.println("The  sum of elements in an array :"+s);
		double a=avg(arr);
		System.out.println("The  average of elements in an array :"+a);
		

	}

}
