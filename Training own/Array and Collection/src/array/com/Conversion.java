package array.com;

import java.util.*;

public class Conversion {

	public static void main(String[] args) {

		int count =0;
		String b="Naveen";
		String g="Raja";
		for(int i=0;i<b.length();i++)
		{
			count++ ;
			System.out.println("Inside a Loop "+count);
		}
		System.out.println(count);
		

		StringBuffer s1= new StringBuffer(b);//for Reverse() to use FIRST necessary StringBuffer Interface.
		s1.reverse();
	    System.out.println(s1);

		
		String a[]= {"Raja","Roja","Aravind","Ashokan"}; //array
		String d[]= {"yellow","man","Snow","man"};
		
		for(String h:a)
		{
			if(g.equals(a))
			{
				System.out.println("yes is there");
			}
			else {
				System.out.println("No");
			}
		List<String> l1=Arrays.asList(a); //Converting array to list
		List<String> l4=Arrays.asList(d);
		List<String> l2=new ArrayList(l1);//Converting List to ArrayList Because if we add element in list comes error from the object.so we converting TO Arraylist().
		l2.add("Naveen");
		l2.add("Raja");
		l2.addAll(l4);
			System.out.println(l2);
			
			
		HashSet<String>s2= new HashSet(l2);//Converting  ArrayList to HashSet. 
		System.out.println(s2);
		
		
		
		TreeSet<String> t1=new TreeSet(s2);//Converting HashSet to TreeSet.
		System.out.println(t1);
		
		

		}
		
	
		
	}

}
