package array.com;

import java.util.*;

/*
 * 1) it is based on Insertion order
   2) it is non Synchronized.
   3) it is contain duplicate value.
   4) it is work like stack,queue order.
   5) it is faster searching,adding more than ArrayList
*/
public class Linkedlist1 {

	public static void main(String[] args) {
	
		LinkedList<Integer> l1=  new LinkedList<Integer>();
		l1.addFirst(12);
		l1.add(122);
		l1.addLast(12341);
		
		l1.set(1,13);
		System.out.println(l1);
		System.out.println(l1.get(1));
		System.out.println("Peeking First value ="+l1.peekFirst());
		
		Iterator it=l1.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	

	}

}
