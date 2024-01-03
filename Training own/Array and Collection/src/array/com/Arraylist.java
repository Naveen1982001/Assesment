package array.com;

import java.util.*;

/*
 * 1) it is based on Insertion order
   2) it is non Synchronized.
   3) it is contain duplicate value.
   4) it is work index based .
*/
public class Arraylist {

	public static void main(String[] args) {
		//program 1 : To set a index value Using ArrayList and sorting. 

	List<Integer> l1 =new ArrayList();
	try {
		l1.add(123);
		l1.add(1234);
		l1.add(12414);
		System.out.println(l1);
	}	
	catch(Exception e)
	{	
		e.printStackTrace();
	}	 
      //Now get and set the value :
	 System.out.println(l1.get(1));
	 l1.set(1,12414141);
	 System.out.println("Used Set method "+l1);	
	 
	 Collections.sort(l1);
	 
	 System.out.println("Finally Sorted the Array "+l1);

	}

}
