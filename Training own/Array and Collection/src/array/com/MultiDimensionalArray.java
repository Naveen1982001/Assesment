package array.com;

import java.util.Arrays;


public class MultiDimensionalArray {


	
	public static void main(String[] args) {
	//method 1 declaration and initialize				
		int a[][]=	{{2,3,4},{5,6,7,8}};           //here i am directly declared the value in the array.							
		System.out.println(a[0][1]);               //this printstatment is mentioned only one syntax value.
		System.out.println(Arrays.deepToString(a));//this PrintStatement is Mentioned for Print all Number in the Array.
		a[1][1]=10;                                 //this step is adding index value instead of 6.Syntax
		System.out.println(Arrays.deepToString(a));
		System.out.println(a.length);
	//method 2	First Declaration After Initialize
		
		int b[][]=new int [3][3]; //Declaration
		
		b[0][0]=1; //initialize
		b[0][1]=2;
		b[0][2]=3;

		System.out.println(Arrays.deepToString(b));
		
		for(int i=0;i<b.length;i++) 
		{
			for(int j=0;j<b.length;j++)
			{
			System.out.println(b[i][j]);
			}
		
		}
		
	}

}
