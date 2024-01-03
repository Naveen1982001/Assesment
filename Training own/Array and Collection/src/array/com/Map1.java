package array.com;

import java.util.*;

public class Map1 {

	public static void main(String[] args) {
		
	/*
	 * Map is contain key and Value Pair is known as Entry.
	 * Map contain only unique keys.
	 *
	 * to add a value used for put().
	 * 
	 * */
	 
	 Map<Integer, String> map=new HashMap<Integer, String>();
	 map.put(1, "naveenDepp");  
	 map.put(2, "1naveen");
	 map.put(3, "2naveen");
	 
	 
	 
	 System.out.println(map);
	 System.out.println(map.keySet());
	 System.out.println(map.values());
	
	 //traverse  - traverse is mean iteration like forloop or foreach loop.
	 Set set=map.entrySet(); // entrySet() is return value from the present in same hashmap value1
	
	 Iterator it=set.iterator();
	 
	 while(it.hasNext())
	 {
		 System.out.println(it.next());
	 }
	
	
	 
	}

}
