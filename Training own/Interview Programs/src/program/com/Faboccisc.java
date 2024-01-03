package program.com;

public class Faboccisc {

	public static void main(String[] args) {
		/*0,1,1,2,3,4,5
		 * 0+1=1    loop1
		 *  1+1=2   loop2
		 *   1+2=3   loop3
		 *    2+3=5  loop4
		 */
		
		int loop=4;	
		int a=0;
		int b=1;
		int c=0;
		
		for(int i=1;i<=loop;i++)
		{
			c=a+b;
			a=b;
			b=c;
		}

		System.out.println(c);
	}

}
