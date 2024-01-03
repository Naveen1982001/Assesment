package array.com;

import java.util.*;
import java.util.Map.Entry;

public class Map5 {
	//linkedHashMap and treeMap
	
	int reg;
	String name,section;
    
	public Map5(int reg,String name,String section)
	{
		this.reg=reg;
		this.name=name;
		this.section=section;
	}

	public static void main(String[] args)
     {
			// here used generic class i mention heterogeneous Datatypes in same generic class so  mention only that class name "Map5"
		Map<Integer,Map5> m1=new LinkedHashMap<Integer,Map5>();
		
		Map5 student1=new Map5(101,"Yokesh","Cse");
		Map5 student2=new Map5(56,"Naveen","Cse");
		
		m1.put(1,student1);
	    m1.put(3,student2);
	   
	    for(Entry<Integer,Map5> map:m1.entrySet ())
	    {
	    	int key=map.getKey();
	    	Map5 student=map.getValue();
	    	System.out.println(key + " "+student.name);
	    	
	    }
	    
	    //////////TREEMAP
	    
	    Map<Integer,Map5> tree=new TreeMap<Integer,Map5>();
		  
	    tree.put(2, student2);
	    tree.put(1, student1);
	    
	    for(Entry<Integer,Map5> tree1:tree.entrySet())
	    {
	    	int key1=tree1.getKey();
	    	Map5 student=tree1.getValue();
	    	
	    	System.out.println(key1+ " "+student.name);
	    }
	  
		
		
	}

}
