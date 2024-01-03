package array.com;

import java.util.*;
import java.util.Map.Entry;

public class Map3 {

	public static void main(String[] args) {

		String [] a= {"JADOUAUD","WSAGASGA","ASDGSADG","SADGASG","ASGASGS","SDAGASDG"};
		
	    List<String> a1=Arrays.asList(a);
		 
		System.out.println(a1);
		
		Map <Integer,String> map1 =new HashMap <Integer,String>();
		
		map1.put(1, "JADOUAUD");
		map1.put(2, "WSAGASGA");
		map1.put(3, "ASDGSADG");
		map1.put(4, "SADGASG");
		map1.put(5, "ASGASGS");
		
		//putIfAbsent () it is using for check the element in the list if not there then add the values.
		
		map1.putIfAbsent(1, "JADOUAUD");  
		
		// Here computeIfPresent() using like this Syntax method: (key,bifunction<? super key,?super value,?extend value,-> remappingfunction )
	
		/*method 1 using like generic type <Integer,String>
		 * 
		 *syntax like this computeIfPresent(key(key,value)->value + "update Name")
		 * ----------------------------------------------------------------------------
		 *method 2 using like generic type <String,Integer>
		 * 
		 * syntax like this computeIfPresent(value(key,value)->value + 12)
		 */
			
		//method 1 updateing String
		
		map1.computeIfPresent(1, (key, value) -> value + "Hello");
		
			for( Entry<Integer, String> map2:map1.entrySet())
			{
				System.out.println(map2);
			}
		
	}
	
}
