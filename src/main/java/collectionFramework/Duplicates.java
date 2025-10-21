package collectionFramework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Duplicates {

	public static void main(String[] args) {
		
		List<Integer> dup=Arrays.asList(1,5,3,2,0,4,5,6,1,7,0);
		HashMap<Integer,Integer>map=new HashMap<>();
		
		
		for(Integer x:dup) {
		
			map.put(x, map.getOrDefault(x, 0)+1);
		}
		System.out.println("The duplicate elements are: ");
		
		for(Integer key:map.keySet()) {
			if(map.get(key)>1) {
				System.out.println(key);
			}
		}
		
		

	}

}
