package com.cg.test;

import java.util.Arrays;
import java.util.List;

public class ReverseString {

	
	public static void main(String[] args) {
   String name1="AsvaaP.D";  
   String name[] = {"AsvaaP.D","Nachu","Thirumalai","N Lakshitha"}; 
   int i;
   for(i=0;i<name.length;i++)
   	{
	   	System.out.println(name[i]);   	
   	}
       if(name1==name[0])
	 {
    	  List l2=Arrays.asList(name1);
    	  System.out.println("Asvaa Name located Place or Index "+l2.size());  
    	  int length=name1.length();
    	  System.out.println("Asvaa Name length "+length);
 	   
	 }
       else
       {
    	   System.out.println("False");
       }
	}
}
