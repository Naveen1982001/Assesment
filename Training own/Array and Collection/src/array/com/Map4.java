package array.com;

import java.util.*;
import java.util.Map.Entry;

public class Map4 {

	public static void main(String[] args) {
		//method 2 here updateing integer
		
		Map<String,Integer> map1=new HashMap <String,Integer>();
		map1.put("name1",1);
		map1.put("name2",2);
		map1.put("name3",3);
		map1.put("name4",4);
			
		map1.computeIfPresent("name1",(key,value) -> value + 100);
		
		for(Entry<String,Integer> map2:map1.entrySet())
		{
			System.out.println(map2);
		}
	
		
	}

}
