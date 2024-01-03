package com.input.scanner;

import java.util.*;

public class Scan {

	public static void main(String[] args) {
	

		Scanner s1=new Scanner(System.in);
		System.out.println("First name");
		String name= s1.next();
	
		System.out.println("Second name");
		String name1= s1.next();
		
		
		System.out.println("Third name");
		String name2= s1.next();
		
	
		System.out.println("Fourth name");
		String name3= s1.next();
		
		String a[]= {name,name1,name2,name3};
		
	
		
	
	    ArrayList<String> a1= new ArrayList <String> (Arrays.asList(a)); // Converting array to List	
		System.out.println("Here your List of Name"+ a1);
		
		

		

		String samename="naveen";
		
		boolean bool= a1.contains(samename);
		System.out.println(bool );
		 
		 
	}

}



