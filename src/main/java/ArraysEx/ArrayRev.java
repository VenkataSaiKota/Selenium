package ArraysEx;

import java.util.Arrays;

public class ArrayRev {

	public static void main(String[] args) {
		int[] arr = {9,3,6,8,4,7};
		int l=0;
		int r=arr.length-1;
		while(l<=r) {
			int t=arr[l];
			arr[l]=arr[r];
			arr[r]=t;
			l++;
			r--;
			
		}
		
		System.out.print(Arrays.toString(arr));
		

	}

}
