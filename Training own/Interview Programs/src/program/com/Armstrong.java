package program.com;

public class Armstrong {

	public static void main(String[] args) {
		//153
		
		int num =153;
		int rem=0;
		int s1=0;
		int s2=0;
		int temp=num;
		while(num>0)
		{
			rem=num%10;
			s1=rem*rem*rem;
			s2=s2+s1;
			num=num/10;
			
		}

		if(s2==temp)
		{
			System.out.println("Armstrong number equal "+s2+"<=s2 , User Input=>"+temp);
		}
		else
		{
			System.out.println("Armstrong number Not Equal "+s2+"<=s2 , User Input=>"+temp);
		}

	}

}
