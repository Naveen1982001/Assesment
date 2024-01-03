package program.com;

import java.util.Arrays;

public class Matrix {

	//multiDimensionalArray
	
	public static void main(String[] args) {
		
	int	a[][]= {{1,2,3,4},{3,2,4,5}};
			System.out.println(Arrays.deepToString(a));
			System.out.println(a[0][2]);
		
	//Addition of Three Array or Matrix
			
			int a1[][]= {{1,2,3},{1,2,3},{2,3,4}};
			int b[][]= {{1,2,3},{1,2,3},{2,3,4}};
			
			int c[][]=new int[3][3];
			System.out.println("using of Addition");
			for(int i=0;i<3;i++)// row
			{
				for(int j=0;j<3;j++)//column
				{
					c[i][j]=a1[i][j]+b[i][j];
					System.out.print(c[i][j]+" ");
				}				
				System.out.println("");
			}
			
    //multiple of matrix
		int a2[][]= {{3,4,5},{2,4,3},{7,2,9}};
		int b2[][]= {{3,2,3},{4,2,3},{2,5,1}};
		
		int c2[][]=new int[3][3];
		System.out.println("using of Multiplication");
		for(int i2=0;i2<3;i2++)// row
		{
			for(int j2=0;j2<3;j2++)//column
			{	
				for(int k=0;k<3;k++)
				{
					c2[i2][j2]+=a2[i2][k]*b2[k][j2];
				}
				System.out.print(c2[i2][j2]+" ");
			}
			System.out.println(" ");
		}
			
			
	//Division of Matrix
		int a3[][]= {{3,4,5},{2,4,3},{7,2,9}};
		int b3[][]= {{3,2,3},{4,2,3},{2,5,1}};
		
		int c3[][]=new int[3][3];
		
		System.out.println("using of Division");
		
		for(int i3=0;i3<3;i3++)
		{
			for(int j3=0;j3<3;j3++)
			{
				c3[i3][j3]=a3[i3][j3]/b3[i3][j3];
				System.out.print(c3[i3][j3]+" ");
			}
			System.out.println(" ");
		}
		
		
		
	}

}
