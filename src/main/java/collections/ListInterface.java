package collections;

//import java.util.ArrayList;
//import java.util.Collections;
import java.util.*;

public class ListInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer>list=new ArrayList<>();
	        list.add(120);
	        list.add(1);
	        list.add(5);
	        list.add(2);
	        list.add(56);
	        list.add(45);
	        list.add(67);
	        list.add(4);
	        list.add(0);
	        list.add(9);
	        Collections.sort(list);
	        System.out.println(list);
	        Collections.reverse(list);
	        for(Object x:list) {
	        	System.out.print(x+" ");
	        }

	}

}
