package program.com;

public class ResortBooking {

	int adult=0;         int children=0;
	int adperday=2;      int chdollar=1;
	int addollar=1;
	public void adult(int adult)
	{
		if(adult>0)
		{
		    addollar=adult*adperday*1000;
		     System.out.println(addollar);
		}
		else
		{
			System.out.println("Invalid input for number of adults");
		}
		
	}
	public void child(int children)
	{
		if(children>0)
		{
			chdollar=children*adperday*650;
		     System.out.println(chdollar);
		}
	}
	
	
	public static void main(String[] args) {
		ResortBooking r1=new ResortBooking();
		r1.adult(2);
		r1.child(2);
	}

}
