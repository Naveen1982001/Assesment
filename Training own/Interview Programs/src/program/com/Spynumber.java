package program.com;

import java.util.Scanner;

public class Spynumber {

	public static void main(String[] args) {
		
		Scanner s1=new Scanner(System.in);
        System.out.println("Enter the SpyNumber");
		int i= s1.nextInt();
		
		int rem = 0;
		int sum=0;
		int num=0;
		int product=1;
		
	while(i>0)
	{
		rem = i%10;
	    sum= sum+rem;
	    product=product*rem;
		i= i/10;
	}

		if(sum==product)
		{
			System.out.println("It is Spynumber "+sum+"<=sum , product=>"+product);
		}
		else
		{
			System.out.println(" Not a Spynumber"+sum+"<=s , p=>"+product);
		}
	}

}
