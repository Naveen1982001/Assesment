package program.com;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		int rem=0;
		int product=0;
		int add=0;
		
		Scanner s1=new Scanner(System.in);
        System.out.println("Enter the Palindrom number");
		int num= s1.nextInt();
		
	     while(num>0)
	     {
	    	 rem=num%10;            //    1       2         1
	    	 product=product*10;   //  0*10=0 , 1*10=10, 12*10=120
	    	
	    	 product+=rem;         //   0+1=1,  10+2=12, 120+1=121
	    	 
             num=num/10;
         		
	     }
	     
	     	

	}

}
