package array.com;

import java.util.*;

public class Sorting {

	public static void main(String[] args) {
		
		LinkedList<String>s1=new LinkedList<String>();
		s1.add("Naveen");
		s1.add("jajdaoiod");
		ArrayList<Integer> array=new ArrayList<Integer>();
		array.add(1100);
		array.add(112);
		array.add(113);
		array.add(11241241);
		array.add(1);
		array.add(1211); 
		array.add(Integer.valueOf(123));
		
		Collections.shuffle(array);System.out.println("Shuffle "+array);
		Collections.sort(array);System.out.println("Sort "+array);
		
		Collections.sort(s1); //sortingSet method
		System.out.println(s1);
		
		
	}

}
