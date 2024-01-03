package program.com;

import java.util.Scanner;

public class Gcd {

    public static void main(String[] args) {

    int a = 12;
    int b = 24;
    int c = 9;
    int gcd =0;
    
     for(int i=1;i<=a||i<=b||i<=c;i++)
     {
    	 if(a%i==0 && b%i==0 && c%i==0)
    		 gcd=i; 
     }
    	System.out.println("Using for loop gcd is "+gcd);    	
  
  //---------------------------------------------------------  	
    	int a1 = 12;
        int b1 = 24;
        int c1=9;
        int gcd1=0;
        int j=1;
        while(j<a1&&j<b1&&j<c1)
        {
        	if(a1%j==0&&b1%j==0&&c1%j==0)
        	{
        		gcd1=j;		
        	}
        	j++;
        }
        
        System.out.println("Using while loop gcd is "+gcd1);    
         
    	
  //----------------------------------------------------------------- 	
    	int a2=12;
    	int b2 = 24;
        int c2=9;
    int temp=0;
    int temp1=0;	
    	while(b2!=0)
    	{
    		temp=b2;
    		b2=a2%b2;
    		a2=temp;
    		
    	}
    	 
    	   while(a2!=0)
    	   {
    		 temp1=a2;
    		 a2=a2%c2;
    		 c2=temp1;
    		
    	 }
    	
    	System.out.println("Using of Euclidean Algorithm"+c2);
  	
    }
 
}
