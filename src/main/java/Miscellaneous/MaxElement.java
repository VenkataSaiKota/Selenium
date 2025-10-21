package Miscellaneous;

public class MaxElement {
	
	public static int bigValue(int[] arr)
	{
		int max=arr[0];
		for(int num:arr) {
			if(max<num) {
				max=num;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,65,76,5,4,33,4,34,232,3,2323};
		int res=bigValue(arr);
		System.out.print("The biggest number is :" + res);
		

	}

}
