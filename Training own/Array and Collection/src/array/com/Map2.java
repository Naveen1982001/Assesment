package array.com;

import java.util.*;
import java.util.Map.Entry;

public class Map2 {

	public static void main(String[] args) {
		
	 Map <Integer,String> m1=new HashMap<Integer,String>();
	 
	 m1.put(1,"Naveen1");
	 m1.put(2,"Naveen2");	
	 m1.put(3,"Naveen3");
	 
	 //Method 2 using foreach loop 
	 
	for(Entry m2:m1.entrySet())
	{
		System.out.println(m2.getValue()+""+m2.getKey());
	}
		

	}

}
