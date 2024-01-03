package array.com;

import java.util.ArrayList;
import java.util.Arrays;

public class Array {

public static void main(String[] args) {
		
	int a[]= {1,2,3,4,5};
//method 1	
	System.out.println(Arrays.toString(a));
//method 2	
	String a1=Arrays.toString(a); 
	System.out.println(a1);
	
//------------------------------------------------
//method 3 using of For loop
	int b[]= {11,22,33,44,55};
	for(int i=0;i<b.length;i++)
	{
		System.out.println("The index is "+i+" Value of "+b[i]);
		
	} 	
	
//------------------------------------------------	
//method 4 using of ForEach loop
	for(int c:b)
	{
		System.out.println(c);
	}	
}
}