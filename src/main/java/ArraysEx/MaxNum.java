package ArraysEx;

public class MaxNum {

	public static void main(String[] args) {
		
		int[] arr= {9,3,6,4,8,5};
		int max=arr[0];
		int min=arr[0];
		
		for(int num:arr) {
			if(max<num) {
				max=num;
			}
			
			if(min>num) {
				min=num;
			}
			
		}
		System.out.println("The largest number in the array is :"+max);
		System.out.println("The smallest number in the array is :"+min);

	}

}
