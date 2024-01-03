package array.com;

import java.util.*;

public class TreeSet1 {
/*  1)Java TreeSet class contains unique elements only like HashSet.
	2)Java TreeSet class access and retrieval times are quiet fast.
	3)Java TreeSet class doesn't allow null element.
	4)Java TreeSet class is non synchronized.
	5)Java TreeSet class maintains ascending order. 
 */
	public static void main(String[] args) {
		TreeSet<Integer> t1=new TreeSet<Integer>();
		 t1.ceiling(123);
		 
		 t1.add(621241248);
		 t1.add(14124);
		 t1.add(623);
		 t1.add(621241243);
		 System.out.println(t1);
		 
		 Iterator t2= t1.descendingIterator();
		 while(t2.hasNext())
		 
		 System.out.println("Using Of Decending order ="+ t2.next());
		
		 
		 System.out.println("Lowest Value"+t1.pollFirst());
		 System.out.println("Highest Value"+t1.pollLast());
	}

}
