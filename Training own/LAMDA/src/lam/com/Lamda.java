package lam.com;

interface Lamda1{

	public void sum();

}

public class Lamda {

	
	public static void main(String[] args) {
		 
		 Lamda1 l2=()->{
			System.out.println("Sample");
		 };
	      l2.sum();
		
	}

}
