package array.com;

import java.util.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Collection2 {

	public static void main(String[] args) {
		// Set(Interface)=>> HashSet ,LinkedHashSet,TreeSet,SortedSet(Interface)
	
		/*1)HashSet stores the elements by using a mechanism called hashing.
		  2)HashSet contains unique elements only.
		  3)HashSet allows null value.
		  4) It is Based on Insertion Order.
		*/
		HashSet<Integer> h1=new HashSet<Integer>();
		h1.add(13);
		h1.add(244);
		h1.add(12314);
		System.out.println(h1);
		h1.remove(13);
		System.out.println(h1);
		
		LinkedHashSet<Integer> h2=new LinkedHashSet<Integer>();
		
		h2.addAll(h1);
		h2.add(319854195);
		System.out.println(h2);
		h2.clone();  
		System.out.println(h2);
	}

}
