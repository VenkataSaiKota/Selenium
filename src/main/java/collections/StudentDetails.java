package collections;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s1=new Students("ven",45,'D');
		Students s2=new Students("kohli",18,'A');
		Students s3=new Students("Hardik",33,'B');
		
		List<Students> student=Arrays.asList(s1,s2,s3);
		
		Collections.sort(student);
		System.out.println(student);
		
		
		

	}

}
