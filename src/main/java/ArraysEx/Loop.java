package ArraysEx;

public class Loop {

	public static void main(String[] args) {
		int[] arr= {9,10,8,3,6,4,8,5};
		System.out.println("The values of arrays using for-each loop");
		for(int num:arr) {
			System.out.print(num+ " ");
		}
		System.out.println();
		
		System.out.println("The values of array using for loop ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		

	}

}
