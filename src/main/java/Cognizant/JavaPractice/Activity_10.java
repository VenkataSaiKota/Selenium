package Cognizant.JavaPractice;

public class Activity_10 {

	public static void main(String[] args) {
		 int[] marks={45,67,29,90,33};
	        int sum=0;
	        int max=marks[0];
	        int min=marks[0];
	        
	        for(int a:marks){
	            sum+=a;
	        }
	        int avg=sum/marks.length;
	        System.out.println("The avg of the marks :"+avg);
	        for(int x:marks ){
	            if(x>max){
	                max=x;
	            }
	            if(x<min){
	                min=x;
	            }
	        }
	        System.out.println("the highest mark:"+max);
	        System.out.println("The smallest mark :"+min);

	}

}
